import java.util.Comparator;

public class sizeComparator implements Comparator {
    public int compare(Object h1, Object h2)
    {
        if (((Shape2D)h1).tinhDienTich() > ((Shape2D)h2).tinhDienTich()) return 1;
        else if (((Shape2D)h1).tinhDienTich() < ((Shape2D)h2).tinhDienTich()) return -1;
        else return 0;
    }
}
