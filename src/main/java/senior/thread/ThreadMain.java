package senior.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadMain {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<String> futureTask = new FutureTask<String>(new MyCallAble(10));
        Thread thread1 = new Thread(futureTask);
        thread1.start();


        ExecutorService executorService = Executors.newFixedThreadPool(7);

        executorService.submit(new MyCallAble(10));


        IDGenerator idGenerator = new IDGenerator();
        for (int k = 0; k < 10; k++) {
            System.out.println(idGenerator.getNext());
        }

        Test test = new Test();
        System.out.println(test.getMycla().getAge());

        Circle circle = new Circle(1.4f);
        Circle.Draw draw = circle.new Draw();
        draw.drawSahpe();

        long long_max=java.lang.Long.MAX_VALUE;//得到长整型的最大值。
        System.out.println(long_max);
        System.out.println((long_max+"").length());

        long id = System.currentTimeMillis();
        System.out.println((id+"").length());
    }

}
