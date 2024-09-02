package cau62b84;

public class Person {

    protected String name;
    public Person(String name)
    {
        this();
    }
    private String print1()
    {
        return name;
    }
    protected String print2()
    {
        return name.toLowerCase();
    }
    protected String print3()
    {
        return name.toLowerCase();
    }
}
