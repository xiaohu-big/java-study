package com.wyh.javastu.baseuse.线程;


/**
 * @author WYH
 * @version 2019年11月22日 下午5:00:21
 */
public class ThreadStopDemo {
    public static void main(String[] args) {
        ThreadStop ts = new ThreadStop();
        ts.start();

        try {
            Thread.sleep(3000);
//            ts.stop();  //不建议使用  因为后面的代码无法执行
            ts.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
