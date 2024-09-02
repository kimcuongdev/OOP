public class Polygon {
    protected int number_of_point;
    protected Point[] point_list;
    protected GraphicsBundle bundle;
    public Polygon(Point[] point_list, GraphicsBundle bundle)
    {
        this.number_of_point = point_list.length;
        this.point_list = new Point[number_of_point];
        for (int i=0;i<number_of_point;i++)
        {
            this.point_list[i] = point_list[i];
        }
        this.bundle = bundle;
    }
    public Polygon()
    {
        this.number_of_point = 0;
    }
}
