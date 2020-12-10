package com.wyh.javastu.baseuse.设计模式.单例设计模式.懒汉式;


/**
 * @author WYH
 * @version 2019年11月23日 下午6:34:12
 */
public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1 = Teacher.getTeacher();
        Teacher t2 = Teacher.getTeacher();

        System.out.println(t1 == t2);
        System.out.println(t1);
        System.out.println(t2);


    }

}
