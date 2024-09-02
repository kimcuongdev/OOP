public class CanBoQuanLy extends NhanVien implements QuanLy {
    public CanBoQuanLy()
    {
        super();
    }
    public CanBoQuanLy(String tenNhanVien, double heSoLuong)
    {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }
    public double tinhHoaHong()
    {
        return GiamDoc.loiNhuanCongTy * 0.2 / 100;
    }
    public double tinhLuong()
    {
        return super.tinhLuong() + this.tinhHoaHong();
    }
    public void inTTin()
    {
        System.out.println("Ten can bo quan ly: "+this.tenNhanVien);
        System.out.println("Luong can bo quan ly: "+this.tinhLuong());
    }
}
