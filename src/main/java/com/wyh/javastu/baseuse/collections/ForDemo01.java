package com.wyh.javastu.baseuse.collections;


import java.util.ArrayList;
import java.util.List;

/**
 * @author WYH
 * @version 2019年11月16日 上午8:44:59
 *
 * JDK5 的新特性: 自动装箱，泛型，增强for，静态导入，可变参数，枚举
 *
 * 增强for: for循环
 *  格式:
 *       for(元素数据类型 变量名 : 数组或者是Collection 集合){
 *           变量，直接使用
 *       }
 *
 * 好处: 简化了数组和集合的遍历
 *
 * 弊端: 增强for的目标不能为null
 * 解决: 在进行增强for之前我们要先进行不为null的判断
 */
public class ForDemo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int x = 0;x<arr.length;x++) {
            System.out.println(arr[x]);
        }

        System.out.println("---------------");

        for(int x:arr) {
            System.out.println(x);
        }

        System.out.println("---------------");

        //定义一个字符串数组
        String[] arrayList = {"小虎","小沛","小王"};
        for(String array : arrayList) {
            System.out.println(array);

        }

        System.out.println("---------------");
        // 定义一个ArrayList
        ArrayList<String> array = new ArrayList<String>();
        array.add("林青霞");
        array.add("刘亦菲");
        array.add("景甜");

        for (String array1 : array) {
            System.out.println(array1);

        }

        System.out.println("---------------");

        //NullPointerException报空指针错误
        //

        List<String> list = null;
        if (list != null) {
            for (String x : list) {
                System.out.println(x);
            }
        }

        System.out.println("---------------");
        //增强for其实就是来替代器迭代器的，怎么验证？ 并发修改异常。ConcurrentModificationException
        for (String array1 : array) {
            if("刘亦菲".equals(array1)) {
                array.add("小王");
            }

        }
        System.out.println("array1:"+array);


    }



}