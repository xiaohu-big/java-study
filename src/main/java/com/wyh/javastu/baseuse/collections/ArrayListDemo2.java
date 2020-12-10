package com.wyh.javastu.baseuse.collections;


import com.wyh.javastu.baseuse.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author WYH
 * @version 2019年11月14日 下午7:28:06
 *
 * 去除ArrayList中的重复对象
 *   思路1:创建一个新的集合，依次遍历旧集合，如果新集合里没有该元素，就添加，反之，有就不添加。
 *
 *   contains方法的底层是equals方法，所以不能用这个进行比较。
 *   而我们学生类里面没有equals方法，所以这时候就默认使用的是它父亲(Object)的equals方法。
 *   而Object的equals方法，默认比较的是地址值,又因为，new的地址值都不同，所以用equals比较总是失败。
 * 怎么解决？
 *   重写equals方法
 *
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList aList = new ArrayList();

        //创建学生对象
        Student s1 = new Student("齐博源",22);
        Student s2 = new Student("王友虎",22);
        Student s3 = new Student("赵以浩",24);
        Student s4 = new Student("李先锋",24);
        Student s5 = new Student("李宏灿",22);
        Student s6 = new Student("李宏灿",22);
        Student s7 = new Student("赵以浩",24);
        Student s8 = new Student("齐博源",22);



        //将学生对象添加到集合中去
        aList.add(s1);
        aList.add(s2);
        aList.add(s3);
        aList.add(s4);
        aList.add(s5);
        aList.add(s6);
        aList.add(s7);
        aList.add(s8);




        //创建一个新的集合
        ArrayList aList2 = new ArrayList();


        //使用迭代器进行遍历
        Iterator it = aList.iterator();

        while(it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.getName()+"---"+s.getAge());
            if(!aList2.contains(s)) {
                aList2.add(s);

            }
        }

        System.out.println("----------去重后-----------");

        //遍历新集合
        Iterator it2 = aList2.iterator();
        while(it2.hasNext()) {
            Student s = (Student)it2.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }


    }

}
