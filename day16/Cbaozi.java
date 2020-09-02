package day16;

public class Cbaozi implements Runnable {
    private Baozi baozi;

    public Cbaozi(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baozi) {
                if (baozi.getNum() <= 0) {
                    System.out.println("停止吃包子");
                    try {
                        baozi.wait();
                        baozi.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("当前包子的数量：" + baozi.getNum() + "," +
                        Thread.currentThread().getName() + "吃了一个包子");
                baozi.setNum(baozi.getNum() - 1);

            }
        }
    }
}
