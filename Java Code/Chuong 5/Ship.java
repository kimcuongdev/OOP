public class Ship {
    private double x = 0.0, y = 0.0;
    private double speed = 1.0, direction = 0.0;
    public String name;
    public Ship(String name)
    {
        this.name = name;
    }
    public Ship(String name, double x, double y)
    {
        this(name);
        this.x = x;
        this.y = y;
    }
    public Ship(String name, double x, double y, double speed, double direction)
    {
        this(name,x,y);
        this.speed = speed;
        this.direction = direction;
    }
    public void get()
    {
        System.out.println(this.name);
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.speed);
        System.out.println(this.direction);
    }
}
