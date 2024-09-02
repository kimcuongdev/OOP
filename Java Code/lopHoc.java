
import java.util.Random;
import java.util.Scanner;

public class lopHoc {
    Student[] studentsList;
    int studentsCount;
    Scanner input=new Scanner(System.in);
    Random r=new Random();
    public lopHoc()
    {
        System.out.print("Nhap vao so luong sinh vien: ");
        this.studentsCount=input.nextInt();
        studentsList =new Student[studentsCount];
        for (int i=0;i<studentsCount;i++)
        {
            input.nextLine();
            System.out.print("Nhap vao ten sinh vien thu "+ (i+1) +": ");
            String name=input.nextLine();
            System.out.print("Nhap vao nam sinh sinh vien thu "+ (i+1) +": ");
            int year=input.nextInt();
            studentsList[i]=new Student(name, year);
        }
    }
    public lopHoc(int studentsCount)
    {
        this.studentsCount=studentsCount;
        studentsList = new Student[studentsCount];
        for (int i=0;i<studentsCount;i++)
        {
            int year=2006 - r.nextInt(9);
            

            int name_length=r.nextInt(6)+3;
            StringBuilder stringBuilder = new StringBuilder();
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            int firstIndex=r.nextInt(26);
            char firstLetter=characters.charAt(firstIndex);
            stringBuilder.append(firstLetter);
            for (int j=1;j<name_length;j++)
            {
                int randomIndex=26+r.nextInt(26);
                char randomChar=characters.charAt(randomIndex);
                stringBuilder.append(randomChar);
            }
            String name=stringBuilder.toString();
            
            studentsList[i] = new Student(name, year);

        }
    }
    public void scoreSort()
    {
        for (int i=0;i<this.studentsCount-1;i++)
        {
            for (int j=i+1;j<this.studentsCount;j++)
            {
                if (studentsList[i].get_diemThi() < studentsList[j].get_diemThi())
                {
                    Student tempStudent=studentsList[i];
                    studentsList[i]=studentsList[j];
                    studentsList[j]=tempStudent;
                }
            }
        }
    }
    public void yearSort()
    {
        for (int i=0;i<this.studentsCount-1;i++)
        {
            for (int j=i+1;j<this.studentsCount;j++)
            {
                if (studentsList[i].get_year() > studentsList[j].get_year())
                {
                    Student tempStudent=studentsList[i];
                    studentsList[i]=studentsList[j];
                    studentsList[j]=tempStudent;
                }
            }
        }
    }
    public void lamBaithi()
    {
        for (int i=0;i<studentsCount;i++)
        {
            studentsList[i].lamBaithi();
        }
    }
    public void scorePrint()
    {
        this.scoreSort();
        System.out.println("Danh sach sinh vien theo diem thi: ");
        for (int i=0;i<studentsCount;i++)
        {
            System.out.println(studentsList[i].get_name() + " " + studentsList[i].get_diemThi());
        }
    }
    public void yearPrint()
    {
        this.yearSort();
        System.out.println("Danh sach sinh vien theo nam sinh: ");
        for (int i=0;i<studentsCount;i++)
        {
            System.out.println(studentsList[i].get_name() + " " + studentsList[i].get_year());
        }
    }
}
