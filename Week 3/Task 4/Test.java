class Test
{
    public static void print(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String [] args)
    {
        Money m1 = new Money(30, 40);
        Money m2 = new Money(0, 780);

        print("Value of m1 and m2");
        print(m1);
        print(m2);

        print("m3 = m1 + m2");
        Money m3 = Money.add(m1, m2);
        print(m3);

        print("m4 = m3 - m1");
        Money m4 = Money.minus(m3, m1);
        print(m4);

        Money m5 = new Money(80, 420);
        print("Value of m5");
        print(m5);

        print("m5 -= m4");
        m5 = m5.minus(m4);
        print(m5);

        Money m6 = new Money(76, 40);
        print("m5 == m6");
        print(m5.equals(m6));

        print("m5 += m4");
        m5 = m5.add(m4);
        print(m5);
    }
}
