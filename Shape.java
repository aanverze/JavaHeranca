public class Shape
{
    private String color;
    private boolean filled;

    public Shape (String color, boolean filled)
    {
       this.color = color;
       this.filled = filled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public String toString()
    {
        return this.color + "," + this.filled;
    }
}