package day16.day16a;

import java.util.Random;
import java.util.concurrent.Callable;

public class Text2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int ra = r.nextInt(100)+1;
            sum +=ra;
        }
        return sum;
    }
}

