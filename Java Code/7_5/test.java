public class test {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Cuong",1);
        nv1.tangLuong(2);
        nv1.tinhLuong();
        nv1.inTTin();
        nv1.tangLuong(1000);
        nv1.inTTin();
        NhanVien nv2 = new TruongPhong("Cuong",1,700000,2);
        nv2.inTTin();
    }
}
