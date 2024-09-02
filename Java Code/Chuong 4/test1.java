public class test1 {
    public static void main(String[] args) {
        bankAccount acc1 = new bankAccount("");
        bankAccount acc2 = new bankAccount("Hong");
        acc1.setOwner("Hoa");
        System.out.println(acc1.getOwner() + " " + acc2.getOwner());
    }
}
