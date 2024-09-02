public class Triangle extends Shape2D{
    private double b;
    private double h;
    public Triangle(double b, double h)
    {
        this.b = b;
        this.h = h;
    }
    public double tinhDienTich()
    {
        return (this.b * this.h)/2;
    }
}
