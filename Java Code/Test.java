import java.util.Scanner;
public class Test 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap vao so hoc sinh: ");
        n=input.nextInt();
        Student[] students = new Student[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Nhap du lieu hoc sinh thu "+ (i+1));
            System.out.print("Name: ");
            input.nextLine();
            String name=input.nextLine();
            System.out.print("Year: ");
            int year=input.nextInt();
            students[i]=new Student(name,year);
        }
        int sum=0;
        System.out.println("Danh sach ten hoc sinh: ");
        for (int i=0;i<n;i++)
        {
            System.out.println(students[i].get_name());
            sum+= 2024-students[i].get_year();
        }
        System.out.println("Tong so tuoi: "+ sum);
        input.close();
    }
}
