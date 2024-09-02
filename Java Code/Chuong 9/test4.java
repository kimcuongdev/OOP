import java.util.ArrayList;
import java.util.Iterator;

public class test4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("bob");
        names.add(0,"ann");
        names.remove(1);
        names.add("cal");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
        for (String  name : names)
        {
            System.out.println(name);
        }
    }
}
