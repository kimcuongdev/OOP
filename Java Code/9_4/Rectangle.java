public class Rectangle extends Shape2D{
    private double cd;
    private double cr;
    public Rectangle(double cd, double cr)
    {
        this.cd = cd;
        this.cr = cr;
    }
    public double tinhDienTich()
    {
        return this.cd * this.cr;
    }
}
