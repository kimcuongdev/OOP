package tuTaoNgoaiLe;

public class test {
    public static int div(int a, int b) throws Exception
    {
        if (a == 1) throw new myException("lay 1 de chia");
        else return a/b;
    }
    public static void main(String[] args) {
        try {
            int a = div(1, 2);
            int b = div(2, 0);
        } catch (myException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
