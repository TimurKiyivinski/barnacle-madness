class Test
{

    public static void print(Object obj)
    {
        System.out.println(obj);
    }

    public static void printCounter(Counter counter)
    {
        print("Counter current value is: " + counter.toString());
    }

    public static void main(String [] args)
    {
        Counter counter = new Counter();
        printCounter(counter);

        print("Incrementing 20 times");
        for (int i = 0; i < 20; i++)
            counter.increment();
        printCounter(counter);

        print("Decrementing 40 times");
        for (int i = 0; i < 40; i++)
            counter.decrement();
        printCounter(counter);

        print("Incrementing 80 times");
        for (int i = 0; i < 80; i++)
            counter.increment();
        printCounter(counter);

        print("Printing with .print()");
        counter.print();

        print("Printing with .println()");
        counter.println();

        print("Resetting counter");
        counter.reset();

        System.out.print("Printing with .print() ");
        counter.print();

        print("\nPrinting with .println()");
        counter.println();

        print("Testing with new counter");
        Counter compare = new Counter();
        print("counter == compare: " + counter.equals(compare));

        print("Incementing compare");
        compare.increment();
        print("counter == compare: " + counter.equals(compare));
    }
}
