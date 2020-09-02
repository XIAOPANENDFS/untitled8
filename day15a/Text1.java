package day15a;

public class Text1 extends Thread {
    @Override
    public void run() {
        System.out.println("线程一"+"   "+Thread.currentThread().getName());
    }
}
