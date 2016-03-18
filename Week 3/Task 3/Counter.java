class Counter
{
    private Integer count;

    public Counter()
    {
        this.count = 0;
    }

    public void increment()
    {
        this.count++;
    }

    public void decrement()
    {
        if (count > 0)
            this.count--;
    }

    public void reset()
    {
        this.count = 0;
    }

    public Integer getCount()
    {
        return this.count;
    }

    public void print()
    {
        System.out.print(this.count);
    }

    public void println()
    {
        System.out.println(this.count);
    }

    public String toString()
    {
        return this.count.toString();
    }

    public boolean equals(Counter compare)
    {
        return this.count == compare.getCount();
    }
}
