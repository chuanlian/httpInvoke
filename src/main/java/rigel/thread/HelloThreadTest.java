/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package rigel.thread;

/**
 * Created by yangchuanlian on 2017/8/3.
 */
public class HelloThreadTest {
    public static void main(String[] args) {
        for (int k = 0; k < 50; k++) {
            HelloThread r = new HelloThread(k);
            Thread thread = new Thread(r);
            thread.start();
        }
    }

}
