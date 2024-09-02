

public class Tourist {
    private String name;
    private int age;
    private Tour[] list_tours;
    private int count_tour;
    public static int tourists_count=0;
    public Tourist(String name, int age)
    {
        tourists_count++;
        this.count_tour=0;
        this.list_tours=new Tour[100000];
        this.name=name;
        this.age=age;
    }
    public static int get_tourist_count()
    {
        return tourists_count;
    }
    public String get_name()
    {
        return this.name;
    }
    public int get_age()
    {
        return this.age;
    }
    public void addTour(Tour tour)
    {
        list_tours[count_tour]=tour;
        count_tour++;
    }
}
