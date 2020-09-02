package day15a;

public class Text2 implements Runnable {
    @Override
    public void run() {
        System.out.println("线程一"+"   "+Thread.currentThread().getName());
    }
}
