package $0370d2;

public class Test {
    static void method(A a) {
        System.out.println("Method A");
    } 
    static void method(B b) {
        System.out.println("Method B");
    } 
    static void method(Object obj) {
        System.out.println("Method C");
    } 
    public static void main(String[] ss) {
        C c = new C();
        method(c);
    }
}
