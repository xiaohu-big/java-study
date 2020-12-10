package com.wyh.javastu.baseuse.collections;


import java.util.ArrayList;
import java.util.Random;

/**
 * @author WYH
 * @version 2019年11月16日 上午11:13:17
 * 随机产生10个1-20之间的数，不能重复
 *
 * 可以用集合实现
 *
 * 1、创建产生随机数对象
 * 2、创建存储产生随机数的集合
 * 3、创建统计随机数个数的变量，从0 开始
 * 4、判断统计变量是否小于10，
 *               是:不搭理它，跳过
 *               不是: 先产生一个随机数，判断在集合中是否存在，
 *                       存在: 不搭理他
 *                       不存在: 进行添加，统计变量+1
 *
 */
public class RandomDemo01 {
    public static void main(String[] args) {
        //创建产生随机数对象
        Random r = new Random();

        //创建存储产生随机数的集合
        ArrayList<Integer> array = new ArrayList<Integer>();

        //创建统计随机数个数的变量，从0 开始
        int count = 0;

        //判断统计变量是否小于10，
        while(count<10) {
            int number = r.nextInt(20)+1;  //r.nextInt(20) 范围在0-19 对他进行+1 保证在1-20
            if(!array.contains(number)) {
                array.add(number);
                count++;
            }
        }


        for(Integer i : array) {
            System.out.println(i);
        }

    }

}
