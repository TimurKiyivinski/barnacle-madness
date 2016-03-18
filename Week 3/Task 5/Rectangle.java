class Rectangle
{
    private Integer width;
    private Integer height;

    public Rectangle(Integer width, Integer height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle()
    {
        this(3, 3);
    }

    public void setWidth(Integer width)
    {
        this.width = width;
    }

    public Integer getWidth()
    {
        return this.width;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }
    
    public Integer getHeight()
    {
        return this.height;
    }

    public void print()
    {
        for (int i = 0; i < height; i++)
        {
            for (int ii = 0; i < width; ii++)
                System.out.print('*');
            System.out.println("");
        }
    }
}
