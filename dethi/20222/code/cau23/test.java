package cau23;

public class test {
    public static void changeValue(String a)
    {
        a = "xyz";
    }
    public static void main(String[] args) {
        String value = "abc";
        changeValue(value);
        System.out.println(value);
    }
}
