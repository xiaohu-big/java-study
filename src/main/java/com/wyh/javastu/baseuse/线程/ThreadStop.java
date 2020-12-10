package com.wyh.javastu.baseuse.线程;


import java.util.Date;

/**
 * @author WYH
 * @version 2019年11月22日 下午4:57:38
 */
public class ThreadStop extends Thread{
    @Override
    public void run() {
        System.out.println("时间："+new Date());

        //睡眠10秒钟
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.err.println("睡眠被意外中止！！");
        }

        System.out.println("时间："+new Date());

    }
}
