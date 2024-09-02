public class testString {
    public static void main(String[] args) {
        String s="HUST";
        StringBuffer sb=new StringBuffer("HUST");

        //Cong Xau
        long startTime = System.nanoTime(); //System.currentTimeMillis()
        for (int i=0;i<10000;i++)
        {
            s += "HUST";
        }
        long endTime = System.nanoTime(); //System.currentTimeMillis()
        System.out.println("Thoi gian doi voi cong xau: " + (endTime - startTime));

        //Append
        startTime = System.nanoTime(); //System.currentTimeMillis()
        for (int i=0;i<10000;i++)
        {
            sb.append("HUST");
        }
        endTime = System.nanoTime(); //System.currentTimeMillis()
        System.out.println("Thoi gian doi voi append: " + (endTime - startTime));

        System.out.println("Append nhanh hon!!!");
    }
}
