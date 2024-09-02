interface Vehicle {
    static boolean isValid()
    {
        System.out.println("is valid");
        return true;
    }
    default void print()
    {
        if (isValid()) System.out.println("Vehicle");
    }
    void showLog();
}
