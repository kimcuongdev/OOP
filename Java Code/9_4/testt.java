import java.util.ArrayList;
import java.util.List;

public class testt {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("foo");
        list.add(new Integer(0));
        Integer foo = (Integer)list.get(0);
    }
}
