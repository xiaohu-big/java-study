package com.wyh.javastu.baseuse;

public class Choice {
    public static void main(String[] args) {
        // 数组
        int[] arr = { 5, 3, 7, 2, 6, 7, 6, 5, 4, 1, 9, 8 };
        // 第一次循环，是确定一个数依次和后面数的比较的数。
        for (int i = 0; i < arr.length - 1; i++) {
            // 这个是和第一个数的比较的数
            for (int j = i + 1; j < arr.length; j++) {
                // 定义一个临时的变量，用来交换变量
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println("arr["+i+"]="+arr[i]);
                System.out.println("arr["+j+"]="+arr[j]);
                System.out.println();

            }
        }
        // 打印最后的排序结果
        System.out.println(java.util.Arrays.toString(arr));
    }
}
