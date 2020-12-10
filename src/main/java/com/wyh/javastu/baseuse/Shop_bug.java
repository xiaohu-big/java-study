package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class Shop_bug {
    public static void main(String[] args) {
        //5家店，每家店限制购买3件衣服
        int[] shops = new int[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<shops.length;i++) {
            System.out.println("欢迎进入"+(i+1)+"店进行购物！");
            for(int j = 0;j<3;j++) {
                System.out.println("是否选择购买商品？(Y/N)");
                String a = sc.next();
                if(a.equals("Y") || a.equals("N") ) {
                    if(a.equals("Y")) {
                        count++;
                    }else{
                        break;
                    }
                }else {
                    System.err.println("上一个的输入方式有问题并且购买失败！");
                    j-=1;
                }

            }
            System.out.println("欢迎下次光临第"+(i+1)+"家店");
            System.out.println();

        }
        System.err.println("您总共购买了"+count+"件衣服！");


    }

}
