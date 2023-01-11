package com.hanyi._02Map集合的API;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 目标：Map集合的常用API
 *  - public V put(K key, V value)：把指定的键与指定的值添加到Map集合中。
 *  - public V remove(Object key)：把指定的键，所对应的键值对元素，在Map集合中删除，返回被删除的元素。
 *  - public V get(Object key)：根据指定的键，在Map集合中返回对应的值。
 *  - public set<E> keySet()：获取Map集合中所有的键，存储到Set集合中。
 *  - public Set<Map.Entry<K, V>> entrySet：获取Map集合中所有的键值对对象的集合(Set集合)
 *  - public boolean containKey(Object key)：判断该集合中是否有键值。
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("嘎嘎", 1);
        map.put("华为", 10);
        map.put("iphoneXS", 2);
        map.put("娃娃", 30);
        map.put(null, null);
        System.out.println(map);
        // 清空集合
        //map.clear();

        // 判断集合为空
        System.out.println(map.isEmpty());

        // 根据键获取对应值
        System.out.println(map.get("娃娃"));


        // 根据键返回值
        System.out.println(map.remove(null));

        // 判断是否包含某个键，
        System.out.println(map.containsKey("华为"));

        // 判断是否包含某个值
        System.out.println(map.containsValue(1));

        // 获取全部键
        Set<String> strings = map.keySet();
        strings.forEach(System.out::println);

        // 获取全部值得集合
        Collection<Integer> values = map.values();
        values.forEach(System.out::println);

        // 集合的大小
        System.out.println(map.size());

        // 输出去当前集合的全部键值对
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        // 合并其它集合
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("1", 2);
        map1.put("2", 3);
        map1.put("3", 4);
        map.putAll(map1);
        System.out.println(map);
    }
}
