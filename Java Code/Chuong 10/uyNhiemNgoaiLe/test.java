package uyNhiemNgoaiLe;

public class test {
    public static int pram(int p) throws ArithmeticException 
    {
        if(p < 10) throw new ArithmeticException("be qua");
        else return p;
    }
    public static void main(String[] args) {
        try {
            int a = pram(4);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
