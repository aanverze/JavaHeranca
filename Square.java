public class Square extends Rectangle
{
    private double side;

    public Square(String color, boolean filled, int i, double side)
    {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide()
    {
        return this.side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length)
    {

        super(color, filled, width, length);

        setLength(getLength());
        setWidth(getWidth());
    }

    public String toString()
    {
        return super.toString();
    }


}