package $9acad7;
class Test {
    public static void increase1(int[] arr) {
    for (int a: arr)
        a += 1;
    } 
    public static void increase2(int[] arr) {
        for (int i=0; i<arr.length; ++i)
        arr[i] ++;
    } 
    public static void main(String[] args) {
        int arr[] = {5, 6, 7};
        increase1(arr);
        increase2(arr);
        for (int a: arr)
        System.out.print(a + " ");
    }
}
