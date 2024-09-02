public class testnull {
    public static void main(String[] args) {
        dataCatch dc = new dataCatch();
        try
        {
            System.out.println(dc.getAverage("2"));
            System.out.println(dc.getAverage("100"));
            System.out.println(dc.getAverage(null));
        }catch (myException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
