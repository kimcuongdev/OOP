package $90e310;

public class Person implements Printable, Stringable {
    protected String name;
    public String stringify()
    {
        return name;
    }
    public void print()
    {
        System.out.println(name);
    }
}
