public class test {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        Integer c = a;
        int d = 10;
        double e = 10.0;
        System.out.println(a==c);
        System.out.println(b==d);
        System.out.println(b==c);
        System.out.println(d==e);
        System.out.println(a==b);
        System.out.println(d==10.0);
    }
}
