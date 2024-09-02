import java.util.Random;
import java.util.Scanner;

public class testST {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r= new Random();
        System.out.print("Nhap so sv trong lop:");
        int n=input.nextInt();
        Student[] students=new Student[n];
        double sum=0;
        int lc;
        for (int i=0;i<n;i++)
        {
            students[i]=new Student();
            do
            {
                lc=r.nextInt(3)+1;
            } while (i==0 && lc==3);
            if (lc==1){
                students[i].lamBaithi();
                sum+=students[i].get_diemThi();
                System.out.println("1 " + students[i].get_diemThi());
            }
            if (lc==2){
                long seed=r.nextLong();
                students[i].lamBaithi(seed);
                sum+=students[i].get_diemThi();
                System.out.println("2 " + students[i].get_diemThi());
            }
            if (lc==3){
                students[i].lamBaithi(students[i-1]);
                sum+=students[i].get_diemThi();
                System.out.println("3 " + students[i].get_diemThi());
            }
        }
        System.out.println("Tong diem thi: "+ sum);
        input.close();
    }
}
