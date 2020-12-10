package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入是否是会员: 是(y)/否(n)");
        String i = sc.next();
        System.out.println("测试");
        if(i.equals("y")) {
            System.out.println("请输入购物金额:");
            float money = sc.nextFloat();
            if(money>200) {
                System.out.println("实际支付:" + (float)(money*(0.75)));
            }else {
                System.out.println("实际支付:" + (float)(money*(0.8)));
            }
        }else if(i.equals("n")){
            System.out.println("请输入购物金额:");
            float money = sc.nextFloat();
            System.out.println("实际支付:" + (float)(money*(0.9)));
        }


    }

}
