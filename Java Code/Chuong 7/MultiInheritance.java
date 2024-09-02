public class MultiInheritance implements Interface1, Interface2 {
    @Override
    public void doSomething()
    {
        Interface1.super.doSomething();
    }
}
