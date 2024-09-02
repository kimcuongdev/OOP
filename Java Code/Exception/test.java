/**
 * test
 */
public class test {
    public void myMethod(int tuoi, String ten) throws ArithmeticException, NullPointerException
    {
        if (tuoi < 18)
        {
            throw new ArithmeticException("non");
        }
        if (ten == null)
        {
            throw new NullPointerException("thieu ten");
        }
    }
    
}