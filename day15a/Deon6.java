package day15a;

public class Deon6 extends Thread {

    private Integer num;
    private String str;
    private Integer i = num;

    Deon6 deon6;

    @Override
    public String toString() {
        return "Deon6{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getNum() {
        return num;
    }

    public String getStr() {
        return str;
    }

    public Deon6(Integer num,String str) {
        this.num = num;
        this.str = str;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (this){
                if (getNum() <= 0) {
                    System.out.println("票卖完了");
                    break;
                } else {
                    System.out.println("当前窗口为：" + Thread.currentThread().getName() + "卖了一张票，剩余票数为"+(num-1));
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num--;
            }
        }
    }
}
