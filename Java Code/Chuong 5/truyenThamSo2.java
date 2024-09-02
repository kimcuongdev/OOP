public class truyenThamSo2 {
    public static void change1(Student std)
    {
        std.setYear(2020);
    }
    public static void change2(Student std)
    {
        std = new Student("DIU", 2006);
    }
    public static void main(String[] args) {
        Student std = new Student("Diu", 2004);
        System.out.println(std.getYear());
        change1(std);
        System.out.println(std.getYear());
        Student std1 = new Student("KC", 2004);
        System.out.println(std1.getYear());
        change2(std1);
        System.out.println(std1.getYear());
    }
}
