public class Trapezoid extends Shape2D{
    private double a;
    private double b;
    private double h;
    public Trapezoid(double a, double b, double h)
    {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public double tinhDienTich()
    {
        return ((this.a + this.b)*this.h)/2;
    }
}
