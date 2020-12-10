package com.wyh.javastu.baseuse.线程.demo2;


/**
 * @author WYH
 * @version 2019年11月22日 下午7:00:06
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int x = 1; x <= 500; x++) {
            System.out.println(Thread.currentThread().getName() + "--" + x);
        }

    }

}
