package com.wyh.javastu.baseuse.线程.demo1;


/**
 * @author WYH
 * @version 2019年11月22日 下午3:04:30
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for(int x = 0; x<500;x++) {
            System.out.println(x);
        }
    }

}
