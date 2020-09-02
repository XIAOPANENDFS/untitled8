package day15;

public class Text implements Runnable {

    Integer num = 100;


    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("票卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "正在买票" + num + "张票");
                num--;
            }
        }
    }
}

