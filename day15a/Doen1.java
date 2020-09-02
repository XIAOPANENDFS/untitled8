package day15a;

public class Doen1 {
    public static void main(String[] args) {
        Text1 ti = new Text1();
        Thread t1 = new Thread(ti,"刘备");
        t1.start();

        Text2 text2 = new Text2();
        Thread t2 = new Thread(text2,"关羽");
        t2.start();
    }
}
