package $970e32;

public class Test {
    public static void tryPrimitives(int i, double f, char c, boolean test)
    {
        i += 10;
        c = 'z';
        if(test)
            test = false;
        else
            test = true;
    } 
    public static void main(String[] args)
    {
        int ii = 1;
        double ff = 1.0;
        char cc = 'a';
        boolean bb = false;
        tryPrimitives(ii, ff, cc, bb);
        System.out.println("ii = " + ii + ", ff = " + ff +", cc = " + cc + ", bb = " + bb);
    }
}
