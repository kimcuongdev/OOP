import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * bt2_2
 */
public class bt2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int n;
        int bd;
        int kt;
        System.out.println("Nhap so phan tu:");
        n=input.nextInt();
        int[] a=new int[n];
        do
        {
            do
            { 
                System.out.println("Nhap lua chon:");
                System.out.println("1.Nhap day tu ban phim");
                System.out.println("2.Random day");
                bd=input.nextInt();
            }while(bd!=1 && bd!=2);
            if (bd==1)
            {
                for (int i=0;i<n;i++)
                {
                    a[i]=input.nextInt();
                }
                Arrays.sort(a);
                for (int i=0;i<n;i++)
                {
                    System.out.print(a[i]+" ");
                }
            }
            else
            {
                for (int i=0;i<n;i++){
                    a[i]=random.nextInt(n);
                }
                System.out.println("Day ban dau: ");
                for (int i=0;i<n;i++){
                    System.out.print(a[i]+" ");
                }
                Arrays.sort(a);
                System.out.println("\nDay da sap xep: ");
                for (int i=0;i<n;i++){
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println("\nTiep tuc: 1/0");
            kt=input.nextInt();
        } while (kt==1);
        input.close();
    }
}