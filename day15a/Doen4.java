package day15a;

public class Doen4 {
    public static void main(String[] args) {
    Text6 text6 = new Text6();
    Thread t1 = new Thread(text6,"前门上车");
    Thread t2 = new Thread(text6,"后门上车");
    Thread t3 = new Thread(text6,"中门上车");

    t1.start();
    t2.start();
    t3.start();
    }
}