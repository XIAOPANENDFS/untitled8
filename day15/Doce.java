package day15;

public class Doce {
    public static void main(String[] args) {
        Text t = new Text();
        Thread t1 = new Thread(t,"刘备");
        Thread t2 = new Thread(t,"关羽");
        Thread t3 = new Thread(t,"张飞");

        t1.start();
        t2.start();
        t3.start();
    }
}
