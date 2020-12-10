package com.wyh.javastu.baseuse.线程;


/**
 * @author WYH
 * @version 2019年11月22日 下午4:42:16
 *
 * 守护线程
 *
 * 理解：坦克大战，黄绿坦克守护家，家没了，坦克也没了
 *
 */
public class ThreadDeamonDemo {
    public static void main(String[] args) {
        Thread td1 = new Thread("关羽");
        Thread td2 = new Thread("张飞");


        //注意！！！！必须在启动前声明
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();




        Thread.currentThread().setName("刘备");
        for (int x = 0; x < 5; x++) {
            System.out.println(Thread.currentThread().getName() + x);
        }
    }

}