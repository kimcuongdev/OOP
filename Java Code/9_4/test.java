public class test {
    public static void main(String[] args) {
        Circle ht = new Circle(3);
        Rectangle hcn = new Rectangle(1,2);
        Trapezoid hth = new Trapezoid(1,2,3);
        Triangle htg = new Triangle(1, 2);
        Polygon dg = new Polygon(15);
        shapeCollection mycollect = new shapeCollection();
        mycollect.addShape(ht);
        mycollect.addShape(hcn);
        mycollect.addShape(hth);
        mycollect.addShape(htg);
        mycollect.addShape(dg);
        mycollect.sortShape();
        mycollect.print();
    }
}
