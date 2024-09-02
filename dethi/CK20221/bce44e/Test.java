package bce44e;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(16, "Huy");
        System.out.print(e2.age + " " + e2.name);
    }
}
