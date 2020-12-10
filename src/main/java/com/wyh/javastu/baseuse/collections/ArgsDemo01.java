package com.wyh.javastu.baseuse.collections;


/**
 * @author WYH
 * @version 2019年11月16日 上午9:52:41
 *
 * 可变参数:
 *   访问修饰符 返回值  方法名(数据类型... 变量名){
 *
 *   }
 *
 * 1.这里的变量名是一个数组
 * 2.如果一个方法拥有可变参数,并且拥有多个参数,那么可变参数是放在最后一个。
 *
 *
 * 需求:我要写一个求和函数,具体几个数据求和我并不清楚,但是我在调用的时候就知道了.
 * 为了解决这个问题,Java就提供了一个东西: 可变参数
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        //两个数据的求和
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println("result:"+result);

        //三个数据的求和
        int c = 30;
        int result2 = sum(a,b,c);
        System.out.println("result:"+result2);

        //四个数据的求和
        int d = 40;
        int result3 = sum(a,b,c,d);
        System.out.println("result:"+result3);


    }

    //可变参数
    private static int sum(int... a) {//底层源码就是数组
        int s = 0;
        for(int x : a) {
            s += x;
        }
        return s;
    }

   /* private static int sum(int a, int b,int c,int d) {
        return a+b+c+d;
    }

    private static int sum(int a, int b,int c) {
        return a+b+c;
    }


    private static int sum(int a, int b) {
        return a+b;
    }*/

}
