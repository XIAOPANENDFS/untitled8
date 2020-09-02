package day15a;

public class Text5 implements Runnable {
    Integer num = 100;
    Integer num1=num;
    int i = 0;
    int a = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("杯子卖完了");
                    break;
                }
//                System.out.println(Thread.currentThread().getName());
                synchronized (this) {
                    if (Thread.currentThread().getName() == "官网") {
                        i = i + 1;
                        System.out.println("官网卖出：" + i + "   " + "剩余："+(num1-i));
                    } else if (Thread.currentThread().getName() == "实体店") {
                        a = a + 1;
                        System.out.println("实体店卖出：" + a + "   " + "剩余："+(num1-a-i));
                    }
                }
                num--;
            }
        }
    }
}
