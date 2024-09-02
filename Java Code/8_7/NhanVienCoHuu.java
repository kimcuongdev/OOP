public class NhanVienCoHuu extends NhanVien {
    protected final double luongCoBan = 0.7;
    protected double heSoLuong;
    public NhanVienCoHuu(String tenNhanVien, double heSoLuong)
    {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }
    public NhanVienCoHuu()
    {
        this("No name",0);
    }
    public double tinhLuong()
    {
        return this.luongCoBan * this.heSoLuong;
    }
    public boolean tangHeSoLuong(double k)
    {
        if ((this.luongCoBan * (this.heSoLuong+k)) <= this.LUONG_MAX)
        {
            this.heSoLuong+=k;
            return true;
        }
        else return false;
    }
    public void inThongTin()
    {
        System.out.println("ten Nhan Vien Co Huu: "+this.tenNhanVien);
        System.out.println("Luong cua Nhan Vien Co Huu: "+this.tinhLuong());
    }
}
