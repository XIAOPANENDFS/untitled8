package day16.day16a;

public class TestInvokeDirect {
    public static void main(String[] args) {
        invokeDirect(() -> {
            System.out.println("导演拍电影啦!");
        });
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
