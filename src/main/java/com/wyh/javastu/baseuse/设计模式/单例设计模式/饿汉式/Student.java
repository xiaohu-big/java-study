package com.wyh.javastu.baseuse.设计模式.单例设计模式.饿汉式;


/**
 * @author WYH
 * @version 2019年11月23日 下午6:20:40
 */
public class Student {
    // 将构造方法私有
    private Student() {

    }

    // 自己创建一个对象
    // 静态方法只能访问静态的成员变量,加static
    // 为了不让外界随意改动这个对象,我们将他私有化
    private static Student s = new Student();

    // 提供一个方法给外界进行访问到这个对象
    public static Student getStudent() {
        return s;
    }

}
