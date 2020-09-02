package day15a;

public class Text6 extends Thread {

    Integer num = 80;
    Integer num1 = num;
    Integer w1 = 0;
    Integer w2 = 0;
    Integer w3 = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this){
                if (num <= 0) {
                    System.out.println("客车已坐满");
                    break;
                } else {
                    if (Thread.currentThread().getName() == "前门上车") {
                        w1 = w1 + 1;
                        System.out.println(Thread.currentThread().getName() + w1 + "还剩N个座" + (num1 - w1 - w2 -w3));
                    } else if (Thread.currentThread().getName() == "后门上车") {
                        w2 = w2 + 1;
                        System.out.println(Thread.currentThread().getName() + w2 + "还剩N个座" + (num1 - w1 - w2 -w3));
                    } else if (Thread.currentThread().getName() == "中门上车") {
                        w3 = w3 + 1;
                        System.out.println(Thread.currentThread().getName() + w3 + "还剩N个座" + (num1 - w1 - w2 - w3));
                    }
                }
                num--;
            }
        }
    }
}
