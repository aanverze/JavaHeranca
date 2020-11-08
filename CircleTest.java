public class CircleTest
{
    public static void main(String[] args)
    {
        Circle Circle = new Circle(
                "Blue", true, 1.0
        );

        System.out.println("Color: " + Circle.getColor());
        System.out.println("Filled: " + Circle.isFilled());
        System.out.println("Radius: " + Circle.getRadius());
        System.out.println("Area: " + Circle.getArea());
        System.out.println("Perimeter: " + Circle.getPerimeter());
    }
}