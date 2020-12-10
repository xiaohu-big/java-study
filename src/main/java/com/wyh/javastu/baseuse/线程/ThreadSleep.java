package com.wyh.javastu.baseuse.线程;


import java.util.Date;

/**
 * @author WYH
 * @version 2019年11月22日 下午3:04:30
 */
public class ThreadSleep extends Thread {
    public ThreadSleep() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ThreadSleep(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        for(int x = 0; x<500;x++) {
            System.out.println(getName()+x+" 日期:"+new Date());
            //睡眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}
