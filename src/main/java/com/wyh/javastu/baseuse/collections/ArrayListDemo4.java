package com.wyh.javastu.baseuse.collections;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author WYH
 * @version 2019年11月14日 下午8:53:32
 *
 * 去除ArrayList中的重复字符串对象
 *   思路1:创建一个新的集合，依次遍历旧集合，如果新集合里没有该元素，就添加，反之，有就不添加。
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList a = new ArrayList();

        a.add("AAA");
        a.add("BBB");
        a.add("CCC");
        a.add("AAA");
        a.add("AAA");
        a.add("AAA");
        a.add("BBB");
        a.add("CCC");


        //创建迭代器
        Iterator it = a.iterator();

        //创建一个新的集合
        ArrayList newa = new ArrayList();


        while(it.hasNext()) {
            String s = (String) it.next();
            if(!(newa.contains(s))) {
                newa.add(s);
            }
        }

        //遍历
        Iterator it1 = newa.iterator();
        while(it1.hasNext()) {
            String s = (String)it1.next();
            System.out.println(s);
        }

    }

}
