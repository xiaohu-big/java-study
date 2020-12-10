package com.wyh.javastu.baseuse.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author WYH
 * @version 2019年11月15日 下午10:00:39
 *
 * 泛型之高级通配符
 *
 * ?: 任意类型，如果没有明确，那就是Object类型以及任意的Java类了
 * ? extends E: 向下限定，限定E 及其子类
 * ? super E:  向上限定，限定E 及其父类
 */

class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

public class GenericDemo1 {
    public static void main(String[] args) {

        // 泛型如果明确写的时候，前后必须一致！
        Collection<Object> c1 = new ArrayList<Object>();
        /*
         * Collection<Object> c2 = new ArrayList<Animal>(); Collection<Object> c3 = new
         * ArrayList<Dog>(); Collection<Object> c4 = new ArrayList<Cat>();
         */

        // ? 表示任一类型是可以滴
        Collection<?> c5 = new ArrayList<Object>();
        Collection<?> c2 = new ArrayList<Animal>();
        Collection<?> c3 = new ArrayList<Dog>();
        Collection<?> c4 = new ArrayList<Cat>();

        // ? extends E: 向下限定，限定E 及其子类
        // Collection<? extends Animal> c6 = new ArrayList<Object>(); //报错
        Collection<? extends Animal> c7 = new ArrayList<Dog>();
        Collection<? extends Animal> c8 = new ArrayList<Cat>();
        Collection<? extends Animal> c9 = new ArrayList<Animal>();

        // ? super E: 向上限定，限定E 及其父类
        Collection<? super Animal> c10 = new ArrayList<Object>();
        Collection<? super Animal> c13 = new ArrayList<Animal>();
//        Collection<? super Animal> c11 = new ArrayList<Dog>(); //报错
//        Collection<? super Animal> c12 = new ArrayList<Cat>();



    }
}
