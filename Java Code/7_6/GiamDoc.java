public class GiamDoc extends NhanVien implements QuanLy {
    private double phuCap;
    public static double loiNhuanCongTy;
    public GiamDoc()
    {
        this("No Name", 0,0,0);
    }
    public GiamDoc(String name, double heSoLuong, double phuCap, double loiNhuanCongTy)
    {
        this.tenNhanVien = name;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
        GiamDoc.loiNhuanCongTy = loiNhuanCongTy;
    }
    public double tinhHoaHong()
    {
        return GiamDoc.loiNhuanCongTy * 5 / 100;
    }
    public double tinhLuong()
    {
        return super.tinhLuong() + this.phuCap + this.tinhHoaHong();
    }
    public void inTTin()
    {
        System.out.println("Ten Giam Doc: "+this.tenNhanVien);
        System.out.println("Luong giam doc: "+this.tinhLuong());
    }
}
