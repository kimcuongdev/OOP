public class TestAnimal {
    public static void main(String[] args) {
        //Using the subclasses
        Cat cat1 = new Cat();
        //cat1.greeting();
        Dog dog1 = new Dog();
        //dog1.greeting();
        BigDog bigDog1 = new BigDog();
        //bigDog1.greeting();

        //Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();             //khởi tạo Cat rồi upcast lên Animal để thực hiện phép gán, 
                                        //khi thực hiện phương thức sẽ là phương thức của lớp Cat 
                                        //=> in ra Meow!
        Animal animal2 = new Dog();
        animal2.greeting();             //khởi tạo Dog rồi upcast lên Animal để thực hiện phép gán, 
                                        //khi thực hiện phương thức sẽ là phương thức của lớp Dog 
                                        //=> in ra Woof!
        Animal animal3 = new BigDog();
        animal3.greeting();             //khởi tạo BigDog rồi upcast lên Animal để thực hiện phép gán, 
                                        //khi thực hiện phương thức sẽ là phương thức của lớp BigDog 
                                        //=> in ra Woow!
        Animal animal4 = new Animal();  // Lỗi vì Animal là một abstract class nên không thể khởi tạo đối tượng của lớp trừu tượng này
        
        //Downcast
        Dog dog2 = (Dog)animal2;            //ép kiểu gán animal2 cho dog2
        BigDog bigDog2 = (BigDog)animal3;   //ép kiểu gán animal3 cho bigDog2
        Dog dog3 = (Dog)animal3;            //ép kiểu gán animal3 cho dog3
        Cat cat2 = (Cat)animal2;            //không thể thực hiện phép gán vì animal2 được khai báo là Dog
        dog2.greeting(dog3);                //animal2 được khai bào là Dog nên khi thực hiện lệnh sẽ in ra Wooooooooooof!
        dog3.greeting(dog2);                //animal3 được khai báo là BigDog nên khi thực hiện lệnh sẽ in ra Wooooooowwwww!
        dog2.greeting(bigDog2);             //bigDog2 sẽ được tự động upcast lên thành Dog và truyền vào phương thức => in ra Wooooooooooof!
        bigDog2.greeting(dog2);             //phương thức greeting của BigDog => in ra Wooooooowwwww!
        bigDog2.greeting(bigDog1);          //upcast bigDog1 lên thành Dog => in ra Wooooooowwwww!
    }   
}