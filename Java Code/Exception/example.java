import java.util.Scanner;

public class example {
    public static double div(int a,int b) throws Exception
    {
        if (b==0)
        {
            throw new myException("ngu");
        }
        if (a<0)
        {
            throw new Exception("gaf");
        }
        else return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=0;
        try
        {
            c=div(a,b);
            System.out.println(c);
        }catch (myException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
