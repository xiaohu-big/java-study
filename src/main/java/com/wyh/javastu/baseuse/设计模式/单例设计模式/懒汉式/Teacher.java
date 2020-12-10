package com.wyh.javastu.baseuse.设计模式.单例设计模式.懒汉式;


/**
 * @author WYH
 * @version 2019年11月23日 下午6:32:09
 *
 * 懒汉式
 */
public class Teacher {
    private Teacher() {

    }

    private static Teacher teacher = null;

    public synchronized static Teacher getTeacher() {
        if(teacher == null) {
            teacher = new Teacher();
        }

        return teacher;
    }

}