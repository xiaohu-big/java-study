package com.wyh.javastu.baseuse.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author WYH
 * @version 2020年11月9日 下午4:39:09
 *
 * List:
 * 有序集合（也称为序列(“存储与取出的顺序一致”) ）。 该界面的用户可以精确控制列表中每个元素的插入位置。
 * 用户可以通过整数索引（列表中的位置）访问元素，并搜索列表中的元素。
 * 与集合不同，列表通常允许重复的元素。
 * 更正式地，列表通常允许元素e1和e2成对使得e1.equals(e2) ，并且如果它们允许空元素，它们通常允许多个空元素。
 * 有人可能希望实现一个禁止重复的列表，当用户尝试插入时会抛出运行时异常，但是我们预计这种使用是罕见的。
 */
public class ListDemo1 {

    static void show(List list) {
        Iterator it = list.iterator();
        while(it.hasNext()) {
            String s = (String)it.next();
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        //创建List集合
        List l1 = new ArrayList();

        //创建字符串对象并进行添加
        l1.add("a");
        l1.add("b");

        System.out.println("add(int index, E element):**********************************");

        //add(int index, E element):将指定的元素插入此列表中的指定位置（可选操作）下标从0开始
        l1.add(1,"xiaowang");//没有问题
        //l1.add(11,"li");//IndexOutOfBoundsException 报错，下表越界！
        l1.add(3,"xiaoli");//在集合界后面一个可以添加
        //l1.add(5,"asd"); //IndexOutOfBoundsException 报错，下表越界！
        show(l1);

        System.out.println("获取功能 Object get(int index) :******************************");

        //B:获取功能 get(int index) 返回此列表中指定位置的元素。
        System.out.println("get:"+l1.get(2));
        //IndexOutOfBoundsException 报错，下表越界！
        //System.out.println("get:"+l1.get(11));

        System.out.println(" Object remove(int index)删除该列表中指定位置的元素（可选操作）。****");
        //remove(int index) 删除该列表中指定位置的元素（可选操作）。
        System.out.println("remove:"+l1.remove(1)); //返回移除的元素
        show(l1);
        //System.out.println("remove:"+l1.remove(11)); //IndexOutOfBoundsException 报错，下表越界！

        System.out.println("Object set(int index, E element) 用指定的元素（可选操作）替换此列表中指定位置的元素。 ****");
        System.out.println("set:"+l1.set(1, "xiaowangya")); //返回被修改的元素
        show(l1);



    }
}