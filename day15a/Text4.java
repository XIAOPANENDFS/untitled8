package day15a;

public class Text4 implements Runnable {
    @Override
    public void run() {
        System.out.println("进洞人："+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}