import java.util.Scanner;

public class bt2_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int h;
        do
        {
            System.out.print("Nhap chieu cao h = ");
            h=input.nextInt();
            if (h<2 || h>10) System.out.println("Moi nhap lai!!");
        } while (h<2 || h>10);
        for (int i=1;i<=h;i++){
            for (int j=1;j<=h-i;j++){
                System.out.print(" ");
            }
            for (int q=h-i+1;q<=h-i+1+2*i-2;q++){
                System.out.print("*");
            }
            for (int k=h+i-1;k<2*h-1;k++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        input.close();
    }
}
