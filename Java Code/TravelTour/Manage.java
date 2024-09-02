

public class Manage {
    public int tour_count;
    private static int canceledTour=0;
    private Tour[] canceled_list;
    private Tour[] tours_list;
    public Manage()
    {
        this.tour_count=0;
        this.tours_list=new Tour[100000];
        this.canceled_list=new Tour[100000];
    }
    public int get_tour_count()
    {
        return this.tour_count;
    }
    public Tour get_Tour(int i)
    {
        return this.tours_list[i-1];
    }
    public void bookTour(Hotel[] hotels, Destination[] destinations,Tourist[] tourists)
    {
        tours_list[tour_count]=new Tour(hotels,destinations,tourists);
        for (int i=0;i<tourists.length;i++)
        {
            tourists[i].addTour(tours_list[tour_count]);
        }
        tour_count++;
    }
    public void cancelTour(Tour tour)
    {
        for (int i = 0; i < tour_count; i++) 
        {
            if (tours_list[i] == tour) 
            {
                canceled_list[canceledTour] = tours_list[i];
                for (int j = i; j < tour_count - 1; j++) 
                {
                    tours_list[j] = tours_list[j + 1];
                }
                tours_list[tour_count - 1] = null; 
                tour_count--;
                System.out.println("\nTour has been canceled successfully.");
                canceledTour++;
                return;
            }
        }
        System.out.println("Tour not found.");
    }
    public void print_list()
    {
        System.out.println("\nSo tour du lich: "+ this.get_tour_count());
        System.out.println("Tong so du khach: " + Tourist.tourists_count);
        for (int i=0;i<this.get_tour_count();i++)
        {
            System.out.println("\nTour " + (i+1) + ": ");
            System.out.println("So du khach: "+ tours_list[i].get_tourist_numb());
            tours_list[i].get_tourists_list();
            System.out.println("So khach san: " + tours_list[i].get_hotels_numb());
            tours_list[i].get_hotels_list();
            System.out.println("So dia diem: " + tours_list[i].get_des_numb());
            tours_list[i].get_des_list();
        }
    }
    public void print_canceled()
    {
        System.out.println("\nSo tour du lich bi huy: "+ canceledTour);
        for (int i=0;i<canceledTour;i++)
        {
            System.out.println("\nTour " + (i+1) + ": ");
            System.out.println("So du khach: "+ canceled_list[i].get_tourist_numb());
            tours_list[i].get_tourists_list();
            System.out.println("So khach san: " + canceled_list[i].get_hotels_numb());
            tours_list[i].get_hotels_list();
            System.out.println("So dia diem: " + canceled_list[i].get_des_numb());
            tours_list[i].get_des_list();
        }
    }
}
