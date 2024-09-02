package bce44e;

public class Person {
    protected int age;
    protected String name;
    public Person() {
        System.out.print(age + " " + name + " ");
    } 
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
