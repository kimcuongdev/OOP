public class test11 {
    public static void main(String[] args) {
        Double x = new Double(10.0);
        Double y = new Double(10.0);
        Double z = x;
        int g = 10;
        double h = 10.0;
        System.out.println(y==g);
        System.out.println(g==h);
        System.out.println(x==y);
        System.out.println(y==z);
        System.out.println(x==z);
        System.out.println(g==10.0);
    }
}
