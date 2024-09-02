package cau10;

public class test {
    public static void main(String[] args) {
        X x = new Y();
        x.calculate();
        Y y = (Y)x;
        y.calculate();
    }
}
