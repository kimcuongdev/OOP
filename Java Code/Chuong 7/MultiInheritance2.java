public class MultiInheritance2 extends Parent  implements Interface3 {
    // public static void test()
    // {
    //     Interface3.test();
    // } 
    public static void main(String[] args) {
        MultiInheritance2 m = new MultiInheritance2();
        
        // m.doSomething();
        // m.test();
        MultiInheritance2.test();
        // Interface3.test();
    }
}
