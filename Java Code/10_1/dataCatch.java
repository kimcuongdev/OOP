public class dataCatch {
    private double average;
    private  int n;
    public double getAverage(String x) throws myException
    {
        int dot = 0;
        int notDot = 0;
        if (x == null)
        {
            throw new myException("Xau rong");
        }
        else
        {
            for (int i = 0; i < x.length(); i++)
            {
                if (x.charAt(i) != '.' && (x.charAt(i) <'0' || x.charAt(i) > '9') )
                {
                    notDot++;
                    break;
                }
                if (x.charAt(i) == '.')
                {
                    dot++;
                    break;
                }
            }
            if (dot != 0 && notDot == 0) throw new myException("Khong phai mot so nguyen");
            else if (notDot != 0) throw new myException("Khong phai mot so");
        }
        this.average = this.average * ((this.n * 1.0)/(this.n * 1.0 + 1)) + (Integer.parseInt(x) * 1.0)/(this.n * 1.0 + 1);
        this.n = this.n +1;
        return this.average;
    }
}
