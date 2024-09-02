public class testTVL {
    public static void main(String[] args) {
        Student[] students_list = new Student[100];
        for (int i=0;i<10;i++)
        {
            students_list[i]=new Student();
            System.out.println("So luong hoc sinh da khoi tao trong mang: " + students_list[i].student_count);
        }
        
    }
}
