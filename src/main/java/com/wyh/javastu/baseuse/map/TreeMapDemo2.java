package com.wyh.javastu.baseuse.map;


import com.wyh.javastu.baseuse.bean.Student;

import java.util.Comparator;

import java.util.Set;
import java.util.TreeMap;

/**
 * @author WYH
 * @version 2019年11月19日 下午7:54:29
 * 无参构造方法默认调用的是自然排序，但是这里要自己重写方法
 *
 *
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getName().length() - s2.getName().length();
                int num1 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                int num2 = num1 == 0 ? s1.getAge() - s2.getAge() : num1;
                return num2;
            }


        });

        //创建对象
        Student s1 = new Student("王友虎",22);
        Student s2 = new Student("赵以浩",24);
        Student s3 = new Student("齐博源",21);
        Student s4 = new Student("李先锋",22);
        Student s5 = new Student("李宏灿",22);
        Student s6 = new Student("王友虎",22);

        tm.put(s1, "六期");
        tm.put(s2, "五期");
        tm.put(s3, "六期");
        tm.put(s4, "七期");
        tm.put(s5, "六期");
        tm.put(s6, "六期");



        Set<Student> set = tm.keySet();

        for(Student s : set) {
            System.out.println(s.getName()+"---"+s.getAge()+"---"+tm.get(s));
        }




    }

}
