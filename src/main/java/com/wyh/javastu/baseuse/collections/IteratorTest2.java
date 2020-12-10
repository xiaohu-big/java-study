package com.wyh.javastu.baseuse.collections;

import com.wyh.javastu.baseuse.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest2 {
    public static void main(String[] args) {
        //创建集合容器
        Collection c = new ArrayList();

        //实例化5个对象
        Student s1 = new Student("王友虎",22);
        Student s2 = new Student("李宏灿",21);
        Student s3 = new Student("赵以浩",23);
        Student s4 = new Student("李先锋",24);
        Student s5 = new Student("齐博源",25);

        //将对象放进结合中
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);


        //将集合转换成一个迭代器
        Iterator it = c.iterator();


        //while循环输出
        //hasNext()，判断迭代器里是否有值，有返回true，无返回false
        while(it.hasNext()) {
            //System.out.println(it.next());
            //向下转型
            Student st = (Student)it.next();
            System.out.println("姓名"+st.getName()+"  年龄："+st.getAge());

        }




    }
}
