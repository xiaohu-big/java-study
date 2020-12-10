package com.wyh.javastu.baseuse.线程.demo2;


/**
 * @author WYH
 * @version 2019年11月22日 下午7:01:07
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my,"王友虎");
        Thread t2 = new Thread(my,"赵以浩");

        t1.start();
        t2.start();

    }

}
