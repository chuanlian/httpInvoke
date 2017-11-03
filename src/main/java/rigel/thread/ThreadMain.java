package rigel.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadMain {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<String> futureTask = new FutureTask<String>(new MyCallAble(10));
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        System.out.println(futureTask.get());


        ExecutorService executorService = Executors.newFixedThreadPool(7);

        executorService.submit(new MyCallAble(10));
    }
}
