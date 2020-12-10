package com.wyh.javastu.baseuse;

public class exer2 {

    public static void main(String[] args) {
        int year = 2012;
        double student = 250000;
        while(student <= 1000000) {
            student = student * (1 + 0.25);
            year++;
        }
        System.out.println("到"+ year +"年培训学员人数将达到1000000");

    }
}
