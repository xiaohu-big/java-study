package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class translate {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("请输入1-5当中的数字:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("该用户输入" + i + "对应的单词是Apple");
        } else if (i == 2) {
            System.out.println("该用户输入" + i + "对应的单词是banana");
        } else if (i == 3) {
            System.out.println("该用户输入" + i + "对应的单词是pear");
        } else if (i == 4) {
            System.out.println("该用户输入" + i + "对应的单词是peach");
        } else if (i == 5) {
            System.out.println("该用户输入" + i + "对应的单词是orange");
        }
    }
}
