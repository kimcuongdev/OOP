
public class bt3_2 {
    public static void main(String[] args) {
        vector v1=new vector(1, 2, 3);
        vector v2=new vector(4, 5, 6);
        vector v3=v1.add(v2);
        vector v4=v1.mul(4);
        vector v5=v1.sub(v2);
        double res=v1.pro(v2);
        v1.display();
        v2.display();
        v3.display();
        v4.display();
        v5.display();
        System.out.print(res);
    }
}