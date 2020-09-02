package day16;

public class Doen1 {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();

        baozi.setNum(2);

        Sbaozi b = new Sbaozi(baozi);
        Cbaozi c = new Cbaozi(baozi);

        new Thread(b,"刘备").start();
        new Thread(c,"赵云").start();
    }
}
