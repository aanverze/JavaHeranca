public class SquareTest
{
    public static void main(String[] args)
    {
        Square Square = new Square
                ("Red", false, 5, 5);

        System.out.println("Color: " + Square.getColor());
        System.out.println("Filled: " + Square.isFilled());
        System.out.println("Width: " + Square.getWidth());
        System.out.println("Length: " + Square.getLength());

    }

}