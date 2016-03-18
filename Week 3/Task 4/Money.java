class Money
{
    private Integer dollars;
    private Integer cents;

    public Money(int dollars, int cents)
    {
        if (cents > 100)
        {
            this.dollars = dollars + (cents / 100);
            this.cents = cents % 100;
        }
        else
        {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    public Money(int cents)
    {
        this(0, cents);
    }

    public Money()
    {
        this(0, 0);
    }

    public void setDollars(Integer dollars)
    {
        this.dollars = dollars;
    }

    public Integer getDollars()
    {
        return this.dollars;
    }

    public void setCents(Integer cents)
    {
        if (cents > 100)
        {
            this.dollars += cents / 100;
            this.cents = cents % 100;
        }
        else
        {
            this.cents = cents;
        }
    }

    public Integer getCents()
    {
        return this.cents;
    }

    public Integer getValue()
    {
        return (this.dollars * 100) + this.cents;
    }

    public static boolean more(Money m1, Money m2)
    {
        if (m1.getDollars() == m2.getDollars())
        {
            return m1.getCents() > m2.getCents();
        }
        else
        {
            return m1.getDollars() > m2.getDollars();
        }
    }

    public static Money add(Money m1, Money m2)
    {
        return new Money(m1.getDollars() + m2.getDollars(), m1.getCents() + m2.getCents());
    }

    public static Money minus(Money m1, Money m2)
    {
        Integer val1 = m1.getValue();
        Integer val2 = m2.getValue();
        if (val1 > val2)
            return new Money(val1 - val2);
        else
            return new Money(val2 - val1);
    }

    public Money add(Money m1)
    {
        return this.add(this, m1);
    }

    public Money minus(Money m1)
    {
        return this.minus(this, m1);
    }

    public boolean equals(Money compare)
    {
        return dollars == compare.getDollars() && cents == compare.getCents();
    }

    public String toString()
    {
        return new String("$" + this.dollars + "." + this.cents);
    }
}
