import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Person> plist = new ArrayList<Person>();
        Person p1 = new Person();
        p1.setName("kc");
        p1.setAge(19);
        Person p2 = new Person();
        p2.setName("hd");
        p2.setAge(20);
        Person p3 = new Person();
        p3.setName("con gai");
        p3.setAge(2);
        Person p4 = new Person();
        p4.setName("con trai");
        p4.setAge(4);

        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);
        
        System.out.println("Chua sap xep: ");
        for (Person p : plist)
        {
            System.out.println(p.getName() + " " + p.getAge());
        }

        // Collections.sort(plist, new ageComparator1());
        Collections.sort(plist,new ageComparator2());
        Collections.sort(plist, new Comparator<Person>() {
            public int compare(Person p1, Person p2)
            {
                if (p1.getAge() < p2.getAge()) return 1;
                else if (p1.getAge() > p2.getAge()) return -1;
                else return 0;
            }
        });

        System.out.println("Da sap xep: ");
        for (Person p : plist)
        {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
