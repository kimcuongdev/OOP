package f208c1;

public class Test {
    public static void main(String[] ss) {
        String[] s = {"abc", "123", null};
        for (int i = 0; i < s.length; i++){
            try {
                System.out.println(s[i]);
                int a = s[i].length();
                try {
                    a = Integer.parseInt(s[i]);
                } catch (NumberFormatException ex) {
                    System.out.print("NumberFormatException ");
                }
            } catch(NullPointerException ex) {
                System.out.print("NullPointerException ");
            }
        }
    }
}
