package com.wyh.javastu.baseuse.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author WYH
 * @version 2019年11月17日 下午8:13:52
 *
 * 根据键值对对象找键和值
 */
public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        //添加元素
        map.put("小月", "小美");
        map.put("李晨", "范冰冰");
        map.put("邓超","孙俪");
        map.put("黄晓明", "杨颖");

        Set<Map.Entry<String,String>> set = map.entrySet();

        for(Map.Entry<String,String> me : set) {
            System.out.println(me.getKey()+"---"+me.getValue());
        }
    }

}