public class testST5_4 {
    public static void fun(Student ... students_list)
    {
        double sum=0;
        double avg=0;
        for (Student i : students_list)
        {
            sum+=i.get_diemThi();
        }
        avg=sum/(students_list.length);
        System.out.println("Tong diem thi: "+ sum);
        System.out.println("Diem thi trung binh: "+avg);
    }
    public static void main(String[] args) 
    {
        Student student1=new Student();
        student1.lamBaithi();
        Student student2=new Student();
        student2.lamBaithi();
        Student student3=new Student();
        student3.lamBaithi();
        Student student4=new Student();
        student4.lamBaithi();
        Student student5=new Student();
        student5.lamBaithi();
        Student student6=new Student();
        student6.lamBaithi();
        fun(student1,student2,student3,student4,student5,student6);

    }
}