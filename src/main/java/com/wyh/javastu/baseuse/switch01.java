package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class switch01 {
    public static void main(String[] args) {

        // 计算器
        int result = 0;
        System.out.println("输入第一个数：");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();

        System.out.println("选择加减乘除：（1加  2减 3乘 4除）");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("输入第二个数：");
                int num2=sc.nextInt();
                result = num1+num2;
                System.out.println("得到的结果为:"+result);
                break;
            case 2:
                System.out.println("输入第二个数：");
                int num3=sc.nextInt();
                result = num1-num3;
                System.out.println("得到的结果为:"+result);
                break;
            case 3:
                System.out.println("输入第二个数：");
                int num4=sc.nextInt();
                result = num1*num4;
                System.out.println("得到的结果为:"+result);
                break;
            case 4:
                System.out.println("输入第二个数：");
                int num5=sc.nextInt();
                result = num1/num5;
                System.out.println("得到的结果为:%s"+result);
                break;
            default:break;
        }


    }
}
