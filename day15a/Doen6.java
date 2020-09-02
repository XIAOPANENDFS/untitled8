package day15a;

public class Doen6 {
    public static void main(String[] args) {
        Deon6 deon6 = new Deon6(1000,"gta");
        Thread t1 = new Thread(deon6,"刘备");
        Thread t2 = new Thread(deon6,"关羽");

        t1.start();
        t2.start();
    }
}
