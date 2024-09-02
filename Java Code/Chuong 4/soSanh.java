public class soSanh {
    public static void main(String[] args) {
        Integer integer1 = new Integer(12);
        Integer integer2 = new Integer(12);
        Integer integer3 = integer1;
        System.out.println(integer3 == integer1);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        double e =12.0;

        int int1 = 12;
        int int2 = 12;
        System.out.println(int1 == int2);
        System.out.println(int1 == 12.0);
        System.out.println(integer1 == e);

        Value val1 = new Value(2);
        Value val2 = new Value(2);
        System.out.println(val1.equals(val2));

        Employee e1 = new Employee("Nam");
        Employee e2 = new Employee("Nam");
        System.out.println(e1.equals(e2));
    }
}
