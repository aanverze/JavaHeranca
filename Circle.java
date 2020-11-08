public class Circle extends Shape
{
    private double radius;

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI  * (this.radius * this.radius);
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    public String toString()
    {
        return "Circle{" + "radius=" + radius + '}';
    }
}