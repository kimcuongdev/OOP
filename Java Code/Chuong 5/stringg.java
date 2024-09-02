public class stringg {
    public static void main(String[] args) {
        String s1 = new String("test"); //doi tuong moi tren heap
        String s2 = "test";// tro toi chuoi literal trong pool string
        String s3 = String.valueOf("test");//tro toi doi tuong chuoi test trong pool string
        String s4 = String.valueOf("test");//tro toi doi tuong chuoi tes trong pool string
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
    }
}
