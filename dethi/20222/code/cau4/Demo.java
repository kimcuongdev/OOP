package cau4;

public class Demo {
    static int methodReturningValue()
    {
        try
        {
            int i = Integer.parseInt("abc");
            return 20;
        }
        finally
        {
            return 50;
        }
    }
    public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }
}
