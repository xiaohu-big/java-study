package com.wyh.javastu.baseuse.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author WYH
 * @version 2019年11月9日 下午7:51:26
 *
 * 并发修改异常:ConcurrentModificationException
 *
 */
public class ListIteratorDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        List list = new ArrayList();

        //创建字符串对象并将其添加到集合中去
        list.add("王友虎");
        list.add("李宏灿");
        list.add("赵以浩");
        list.add("齐博源");
        list.add("李先锋");

        /*//创建迭代器（Iterator迭代器）（错误示范-----------------）
        Iterator it = list.iterator();
        //找到元素并进行添加张国兴
        while(it.hasNext()) {
            String s = (String)it.next();
            if("李宏灿".equals(s)) {
                list.add("123");
            }
        }
        System.out.println("list:"+list);*/

        //方法1:创建ListIterator迭代器，迭代器调用add方法进行添加
        ListIterator listt = list.listIterator();
        while(listt.hasNext()) {
            String s = (String)listt.next();
            if("李宏灿".equals(s)) {
                listt.add("张国兴"); //在找到的元素后面进行添加
            }
        }
        System.out.println("list:"+list);

        //方法2:利用for循环直接对集合进行遍历，集合中有添加的方法
        for(int i = 0;i<list.size();i++) {
            String s = (String)list.get(i);
            if(s.equals("李宏灿")) {
                list.add("张果喜"); //在末尾进行添加
            }
        }
        System.out.println("list:"+list);



    }

}
