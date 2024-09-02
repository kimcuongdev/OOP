//lop tong quat
public class test1 {
    public static void main(String[] args) {
        Information<Integer> infor1 = new Information<Integer>(2012);
        System.out.println(infor1.getValue());

        Information<String> infor2 = new Information<String>("Fred");
        System.out.println(infor2.getValue());

        Information<Integer> infor3 = new Information<>(2029);
        System.out.println(infor3.getValue());

        Information<Integer> infor4 = new Information<Integer>(2025);
        
        Information<String> infor5 = new Information<String>("Ten", 2);
        infor5.add("Nguyen Kim Cuong");
        infor5.add("Nguyen Huong Diu");
        infor5.print();
    }
}
