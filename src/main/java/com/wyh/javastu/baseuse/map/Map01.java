package com.wyh.javastu.baseuse.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author WYH
 * @version 2019年11月20日 上午9:44:41
 *
 * * 1、添加功能
 *   V put(K key, V value) 将指定的值与该映射中的指定键相关联（可选操作）。
 * 2、删除功能
 *   void clear() 从该地图中删除所有的映射（可选操作）。
 *   V remove(Object key) 如果存在（从可选的操作），从该地图中删除一个键的映射。
 * 3、判断功能
 *   boolean containsKey(Object key) 如果此映射包含指定键的映射，则返回 true 。
 *   boolean containsValue(Object Value)  如果此地图将一个或多个键映射到指定的值，则返回 true 。
 *   boolean isEmpty() 如果此地图不包含键值映射，则返回 true 。
 * 4、获取功能
 *   Set<Map.Entry<K,V>> entrySet() 返回此地图中包含的映射的Set视图。
 *   V get(Object key) 返回到指定键所映射的值，或 null如果此映射包含该键的映射。
 *   Set<K> keySet() 返回此地图中包含的键的Set视图。
 *   Collection<V> values() 返回此地图中包含的值的Collection视图。
 * 5、长度功能
 *   int size() 返回此地图中键值映射的数量。
 */
public class Map01 {
    public static void main(String[] args) {
        //
        Map<String,String> map = new HashMap<String,String>();


        //V put(K key, V value) 将指定的值与该映射中的指定键相关联（可选操作）。
        map.put("王友虎", "超人");
        map.put("赵以浩", "绿巨人");
        map.put("李宏灿", "奇异博士");
        map.put("齐博源", "雷神");

        //void clear() 从该地图中删除所有的映射（可选操作）。
        //map.clear();

        //V remove(Object key) 如果存在（从可选的操作），从该地图中删除一个键的映射。
        //map.remove("王友虎");

        //boolean containsKey(Object key) 如果此映射包含指定键的映射，则返回 true 。
        //System.out.println("containsKey:"+map.containsKey("王友虎"));

        //boolean isEmpty() 如果此地图不包含键值映射，则返回 true 。
        //System.out.println("isEmpty:"+map.isEmpty());


        //int size() 返回此地图中键值映射的数量。
        //System.out.println("size:"+map.size());


        //Set<K> keySet() 返回此地图中包含的键的Set视图。
        Set<String> set = map.keySet();
        for(String s : set) {
            //V get(Object key) 返回到指定键所映射的值，或 null如果此映射包含该键的映射。
            System.out.println(s+"---"+map.get(s));
        }


        System.out.println(map);


    }

}
