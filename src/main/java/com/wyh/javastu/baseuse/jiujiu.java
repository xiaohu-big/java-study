package com.wyh.javastu.baseuse;

public class jiujiu {

    public static void main(String[] args) {
        int result = 0;
        for(int i=1;i<10;i++) {
            for(int j=1;j<=i;j++) {
                result = i*j;
                System.out.print(j+"*"+i+"="+result+"\t");
            }
            System.out.println();
        }

    }
}
