/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package rigel.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yangchuanlian on 2017/8/7.
 */
public class MySafeThread implements Runnable {

    private static AtomicInteger count = new AtomicInteger(0);//线程安全的计数变量

    /**
     * 功能：线程运行方法，每次只能一个线程访问
     */
    public void run() {
        System.out.println("正在运行是线程" + Thread.currentThread().getName() + ":pageIndex" + getPageIndex());
    }

    public static synchronized int getPageIndex() {
        count.incrementAndGet();
        return count.get();
    }

    public static void main(String[] args) {
        //创建五个线程实例并启动
        for (int i = 1; i <= 100; i++) {
            Thread mySafeThread = new Thread(new MySafeThread());
            mySafeThread.start();
        }
    }
}
