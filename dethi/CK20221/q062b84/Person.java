package q062b84;

public class Person {
    protected String name;
    private String print1() {
        return name;
    } 
    protected String print2() {
        return name.toUpperCase();
    } 
    protected String print3() {
        return name.toLowerCase();
    }
}
