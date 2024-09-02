

public class Hotel {
    public String name;
    private int count;
    private Tourist[] tourists_list;
    public Hotel(String name)
    {
        tourists_list=new Tourist[1000000];
        this.name=name;
        this.count=0;
    }
    public String get_name()
    {
        return this.name;
    }
    public int get_count()
    {
        return this.count;
    }
    public void addTourist(Tourist tourist)
    {
        tourists_list[count]=tourist;
        count++;
    }
    public void get_tourists_list()
    {
        if (this.tourists_list == null)
        {
            System.out.println("Khach san "+this.get_name()+" khong co du khach nao");
        }
        else
        {
            System.out.println("Khach san "+this.get_name()+" co "+this.get_count()+" du khach:");
        for (int i=0;i<tourists_list.length;i++)
        {
            if (this.tourists_list[i]==null) continue;
            System.out.println(tourists_list[i].get_name() + " " + tourists_list[i].get_age());
        }
        }
    }
}
