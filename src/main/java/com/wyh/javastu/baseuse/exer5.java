package com.wyh.javastu.baseuse;

import java.util.Scanner;

/**
 *
 * 使用Arrays对数组进行排序
 */
public class exer5 {
    // {"a","c","u","b","e","p","f","z"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[9];
        s[0] = "a";
        s[1] = "c";
        s[2] = "u";
        s[3] = "b";
        s[4] = "e";
        s[5] = "p";
        s[6] = "f";
        s[7] = "z";

        System.out.print("元字符序列:");
        for(int i =0;i<s.length;i++) {
            System.out.print(s[i]+" ");
        }

        System.out.println();
        System.out.print("待插入的字符是:");
        String a = sc.next();

        s[8] = a;
        java.util.Arrays.sort(s);

        System.out.print("排序后的序列:");
        for(int i =0;i<s.length;i++) {
            System.out.print(s[i]+" ");
        }

    }
}
