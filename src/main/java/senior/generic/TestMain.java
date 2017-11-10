package senior.generic;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.time.StopWatch;

import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(String.class);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        MyCollection<Integer> list = new MyCollection<Integer>();
        list.setList(arrayList);
        System.out.println(list.getMin());
        System.out.println(list.getMax());
        Object[] objects = new Object[10];
        objects[1] = "asdf";
        System.out.println(JSON.toJSON(objects));

        ObjectHolder<String> objectHolder = new ObjectHolder<String>();
        objectHolder.setObj("yangchuanlian");
        System.out.println(objectHolder.getObj());

        String[] names = {"alex", "julia", "anita", "bruce", "lily"};
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
