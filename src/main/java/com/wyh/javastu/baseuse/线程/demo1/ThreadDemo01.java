package com.wyh.javastu.baseuse.线程.demo1;


/**
 * @author WYH
 * @version 2019年11月22日 下午3:05:18
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        my1.start();
        my2.start();
    }


}