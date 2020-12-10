package com.wyh.javastu.baseuse;

public class ArrayDemo4 {

    public static void main(String[] args) {
        /*
         *数组操作的方法
         *
         */

        //数组方法---数组复制 System.arraycopy(原数组名称,从原数组哪个地方开始复制,目标数组名称,从目标数组哪个位置开始复制,复制的长度);
        int a1[] = new int[] {12,32,43,5,4,43,2};
        int a2[] = new int[] {11,22,33,44,55,66};

        System.arraycopy(a1, 3, a2, 1, 3);

        for(int i = 0;i<a2.length;i++) {
            System.out.println(a2[i]+" ");  //11 5 4 43 55 66
        }
        System.out.println("--------------------");

        //数组排序  java.util.Arrays.sort(数组名称);
        int a3[] = new int[] {21,43,54,4,345,65,23,1,32};
        java.util.Arrays.sort(a3);
        for(int i = 0;i<a3.length;i++) {
            System.out.print(a3[i]+" ");
        }



    }
}
