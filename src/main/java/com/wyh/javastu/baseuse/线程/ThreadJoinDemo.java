package com.wyh.javastu.baseuse.线程;


/**
 * @author WYH
 * @version 2019年11月22日 下午3:05:18
 *
 * join 为了让某些线程执行完毕，才能执行其他的(线程加入)
 *
 *
 *
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {

        Thread my1 = new Thread("王友虎");
        Thread my2 = new Thread("李宏灿");
        Thread my3 = new Thread("齐博源");

        my1.start();
        try {
            my1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        my2.start();
        my3.start();

    }


}
