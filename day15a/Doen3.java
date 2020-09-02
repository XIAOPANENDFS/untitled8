package day15a;

public class Doen3 {
    public static void main(String[] args) {
        Text5 text5 = new Text5();
        Thread t1 = new Thread(text5,"官网");
        Thread t2 = new Thread(text5,"实体店");

        t1.start();
        t2.start();

    }
}
