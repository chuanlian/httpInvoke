package senior.thread;

import java.util.concurrent.Callable;

public class MyCallAble implements Callable<String> {

    private Integer k;

    public MyCallAble(Integer k) {
        this.k = k;
    }

    public String call() throws Exception {
        return "k is :" + k;
    }
}
