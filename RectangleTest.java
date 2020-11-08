public class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle Rectangle = new Rectangle(
                "Orange", true, 5, 10
        );

        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Filled: " + Rectangle.isFilled());
        System.out.println("Width: " + Rectangle.getWidth());
        System.out.println("Length: " + Rectangle.getLength());
        System.out.println("Area: " + Rectangle.getArea());
        System.out.println("Perimeter: " + Rectangle.getPerimeter());
    }
}