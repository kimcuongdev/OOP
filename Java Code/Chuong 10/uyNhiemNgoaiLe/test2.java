package uyNhiemNgoaiLe;

public class test2 {
    public static int division(int a, int b) throws ArithmeticException
    {
        if (b==0) throw new ArithmeticException("chia cho 0");
        else return a/b;
    }
    public static void main(String[] args) {
        // try {
        //     int num = division(9, 3);
        //     System.out.println(num);
        //     int num2 = division(4, 0);
        //     System.out.println(num2);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }
            int num = division(9, 3);
            System.out.println(num);
            int num2 = division(4, 0);
            System.out.println(num2);
    }
}
