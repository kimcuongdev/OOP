public class TruongPhong extends NhanVienCoHuu {
    private double phuCap;
    private int soNamDuongChuc;
    public TruongPhong()
    {
        this("No Name",0,0,0);
    }
    public TruongPhong(String tenNhanVien, int year,double heSoLuong, double phuCap)
    {
        this.heSoLuong = heSoLuong;
        this.tenNhanVien = tenNhanVien;
        this.soNamDuongChuc = year;
        this.phuCap = phuCap;
    }
    public double tinhLuong()
    {
        return this.luongCoBan * this.heSoLuong + this.phuCap;
    }
    public void inThongTin()
    {
        System.out.println("Ten Truong Phong: "+this.tenNhanVien);
        System.out.println("So Nam Duong Chuc: "+this.soNamDuongChuc);
        System.out.println("Luong truong phong: "+this.tinhLuong());
    }
}