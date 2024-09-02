public class Limit<T extends LandAnimal & Walk> {
    private T value;
    public Limit(T value)
    {
        this.value = value;
    }
    public T getValue()
    {
        return this.value;
    }
}
