package com.itheima._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;

/**
 * b.foreach(增强for循环)遍历集合
 *  foreach是一种遍历形式，可以遍历集合或者数组。
 *  foreach遍历集合实际上是迭代器遍历的简化写法。
 *  foreach遍历的关键是记住格式。
 *      for(被遍历集合或者数组中元素的类型 变量名称 : 被遍历集合或者数组 {
 *
 *      }
 *  小结：
 *      foreach遍历集合或者数组很方便。
 *      缺点：foreach遍历不知道遍历到那个元素了，只能从头到尾。无索引。
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("殷素素");
        lists.add("周芷若");
        System.out.println(lists);

        for (String ele : lists) {
            System.out.println(ele);
        }

        int[] ages = new int[]{17, 18, 38, 21};
        for (int age : ages) {
            System.out.println(age);
        }
    }
}
