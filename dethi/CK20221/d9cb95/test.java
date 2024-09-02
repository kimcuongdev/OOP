package d9cb95;

public class test {
    public static void main(String[] args) {
        Person p1 = new Manager();
        Employee e = (Employee)p1;
        Person p2 = new Employee();
        Manager m = (Manager)p2;
    }
}
