public class test {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("NV Cuong",2);
        GiamDoc gd1 = new GiamDoc("GD Cuong", 1, 750000, 10000000);
        CanBoQuanLy ql1= new CanBoQuanLy("QL Cuong", 2);
        nv1.inTTin();
        gd1.inTTin();
        ql1.inTTin();
    }
}
