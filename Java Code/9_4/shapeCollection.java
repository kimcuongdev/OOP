import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class shapeCollection {
    private ArrayList<Shape2D> myCollection;
    public shapeCollection()
    {
        this.myCollection = new ArrayList<Shape2D>();
    }
    public shapeCollection(ArrayList<Shape2D> myCollection)
    {
        this.myCollection = myCollection;
    }
    public void addShape(Shape2D h)
    {
        this.myCollection.add(h);
    }
    public void sortShape()
    {
        Collections.sort(myCollection, new sizeComparator());
    }
    public void print()
    {
        for (Iterator<Shape2D> i = myCollection.iterator();i.hasNext();)
        {
            System.out.println(i.next().tinhDienTich());
        }
    }
}
