public class NhanVien {
    protected String tenNhanVien;
    protected double heSoLuong;
    public final double LUONG_CO_BAN = 750000;
    public final double LUONG_MAX = 20000000;
    public NhanVien()
    {
        this("No Name",0);
    }
    public NhanVien(String tenNhanVien, double heSoLuong)
    {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }
    public boolean tangLuong(double k)
    {
        if (this.LUONG_CO_BAN * (this.heSoLuong +k) <= this.LUONG_MAX)
        {
            this.heSoLuong += k;
            return true;
        } 
        else return false;
    }
    public double tinhLuong()
    {
        return this.LUONG_CO_BAN * this.heSoLuong;
    }
    public void inTTin()
    {
        System.out.println(this.tenNhanVien);
        System.out.println("Luong nhan vien: "+this.tinhLuong());
    }
}