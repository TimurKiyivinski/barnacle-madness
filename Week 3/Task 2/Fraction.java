class Fraction
{
    private Integer numerator;
    private Integer denominator;

    public Fraction(Integer numerator, Integer denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(double numerator, double denominator)
    {
        this.numerator = (int) numerator;
        this.denominator = (int) denominator;
    }

    public void setNumerator(Integer numerator)
    {
        this.numerator = numerator;
    }

    public Double getNumerator()
    {
        return this.numerator.doubleValue();
    }

    public void setDenominator(Integer denominator)
    {
        this.denominator = denominator;
    }

    public Double getDenominator()
    {
        return this.denominator.doubleValue();
    }

    public Fraction getValue()
    {
        int common = 0;
        for (int i = 1; i <= this.numerator; i++)
        {
            if (denominator % i == 0)
            {
                common = i;
            }
        }
        if (common == 0)
            return new Fraction(this.getNumerator(), this.getDenominator());
        else
            return new Fraction(this.getNumerator() / common, this.getDenominator() / common);
    }
}
