import java.util.Scanner;

public class testNV 
{
    public static void main(String[] args) {
        NhanVien nv1=new NhanVien();
        NhanVien nv2=new NhanVien();
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap du lieu cho nv1: ");

        System.out.print("Ten nhan vien: ");
        String name=input.nextLine();
        nv1.set_tenNhanVien(name);

        System.out.print("Luong co ban: ");
        double luongCoBan=input.nextDouble();
        nv1.set_luongCoBan(luongCoBan);

        System.out.print("Luong max: ");
        double LUONG_MAX=input.nextDouble();
        nv1.set_LUONG_MAX(LUONG_MAX);

        System.out.print("He so luong: ");
        double heSoLuong=input.nextDouble();
        nv1.set_heSoLuong(heSoLuong);

        System.out.println("Nhap du lieu cho nv2: ");
        input.nextLine();

        System.out.print("Ten nhan vien: ");
        name=input.nextLine();
        nv2.set_tenNhanVien(name);

        System.out.print("Luong co ban: ");
        luongCoBan=input.nextDouble();
        nv2.set_luongCoBan(luongCoBan);

        System.out.print("Luong max: ");
        LUONG_MAX=input.nextDouble();
        nv2.set_LUONG_MAX(LUONG_MAX);

        System.out.print("He so luong: ");
        heSoLuong=input.nextDouble();
        nv2.set_heSoLuong(heSoLuong);

        

        int kt,lc;
        double k1,k2;
        do
        {
            System.out.println("1.Hien thi thong tin");
            System.out.println("2.Hien thi luong");
            System.out.println("3.Tang luong");
            do
            {
                lc=input.nextInt();
            } while (lc<1 || lc>3);
            if (lc==1)
            {
                nv1.inTTin();
                nv2.inTTin();
            }
            if (lc==2)
            {
                System.out.println("Hien thi luong nv1:" + nv1.tinhLuong());
                System.out.println("Hien thi luong nv2:" + nv2.tinhLuong());
            }
            if (lc==3)
            {
                System.out.println("Nhap vao gia tri tang cho nv1: ");
                k1=input.nextDouble();
                nv1.tangLuong(k1);

                System.out.println("Nhap vao gia tri tang cho nv2: ");
                k2=input.nextDouble();
                nv2.tangLuong(k2);
            }

            System.out.println("Ket thuc ? 1/0");
            kt=input.nextInt();
        } while (kt==0);
        input.close();
    }
}
