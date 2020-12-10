package com.wyh.javastu.baseuse.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author WYH
 * @version 2019年11月17日 下午7:51:02

 *
 *
 * 根据键找值
 */
public class MapDemo3
{
    public static void main(String[] args) {
        //创建map集合
        Map<String,String> map = new HashMap<String,String>();

        //添加元素
        map.put("小月", "小美");
        map.put("李晨", "范冰冰");
        map.put("邓超","孙俪");
        map.put("黄晓明", "杨颖");

        //获取到所有的key
        Set<String> set = map.keySet();

        //遍历
        for(String key : set) {
            String s = map.get(key);
            System.out.println(key+"---"+s);
        }

    }

}