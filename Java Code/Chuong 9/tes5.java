import java.util.ArrayList;

public class tes5 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Person());
        objects.add(new Dog());
        objects.add(new Fish());
        objects.add(new Snake());
        objects.add(new Integer(12));
        Person p = (Person)objects.get(0);
        Fish f = (Fish)objects.get(2);
        Animal a = (Animal)objects.get(3); //snake
        // Animal b = (Animal)objects.get(4); //loi
    }
}
