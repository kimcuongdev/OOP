import java.util.Scanner;

public class bt2_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Nhap 3<=n<=8: " );
            n=input.nextInt();
        } while (n>8 || n<3);
        int st=1;
        int[][] a=new int[n+2][n+2];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                a[i][j]=0;
            }
        }
        for (int i=0;i<n+2;i++){
            a[0][i]=-1;
            a[i][0]=-1;
            a[i][n+1]=-1;
            a[n+1][i]=-1;
        }
        int r=1,c=1;
        while(true)
        {
            a[r][c]=st;
            st++;
            if (a[r][c+1]!=0 && a[r+1][c]==0) r++;
            else if (a[r+1][c]!=0 && a[r][c-1]==0) c--;
            else if (a[r][c-1]!=0 && a[r-1][c]==0)  r--;
            else if (a[r-1][c]!=0 && a[r][c+1]==0) c++;
            if (st==n*n+1) break;
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(a[i][j]+" ");
                if(a[i][j] < 10) System.out.print(" ");
            }
            System.out.print("\n");
        }
        input.close();
    }
}