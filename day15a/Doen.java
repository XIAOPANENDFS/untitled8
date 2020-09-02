package day15a;

public class Doen {
    public static void main(String[] args) {
        String [] str = {"刘备","关羽","赵云","黄忠","张飞","曹操","吕布"};
        Text4 text4 = new Text4();
        for (String a : str) {
            Thread t1 = new Thread(text4,a);
            t1.start();
        }
    }
}
