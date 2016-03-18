class Triangle
{
    private Integer width;

    public Triangle(Integer width)
    {
        this.width = width;
    }

    public Triangle()
    {
        this(3);
    }

    public void setWidth(Integer width)
    {
        this.width = width;
    }

    public Integer getWidth()
    {
        return this.width;
    }

    public void print()
    {
        for (int i = 0; i < width; i++)
        {
            for (int ii = 0; i < width; ii++)
                System.out.print('*');
            System.out.println("");
        }
    }
}
