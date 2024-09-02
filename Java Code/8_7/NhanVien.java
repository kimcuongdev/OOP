abstract public class NhanVien {
    protected String tenNhanVien;
    public final double LUONG_MAX = 20000000;
    public NhanVien()
    {
        this("No Name");
    }
    public NhanVien(String name)
    {
        this.tenNhanVien=name;
    } 
    public String get_tenNhanVien()
    {
        return this.tenNhanVien;
    }
    public void set_tenNhanVien(String tenNhanVien)
    {
        this.tenNhanVien=tenNhanVien;
    }
    abstract public double tinhLuong();
    abstract public void inThongTin();
}
