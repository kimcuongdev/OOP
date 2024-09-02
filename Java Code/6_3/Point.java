import java.lang.Math;
public class Point {
    private double x;
    private double y;
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point()
    {
        this(0.0 , 0.0);
    }
    public double get_x()
    {
        return this.x;
    }
    public double get_y()
    {
        return this.y;
    }
    public void rotate(double angle)
    {
        this.x = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        this.y = this.x * Math.sin(angle) + this.y * Math.cos(angle);
    }
    public void scale(double factor)
    {
        this.x = this.x * factor;
        this.y = this.y * factor;
    }
}
