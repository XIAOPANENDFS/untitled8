package day16;

public class Sbaozi implements Runnable {

    private Baozi baozi;

    public Sbaozi(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baozi) {
                if (baozi.getNum() >= 5) {
                    System.out.println("停止生产");
                    try {
                        baozi.notify();
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("当前包子的数量：" + baozi.getNum() + "," +
                        Thread.currentThread().getName() + "生产了一个包子");
                baozi.setNum(baozi.getNum() + 1);
            }
        }
    }
}
