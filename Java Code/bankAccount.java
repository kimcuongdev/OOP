public class bankAccount {
    String owner;
    public bankAccount(){
        System.out.println("Khoi tao khong tham so");
    }
    public bankAccount(String owner){
        this.owner=owner;
        System.out.println("Khoi tao co tham so");
    }
    public void in(){
        System.out.println(this.owner);
    }
}
