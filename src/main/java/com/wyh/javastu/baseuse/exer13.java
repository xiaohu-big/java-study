package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class exer13 {

    public static void main(String[] args) {
        // 学员操作，计算顾客比例
        float up = 0;
        float down = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=10;i++) {
            System.out.print("请输入第" + i + "位顾客的年龄:");
            int age=sc.nextInt();
            if(age>30) {
                up += 1;
            }else if(age<30) {
                down += 1;
            }
        }
        System.out.println("30岁以下的比例是:" + down%10*10 + "%");
        System.out.println("30岁以上的比例是:" + up%10*10 + "%");



    }
}
