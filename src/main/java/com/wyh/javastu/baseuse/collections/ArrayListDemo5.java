package com.wyh.javastu.baseuse.collections;


import java.util.ArrayList;

/**
 * @author WYH
 * @version 2019年11月14日 下午8:53:39
 *
 * 去除ArrayList中的重的字符串对象
 *   思路2:不创建新的集合，就在以前的集合上做。选择排序的思想
 */
public class ArrayListDemo5 {
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


        for(int i = 0;i<a.size()-1;i++) {
            for(int j = i+1;j<a.size();j++) {
                if(a.get(i).equals(a.get(j))) {
                    a.remove(j);
                    j--;
                }
            }
        }


        //遍历
        for(int i = 0;i<a.size();i++) {
            String s = (String)a.get(i);
            System.out.println(s);
        }
    }

}