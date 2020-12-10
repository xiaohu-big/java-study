package com.wyh.javastu.baseuse.设计模式.工厂方法模式;

public class FactoryDemo {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        Animal dog1 = dogFactory.CreateAnimal();
        dog1.eat();

        CatFactory catFactory = new CatFactory();
        Animal cat1 = catFactory.CreateAnimal();
        cat1.eat();

    }
}
