/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package senior.thread;

/**
 * Created by yangchuanlian on 2017/8/3.
 */
public class HelloThread implements Runnable {

    private int i;

    public HelloThread(int i) {
        this.i = i;
    }


    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ":" + i++);
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 50) {
                break;
            }
        }
    }
}
