public class Circle extends Shape2D {
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double tinhDienTich()
    {
        return 3.14 * this.radius * this.radius;
    }
}
