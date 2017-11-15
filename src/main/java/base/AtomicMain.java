package base;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicMain {

    public static void main(String[] args) {
        AtomicLong num = new AtomicLong();
        System.out.println(num.get());
        System.out.println(num.incrementAndGet());
    }
}
