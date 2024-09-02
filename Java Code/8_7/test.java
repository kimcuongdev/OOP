public class test {
    public static void main(String[] args) {
        NhanVienCoHuu nvch1 = new NhanVienCoHuu("Cuong1",3);
        NhanVienHopDong nvhd1 = new NhanVienHopDong("Cuong2",5);
        TruongPhong tp1 = new TruongPhong("Cuong3", 5, 5,5);
        PhongBan pb = new PhongBan("Global Ban");
        pb.themNV(tp1);
        pb.themNV(nvch1);
        pb.themNV(nvhd1);
        System.out.println(pb.tinhTongLuong());
        System.out.println(nvch1.tinhLuong());
        System.out.println(nvhd1.tinhLuong());
        System.out.println(tp1.tinhLuong());
    }
}
