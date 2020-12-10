package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        int num = 0;
        // TODO Auto-generated method stub
        System.out.println("请输入1-7当中的数字:");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        switch(i) {
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期七");
                break;
            default:break;

        }

    }
}
