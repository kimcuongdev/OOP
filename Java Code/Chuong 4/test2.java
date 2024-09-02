public class test2 {
    public static void main(String[] args) {
        bankAccount acc1 = new bankAccount();
        bankAccount acc2 = new bankAccount();
        acc1.setOwner("Hoa");
        acc2.setOwner("Hong");
        System.out.println(acc1.getOwner() + " " + acc2.getOwner());
    }
}
