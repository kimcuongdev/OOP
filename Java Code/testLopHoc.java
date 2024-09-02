import java.util.Scanner;

public class testLopHoc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int kt;
        do
        {
            int lc1,lc2,end;
            do
            {
                System.out.println("1. Khoi tao co tham so");
                System.out.println("2. Khoi tao ko tham so");
                lc1=input.nextInt();
            } while (lc1 < 1 || lc1 >2);
            if (lc1 == 1)
            {
                System.out.println("Nhap vao so sinh vien: ");
                int studentsCount=input.nextInt();
                lopHoc lp = new lopHoc(studentsCount);
                lp.lamBaithi();
                do
                {
                    do
                    {
                        System.out.println("1. In danh sach sinh vien theo diem");
                        System.out.println("2. In danh sach sinh vien theo nam");
                        lc2=input.nextInt();
                    } while (lc2<1 || lc2>2);
                    if (lc2 == 1)
                    {
                        lp.scorePrint();
                    }
                    if (lc2 == 2)
                    {
                        lp.yearPrint();
                    }
                    System.out.println("Ket thuc in ? 1/0");
                    end=input.nextInt();
                } while(end == 0);
            }
            if (lc1 == 2)
            {
                lopHoc lp = new lopHoc();
                lp.lamBaithi();
                do
                {
                    do
                    {
                        System.out.println("1. In danh sach sinh vien theo diem");
                        System.out.println("2. In danh sach sinh vien theo nam");
                        lc2=input.nextInt();
                    } while (lc2<1 || lc2>2);
                    if (lc2 == 1)
                    {
                        lp.scorePrint();
                    }
                    if (lc2 == 2)
                    {
                        lp.yearPrint();
                    }
                    System.out.println("Ket thuc in ? 1/0");
                    end=input.nextInt();
                } while(end == 0);
            }
            System.out.println("Ket thuc testLopHoc ? 1/0");
            kt=input.nextInt();
        } while (kt == 0);
        input.close();
    }
}
