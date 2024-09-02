import java.util.ArrayList;

public class test2 {
    public static <T> void print(T[] a)
    {
        for (T t : a)
        {
            System.out.println(t);
        }
    }
    public static <T> void print(ArrayList<T> a)
    {
        for (T t : a)
        {
            System.out.println(t);
        }
    }
    public static <T,V> void print(T in1, V in2)
    {
        System.out.println(in1 + " " +  in2);
    }
    public static void main(String[] args) {
        String[] str = {"KC","HD","yeu nhau vai loz"};
        ArrayList<Double> arrayListDoubles = new ArrayList<Double>();
        Double e = 12.3;
        arrayListDoubles.add(Double.valueOf(12.4));
        arrayListDoubles.add(34.1);
        arrayListDoubles.add(new Double(123.4));
        arrayListDoubles.add(e);
        print(arrayListDoubles);
        print(str);
        String t = "kc";
        Integer v = new Integer(15);
        print(t, v);
    }
}
