import java.util.ArrayList;

class Information <T>
{
    private T value;
    private int capacity;
    private ArrayList<T> array = new ArrayList<T>(capacity);
    public Information()
    {
        this.array = new ArrayList<T>();
    }
    public Information(T value)
    {
        this();
        this.value = value;
    }
    public Information(T value, int capacity)
    {
        this.array = new ArrayList<T>(capacity);
        this.value = value;

    }
    public T getValue()
    {
        return this.value;
    }
    public void add(T value)
    {
        this.array.add(value);
    }
    public void print()
    {
        for (T e : this.array)
        {
            System.out.println(e);
        }
    }
}