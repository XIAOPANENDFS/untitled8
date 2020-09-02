package day16.day16a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Text1 {

    public static void main(String[] args) throws Exception {
        ExecutorService futureTask = Executors.newFixedThreadPool(3);
        Future future = futureTask.submit(new Text2());
        Integer sum = (Integer) future.get();
        System.out.println(sum);
    }
}
