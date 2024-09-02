/**
 * d7e70c
 */
public class d7e70c {
    public static void main(String[] args) {
        System.out.println("begin");
        try {
            int i = 5/0;
            System.out.println("Try");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("catch");
        } finally{
            System.out.println("finally");
        }
        System.out.println("end");
    }
}