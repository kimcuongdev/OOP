public class NhanVienHopDong extends NhanVien {
    private double luongHopDong;
    public NhanVienHopDong()
    {
        this("No Name",0);
    }
    public NhanVienHopDong(String tenNhanVien, double luongHopDong)
    {
        this.tenNhanVien = tenNhanVien;
        this.luongHopDong = luongHopDong;
    }
    public double tinhLuong()
    {
        return this.luongHopDong;
    }
    public void inThongTin()
    {
        System.out.println("Ten Nhan Vien Hop Dong: "+this.tenNhanVien);
        System.out.println("Luong nhan vien hop dong: "+this.tinhLuong());
    }
}
