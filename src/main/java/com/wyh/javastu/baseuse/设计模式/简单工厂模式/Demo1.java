package com.wyh.javastu.baseuse.设计模式.简单工厂模式;

public class Demo1 {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.eat();
        Animal cat = AnimalFactory.createAnimal("Cat");
        cat.eat();
    }

}
