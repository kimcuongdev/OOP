public class testAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        bigDog bigDog1 = new bigDog();
        bigDog1.greeting();

        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new bigDog();
        animal3.greeting();
        // Animal animal4 = new Animal(); loi vi Animal la lop truu tuong

        Dog dog4 = new bigDog();
        dog4.greeting();

        Dog dog2 = (Dog)animal2;
        bigDog bigDog2 = (bigDog)animal3;
        Dog dog3 = (Dog)animal3; //thuc chat van la bigDog
        System.out.println(animal3 instanceof Dog);
        Cat cat2 = (Cat)animal1;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(bigDog1);
    }
}
