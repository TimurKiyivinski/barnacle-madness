class Test
{

    public static void printFraction(Fraction fraction)
    {
        System.out.print(fraction.getNumerator() + "/" + fraction.getDenominator());
    }

    public static void main(String [] args)
    {
        Fraction fraction = new Fraction(20, 60);
        printFraction(fraction.getValue());
    }
}
