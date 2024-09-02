package xuLyNgoaiLe;

/**
 * chiaCho0Demo
 */
public class chiaCho0Demo {
    public static int division(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        try {
            int num = division(4, 0);
        } catch (Exception e) {
            // TODO: handle exception
            // System.err.println("co loi xay ra: " + e.toString());
            System.err.println("co loi da xay ra: " + e.getMessage());
            e.printStackTrace();
        }
    }
}