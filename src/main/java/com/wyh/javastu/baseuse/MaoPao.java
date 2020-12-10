package com.wyh.javastu.baseuse;

public class MaoPao {
    public static void main(String[] args) {
        //数组
        int[] arr = {5,3,7,2,6,7,6,5,4,1,9,8};
        //外部循环
        System.out.println("开始第1次遍历对比");
        for(int i=0;i<arr.length-1;i++){
            //相连两个数的索引是利用内部循环
            for(int index=0;index<arr.length-1-i;index++){
                //同样利用中间变量，注意区分与选择排序的区分
                if(arr[index]>arr[index+1]){
                    int temp=arr[index];
                    arr[index]=arr[index+1];
                    arr[index+1]=temp;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(java.util.Arrays.toString(arr));
            System.out.println("开始第"+(i+2)+"次遍历对比");

        }
        System.out.println(java.util.Arrays.toString(arr)); //Arrays.toString() 返回指定数组的内容的字符串表示形式。
    }
}
