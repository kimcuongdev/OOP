public class overloading3 {
    public static void main(String[] args) {
        Ship ship1 = new Ship("Diu");
        Ship ship2 = new Ship("KC",20,20);
        Ship ship3 = new Ship("KC Diu",20,20,20,20);
        ship1.get();
        ship2.get();
        ship3.get();
        
    }
}
