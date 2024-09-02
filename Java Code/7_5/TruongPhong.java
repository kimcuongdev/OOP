public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;
    public TruongPhong()
    {
        this("No name",0,0,0);
    }
    public TruongPhong(String tenTruongPhong, double heSoLuong, double phuCap, double soNamDuongChuc)
    {
        this.tenNhanVien = tenTruongPhong;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    public double tinhLuong()
    {
        return this.LUONG_CO_BAN * this.heSoLuong + this.phuCap;
    }
    public void inTTin()
    {
        System.out.println(this.tenNhanVien);
        System.out.println("So nam duong chuc: "+soNamDuongChuc);
        System.out.println("Luong truong phong: "+this.tinhLuong());
    }
}
