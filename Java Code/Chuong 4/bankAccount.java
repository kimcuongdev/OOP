/**
 * bankAccount
 */
public class bankAccount {

    private String owner;
    private double balance;
    public bankAccount()
    {
        
    }
    public bankAccount(String name)
    {
        //setOwner(name);
        this.owner = name;
    }
    public void setOwner(String name)
    {
        owner = name;
    }
    public String getOwner()
    {
        return owner;
    }

}