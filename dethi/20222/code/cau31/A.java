package cau31;

public class A {
    static {System.out.println("static");}
    {System.out.println("block");}
    public A()
    {
        System.out.println("A");
    }
    public static void main(String[] args) {
        A a = new A();
    }
}
