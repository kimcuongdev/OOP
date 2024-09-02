public class truyenThamSo1 {
    public static void swap(int var1, int var2)
    {
        int temp = var1;
        var1 = var2;
        var2 = temp;
    }
    public static void swap(int[] var)
    {
        int temp = var[0];
        var[0] = var[1];
        var[1] = temp;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        Integer aa = 7;
        Integer bb = 8;
        swap(a, b);
        swap(aa, bb);
        System.out.println(a+" "+b);
        System.out.println(aa + " " + bb);
    }
}
