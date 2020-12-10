package com.wyh.javastu.baseuse.设计模式.单例设计模式.饿汉式;


/**
 * @author WYH
 * @version 2019年11月23日 下午6:20:47
 *
 * 单例模式:保证类在内存中指存在一个对象
 * 饿汉式
 *
 */
public class StudentDemo1 {
    public static void main(String[] args) {

        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();

        System.out.println(s1 == s2);
    }

}