

public class b2a7b5 {
    public void check1(int n) throws Exception
    {
        if (n<=0) throw new Exception("number should be greater than 0");
    }
    public void check2(int n) throws RuntimeException
    {
        if (n==5) throw new RuntimeException("Number should not be 5");
    }
    public void check3(int n) throws Exception, RuntimeException
    {
        check1(n);
        check2(n);
    }
    public void test()
    {
        int n = 4;
        check1(n);
        check2(n);
        check3(n);
    }
}
