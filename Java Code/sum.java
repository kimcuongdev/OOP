public class sum {
    public static int plus (int ... arr)
    {
        int sum=0;
        for (int i : arr)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        System.out.println(plus(1,2,3,4,5,6));
        System.out.println(plus(arr));
    }
}
