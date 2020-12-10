package com.wyh.javastu.baseuse.设计模式.工厂方法模式;



public class DogFactory implements Factory {
    @Override
    public Animal CreateAnimal() {
        return new Dog();
    }
}
