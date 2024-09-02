import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        dataCatch dc = new dataCatch();
        try
        {
            for (int i = 0; i<6;i++)
            {
                String x = inp.nextLine();
                System.out.println(dc.getAverage(x));
            }     
        }
        catch (myException e)
        {
            System.out.println(e.getMessage());
        }
        inp.close();
    }
}
