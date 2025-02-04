public class Circle extends Shape {
    protected double radius;
    public Circle()
    {
        this.radius = 0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return this.radius * this.radius * 3.14;
    }
    public double getPerimeter()
    {
        return 2 * this.radius * 3.14;
    }
    public String toString()
    {
        return this.toString();
    }
}
