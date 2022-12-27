package com.itheima._10自定义泛型类;

import java.util.ArrayList;

/**
 * 目标：自定义泛型类。
 *
 * 引入：
 *      我们之前的泛型都是别人写好的，接下来我们来自定义泛型类使用。
 * 泛型类的概念：
 *      使用了泛型定义的类就是泛型类。
 * 泛型类的格式：
 *      修饰符 class 类名<泛型变量> {
 *
 *      }
 *      泛型变量建议使用E，T，K，V
 *      E - Element 集合
 *      T - Type    java类
 *      K - Key     键
 *      V - Value   值
 *
 * 需求：模拟ArrayList自定义一个集合MyArrayList集合。
 * 泛型类的核心思想，是把出现泛型变量的地方全部替换成传输的真是数据类型。
 */
public class GeneriitcyDemo {
    public static void main(String[] args) {
        MyArrayList<String> m = new MyArrayList<>();
        m.add("1");
        m.remove("@");
    }
}

class MyArrayList<E> {

    private ArrayList<E> list = new ArrayList<>();

    public void add(E e) {
        list.add(e);
    }

    public void remove(E e) {
        list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}