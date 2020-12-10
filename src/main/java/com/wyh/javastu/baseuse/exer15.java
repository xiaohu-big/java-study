package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        // 学员操作--验证用户登陆信息
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        String man_name = "xiaowang";
        String man_password = "123456";
        for(int i =1;i <= 3;i++) {
            System.out.print("请输入用户名:");
            String name = sc.next();
            System.out.print("请输入密码:");
            String password = sc.next();
            if(name.equals(man_name) && password.equals(man_password)) {
                flag = true;
                System.out.println("欢迎登陆MyShopping系统!");
                break;
            }else {
                System.out.println("输入错误!,您还有" + (3-i) + "次机会!");
                System.out.println();
                flag = false;
            }
        }
        if(flag == false) {
            System.out.println("对不起,您3次机会均输入错误!");
        }


    }
}
