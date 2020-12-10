package com.wyh.javastu.baseuse.线程;


/**
 * @author WYH
 * @version 2019年11月22日 下午4:28:15
 */
public class ThreadYield extends Thread {
    public ThreadYield() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ThreadYield(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        for(int x = 0; x<200;x++) {
            System.out.println(getName()+x);
            Thread.yield();
        }
    }
}