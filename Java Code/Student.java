import java.util.Random;

public class Student {
    public static int student_count=0;
    Random r=new Random();
    private String name;
    private int year;
    private double diemThi;
    public Student(String name, int year){
        this.name=name;
        this.year=year;
        this.diemThi=0;
        student_count++;
    }
    
    public Student() {
        this.diemThi=0;
        student_count++;
    }
    public double get_diemThi()
    {
        return this.diemThi;
    }
    public void inDiemThi()
    {
        System.out.print(this.diemThi);
    }
    public void lamBaithi()
    {
        this.diemThi=10 * (r.nextDouble());
    }
    public void lamBaithi(long seed)
    {
        Random r_seed=new Random(seed);
        this.diemThi=10 * (r_seed.nextDouble());
    }
    public void lamBaithi(Student banKeBen)
    {
        this.diemThi= 0.5*banKeBen.get_diemThi() + 0.5*10*r.nextDouble();
    }
    public String get_name(){
        return this.name;
    }
    public int get_year(){
        return this.year;
    }
    public void set_name(String name){
        this.name=name;
    }
    public void set_year(int year){
        this.year=year;
    }
}