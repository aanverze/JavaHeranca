public class Rectangle extends Shape
{
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double length, double width)
    {
        super(color, filled);
        this.length = length;
        this.width = width;

        setLength(length);
        setWidth(width);

    }

    public double getWidth()
    {
        return this.width;
    }

    public double setWidth(double width)
    {
        this.width = width;
        return width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }


    public double getArea()
    {
        return this.width * this.length;
    }
    public double getPerimeter()
    {
        return (this.length + this.width) * 2;
    }

    public String toString()
    {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

}