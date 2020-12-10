package com.wyh.javastu.baseuse.设计模式.简单工厂模式;

public class AnimalFactory {
    public AnimalFactory() {
    }

    public static Animal createAnimal(String type){
        if("Dog".equals(type)){
            return new Dog();
        }else if("Cat".equals(type)){
            return new Cat();
        }else{
            return null;
        }
    }
}
