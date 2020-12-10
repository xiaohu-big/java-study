package com.wyh.javastu.baseuse;

import java.util.Scanner;

public class exer2_4 {
    public static void main(String[] args) {

        int[] stu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入五名学员的成绩:");
        for(int i = 0;i<stu.length;i++) {
            int a = sc.nextInt();
            stu[i] = a;
        }
        System.out.println("此时的学生成绩为:");
        System.out.println(java.util.Arrays.toString(stu));

        for(int x = 0;x<stu.length;x++) {
            for(int y = x;y<stu.length;y++ ) {
                if(stu[x]<stu[y]) {
                    int temp = stu[y];
                    stu[y] = stu[x];
                    stu[x] = temp;
                }
            }
        }
        System.out.println("排序后的学生成绩为:");
        System.out.println(java.util.Arrays.toString(stu));


    }

}
