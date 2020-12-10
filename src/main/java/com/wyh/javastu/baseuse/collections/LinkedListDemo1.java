package com.wyh.javastu.baseuse.collections;


import com.wyh.javastu.baseuse.bean.Student;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author WYH
 * @version 2019年11月14日 下午7:14:33
 *
 * LinkedList 存储对象并遍历。
 */
public class LinkedListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList linkList = new LinkedList();

        //创建学生对象
        Student s1 = new Student("王友虎",22);
        Student s2 = new Student("赵以浩",23);
        Student s3 = new Student("李宏灿",21);
        Student s4 = new Student("李先锋",22);
        Student s5 = new Student("齐博源",23);

        //将学生对象添加到集合中去
        linkList.add(s1);
        linkList.add(s2);
        linkList.add(s3);
        linkList.add(s4);
        linkList.add(s5);

        //创建迭代器对象
        Iterator it = linkList.iterator();

        while(it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.getName()+"------"+s.getAge());
        }




    }

}
