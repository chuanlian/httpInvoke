package rigel.generic;

import org.apache.commons.lang.time.StopWatch;

public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        ObjectHolder<String> objectHolder = new ObjectHolder<String>();
        objectHolder.setObj("yangchuanlian");
        System.out.println(objectHolder.getObj());

        String[] names = {"alex", "julia", "aita", "bruce", "lily"};
        System.out.println(ObjectHolder.getMin(names));

        System.out.println(NormalObject.getMax(names));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread.sleep(1000);
        stopWatch.reset();
        System.out.println(stopWatch.getTime());
        stopWatch.reset();
        stopWatch.start();
        Thread.sleep(2000);
        System.out.println(stopWatch.getTime());
    }
}
