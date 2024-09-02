
import java.util.Stack;

public class StackOf<T> {
    private Stack<T> elements;
    private int size;
    public StackOf()
    {
        this.elements = new Stack<T>();
        this.size = 0;
    }
    public StackOf(int capacity)
    {
        this.size = capacity;
        this.elements = new Stack<T>();
    }
    public boolean isEmpty()
    {
        return this.elements.isEmpty();
    }
    public boolean isFull()
    {
        if(this.elements.size() == size) return true;
        else return false;
    }
    public T peak()
    {
        return this.elements.peek();
    }
    public void push(T value)
    {
        this.elements.push(value);
    }
    public T pop()
    {
        return this.elements.pop();
    }
    public int getSize()
    {
        return this.size;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
}