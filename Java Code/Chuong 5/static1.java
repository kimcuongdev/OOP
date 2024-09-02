
public class static1 {
    public static void main(String[] args) {
        testStatic obj1 = new testStatic();
        System.out.println(obj1.iStatic + " " + obj1.iNonStatic);
        obj1.iStatic = 10; obj1.iNonStatic = 11;
        System.out.println(obj1.iStatic + " " + obj1.iNonStatic);

        testStatic obj2 = new testStatic();
        System.out.println(obj2.iStatic + " " + obj2.iNonStatic);
        obj2.iStatic = 11; obj2.iNonStatic = 12;
        System.out.println(obj2.iStatic + " " + obj2.iNonStatic);

        System.out.println(testStatic.iStatic);
    }
}
