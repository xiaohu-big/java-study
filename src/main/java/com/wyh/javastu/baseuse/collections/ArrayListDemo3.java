package com.wyh.javastu.baseuse.collections;


import com.wyh.javastu.baseuse.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author WYH
 * @version 2019年11月14日 下午8:09:35
 *
 *
 * 去除ArrayList中的重复对象
 *   思路2:不创建新的集合，就在以前的集合上做。选择排序的思想
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList aList = new ArrayList();

        //创建学生对象
        Student s1 = new Student("齐博源",22);
        Student s2 = new Student("王友虎",22);
        Student s3 = new Student("赵以浩",24);
        Student s4 = new Student("李先锋",24);
        Student s5 = new Student("李宏灿",22);
        Student s6 = new Student("赵以浩",24);
        Student s7 = new Student("王友虎",22);
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



        for(int i = 0 ;i<aList.size()-1;i++) {
            for(int j = i+1;j<aList.size();j++) {
                if(aList.get(i).equals(aList.get(j))) {
                    aList.remove(j);// 移除后一个会把前面顶掉，移除第六个，j=5,就不再小于size了
                    j--;
                }
            }
        }

        for(int i = 0;i<aList.size();i++) {
            Student s = (Student)aList.get(i);
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }

}