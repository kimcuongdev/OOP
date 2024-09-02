
import java.util.Stack;
public class PhongBan {
    private String tenPhongBan;
    private int soNhanVien;
    public final int SO_NV_MAX = 100;
    Stack<NhanVien> ds_NhanVien;
    public PhongBan(String tenPhongBan)
    {
        this.tenPhongBan=tenPhongBan;
        this.soNhanVien=0;
        this.ds_NhanVien=new Stack<>();
    }
    public PhongBan()
    {
        this("No Name");
    }
    public boolean themNV(NhanVien nhanVien)
    {
        if (this.soNhanVien < this.SO_NV_MAX)
        {
            ds_NhanVien.push(nhanVien);
            soNhanVien++;
            System.out.println("Them thanh cong");
            return true;
        }
        else 
        {
            System.out.println("Them khong thanh cong");
            return false;
        }
    }
    public NhanVien xoaNV()
    {
        if (!ds_NhanVien.empty())
        {
            System.out.println("Xoa thanh cong");
            soNhanVien--;
            return ds_NhanVien.pop();
        }
        else
        {
            System.out.println("Danh sach rong, ko the xoa");
            return null;
        }
    }
    public double tinhTongLuong()
    {
        double sum=0;
        for (NhanVien nv : ds_NhanVien)
        {
            sum+=nv.tinhLuong();
        }
        return sum;
    }
    public void inThongTin()
    {
        System.out.println("Ten phong ban: "+tenPhongBan);
        System.out.println("So nhan vien: "+soNhanVien);
        if (!ds_NhanVien.empty())
        {
            System.out.println("Danh sach nhan vien: ");
            for (NhanVien nv : ds_NhanVien)
            {
                nv.inThongTin();
            }
        }
        else
        {
            System.out.println("Danh sach nhan vien rong");
        }
    }
}
