package com.wyh.javastu.baseuse.面向对象;


/**
 * @author WYH
 * @version 2019年11月10日 上午10:18:07
 * 该程序证明:
 *   实现一个类只允许实例化一个对象
 */

class A2{
    public int i = 2;

    private static A2 aa = new A2();

    private A2() {

    }

    public static A2 getA2() {
        return aa;
    }
}

public class static03 {
    public static void main(String[] args) {
        A2 aa1 = A2.getA2();
        A2 aa2 = A2.getA2();
        aa1.i = 90;
        System.out.println("aa2:"+aa2.i);//说明aa1和aa2是同一个对象

        if(aa1 == aa2) {
            System.out.println("说明aa1和aa2是同一个对象");
        }else {
            System.out.println("说明aa1和aa2不是同一个对象");
        }
    }

}