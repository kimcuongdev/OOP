public class overloading1 {
    static void prt(String s)
    {
        System.out.println(s);
    }
    static void f1(char x)
    {
        prt("f1(char)");
    }
    static void f1(byte x)
    {
        prt("f1(byte)");
    }
    static void f1(short x)
    {
        prt("f1(short)");
    }
    static void f1(int x)
    {
        prt("f1(int)");
    }
    static void f1(long x)
    {
        prt("f1(long)");
    }
    static void f1(float x)
    {
        prt("f1(float)");
    }
    static void f1(double x)
    {
        prt("f1(double)");
    }
    static void f2(float x)
    {
        prt("f2(float)");
    }
    public static void main(String[] args) {
        f1(5);
        f1('a');
        byte y = 0;f1(y);
        float z = 5.5f; f1(z);
        f1(5.5);
        f1(5.5f);
        f2(5.5);
    }
}
