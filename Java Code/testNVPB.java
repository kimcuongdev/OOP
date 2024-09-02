public class testNVPB {
    public static void main(String[] args) {
        NhanVien nv1=new NhanVien("Tam",1);
        NhanVien nv2=new NhanVien("Thang", 1);
        NhanVien nv3=new NhanVien("Ngoc", 1);
        NhanVien nv4=new NhanVien("Son", 1);
        NhanVien nv5=new NhanVien("Cuong", 1);
        NhanVien nv6=new NhanVien("Dao Cuong", 1);
        PhongBan pb=new PhongBan("Global Ban");
        pb.themNV(nv1);
        pb.themNV(nv2);
        pb.themNV(nv3);
        pb.inTTin();
        pb.xoaNV();
        pb.xoaNV();
        pb.xoaNV();
        pb.xoaNV();
        pb.inTTin();
    }
}
