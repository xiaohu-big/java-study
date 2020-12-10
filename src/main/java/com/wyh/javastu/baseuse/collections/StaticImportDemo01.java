package com.wyh.javastu.baseuse.collections;


/**
 * @author WYH
 * @version 2019年11月16日 上午9:40:42
 * 静态导入
 *
 * 格式: import static 包名....类名.方法名
 * 可以直接导入到方法级别
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;


public class StaticImportDemo01 {
    public static void main(String[] args) {

        System.out.println(java.lang.Math.abs(100));
        System.out.println(java.lang.Math.pow(2, 4));
        System.out.println(java.lang.Math.max(10, 50));
        //太复杂

        System.out.println(Math.abs(100));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.max(10, 50));
        //依旧太复杂

        System.out.println(abs(100));
        System.out.println(pow(2, 4));
        System.out.println(max(10, 50));
        //静态导包
    }

//    private static void max(int i) {//底层源码就是数组
//        System.out.println(i);
//    }
}
