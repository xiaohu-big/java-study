package com.wyh.javastu.baseuse;

public class exer10 {

    public static void main(String[] args) {
        // do-while 华氏温度 = 摄氏温度 * 9 / 5.0 + 32
        float s = 0;
        float h = 0;
        int i = 1;
        do {
            h = (float) (s * 9 / 5.0 + 32);
            System.out.println("摄氏温度" + s + "对应的华氏温度:" + h);
            s = s + 20;
            i++;
        } while (i <= 10 && s <= 250);

    }
}
