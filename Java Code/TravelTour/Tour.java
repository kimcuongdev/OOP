

public class Tour {
    private Tourist[] tourists_list;
    private int tourist_numb;
    private Hotel[] hotels_list;
    private int hotels_numb;
    private Destination[] destinations_list;
    private int des_numb;
    public int get_tourist_numb()
    {
        return this.tourist_numb;
    }
    public int get_hotels_numb()
    {
        return this.hotels_numb;
    }
    public int get_des_numb()
    {
        return this.des_numb;
    }
    public void get_tourists_list()
    {
        for (int i=0;i<tourists_list.length;i++)
        {
            System.out.println("Khach du lich thu " + (i+1) + ": "+tourists_list[i].get_name() + " " + tourists_list[i].get_age());
        }
    }
    public void get_hotels_list()
    {
        for (int i=0;i<hotels_list.length;i++)
        {
            System.out.println("Khach san thu " + (i+1) + ": "+hotels_list[i].get_name());
        }
    }
    public void get_des_list()
    {
        for (int i=0;i<destinations_list.length;i++)
        {
            System.out.println("Dia diem thu " + (i+1) + ": "+destinations_list[i].name);
        }
    }
    public Tour(Hotel[] hotels, Destination[] destinations,Tourist[] tourists)
    {
        this.tourists_list=new Tourist[tourists.length];
        this.tourist_numb=0;
        this.hotels_list=new Hotel[hotels.length];
        this.hotels_numb=0;
        this.destinations_list=new Destination[destinations.length];
        this.des_numb=0;
        for (int i=0;i<tourists.length;i++)
        {
            this.tourists_list[i]=tourists[i];
            this.tourist_numb++;
        }
        for (int i=0;i<hotels.length;i++)
        {
            this.hotels_list[i]=hotels[i];
            this.hotels_numb++;
        }
        for (int i=0;i<destinations.length;i++)
        {
            destinations_list[i]=destinations[i];
            this.des_numb++;
        }
        for (int i=0;i<hotels.length;i++)
        {
            for (int j=0;j<tourists.length;j++)
            {
                hotels[i].addTourist(tourists[j]);
            }
        }
    }
}
