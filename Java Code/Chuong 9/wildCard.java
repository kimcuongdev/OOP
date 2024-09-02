import java.util.ArrayList;

public class wildCard {
    // public static <T extends Object> void printList(ArrayList<T> myList)
    // {
    //     System.out.println("in myList");
    // }
    public static void printList(ArrayList<?> myList)
    {
        System.out.println("in myList");
    }
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        printList(dogList);
        ArrayList<Person> pList = new ArrayList<Person>();
        printList(pList);
    }
}
