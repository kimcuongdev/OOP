import java.util.Comparator;

public class ageComparator1 implements Comparator {
    public int compare(Object obj1, Object obj2)
    {
        int obj1Age = ((Person)obj1).getAge();
        int obj2Age = ((Person)obj2).getAge();
        if (obj1Age > obj2Age) return 1;
        else if (obj1Age < obj2Age) return -1;
        else return 0;
    }
}
