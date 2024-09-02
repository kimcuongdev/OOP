

public class Test {
    public static void main(String[] args) 
    {
        Tourist tr1=new Tourist("Huy",20);
        Tourist tr2=new Tourist("Luong", 20);
        Tourist tr3=new Tourist("Thai", 20);
        Tourist tr4=new Tourist("Dai", 20);
        Tourist tr5=new Tourist("Cuong", 20);
        Tourist tr6=new Tourist("Ngoc", 20);
        Tourist tr7=new Tourist("Tam", 20);
        Tourist tr8=new Tourist("Thang", 20);
        Tourist tr9=new Tourist("Son", 20);

        Hotel ht1=new Hotel("Rose");
        Hotel ht2=new Hotel("Dream");
        Hotel ht3=new Hotel("Sunshine");
        Hotel ht4=new Hotel("Seashore");

        Destination des1=new Destination("Ha Long");
        Destination des2=new Destination("Cat Ba");
        Destination des3=new Destination("Quy Nhon");
        Destination des4=new Destination("Da Lat");
        
        Tourist[] trl1=new Tourist[4];
        trl1[0]=tr1;
        trl1[1]=tr2;
        trl1[2]=tr3;
        trl1[3]=tr5;

        Tourist[] trl2=new Tourist[4];
        trl2[0]=tr2;
        trl2[1]=tr3;
        trl2[2]=tr4;
        trl2[3]=tr5;

        Tourist[] trl3=new Tourist[5];
        trl3[0]=tr5;
        trl3[1]=tr6;
        trl3[2]=tr7;
        trl3[3]=tr8;
        trl3[4]=tr9;

        Hotel[] htl1=new Hotel[2];
        htl1[0]=ht1;
        htl1[1]=ht2;

        Hotel[] htl2=new Hotel[1];
        htl2[0]=ht2;

        Hotel[] htl3=new Hotel[3];
        htl3[0]=ht1;
        htl3[1]=ht3;
        htl3[2]=ht4;

        Destination[] desl1=new Destination[2];
        desl1[0]=des1;
        desl1[1]=des2;

        Destination[] desl2=new Destination[1];
        desl2[0]=des2;

        Destination[] desl3=new Destination[3];
        desl3[0]=des1;
        desl3[1]=des3;
        desl3[2]=des4;

        Manage mg1=new Manage();
        mg1.bookTour(htl1, desl1, trl1);
        mg1.bookTour(htl2, desl2, trl2);
        mg1.bookTour(htl3, desl3, trl3);
        mg1.print_list();

        mg1.cancelTour(mg1.get_Tour(1));
        mg1.print_list();
        mg1.print_canceled();

        ht1.get_tourists_list();
        ht2.get_tourists_list();
        ht3.get_tourists_list();
    }
}
