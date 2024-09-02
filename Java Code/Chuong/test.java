class test
{
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e instanceof Manager);
        Employee e1 = new Manager();
        Person p1 = e1;
        Person p = e;
        Employee ee1 = (Manager)p1;
        Employee ee = (Employee) p;
        // Manager m = (Manager) ee;
        Person p2 = new Manager();
        System.out.println(p2 instanceof Employee);
       
        
        
    }
}