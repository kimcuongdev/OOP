package q062b84;

public class Employee extends Person {
    private void print1() {
        System.out.println(name);
    } 
    protected void print2() {
        System.out.println("Name: " + name.toUpperCase());
    } 
    String print3() {
        return "Name: " + name.toLowerCase();
    }
}
