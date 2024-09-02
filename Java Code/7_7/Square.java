public class Square extends Rectangle {
    public Square()
    {
        this(0);
    }
    public Square(double side)
    {
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }
    public double getSide()
    {
        return this.length;
    }
    public void setWidth(double side)
    {
        this.width = side;
        this.length = side;
    }
    public void setLength(double side)
    {
        this.width = side;
        this.length = side;
    }
    public String toString()
    {
        return this.toString();
    }
}
