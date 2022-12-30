package com.itheima._04Set系列集合的使用;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 目标：TreeSet集合
 *
 * TreeSet集合称为排序不重复集合，可以对元素进行默认的升序排序。
 * TreeSet集合称为排序不重复集合，可以对元素进行默认的生序排序。
 *
 * TreeSet集合自排序的方式：
 *      1.有值特性的元素可以直接升序排序。
 *      2.字符串类型的元素会按照首字符的编号排序。
 *      3.对于自定义的引用数据类型，TreeSet默认无法排序，执行的时候直接报错，因为人家不知道排序规则。
 *
 * 自定义引用数据类型的排序实现：
 *      对于自定义的引用数据类型，TreeSet默认无法排序。
 *      所以我们需要定制排序的大小规则，程序员定义大小规则的方案有两种：
 *      a.直接为对象的类实现比较器规则接口Comparable，重写比较方法。
 *          程序员认为比较者大于被比较者，返回正数！
 *          程序员认为比较者小于被比较者，返回负数！
 *          程序员认为比较者等于被比较者，返回0！
 *      b.直接为集合设置比较器Comparator对象
 *          程序员认为比较者大于被比较者，返回正数！
 *          程序员认为比较者小于被比较者，返回负数！
 *          程序员认为比较者等于被比较者，返回0！
 *      注意：如果类和集合都带有比较规则，优先使用集合自带的比较规则。
 *  小结：TreeSet集合对自定义引用数据类型，默认无法进行。
 *      但是两种方式可以让程序员定义大小规则。
 */
public class TreeSetDemo05 {
    public static void main(String[] args) {
        Set<Double> scores = new TreeSet<>();
        scores.add(100.0);
        scores.add(99.9);
        scores.add(69.5);
        scores.add(0.1);
        scores.add(89.3);
        System.out.println(scores);

        Set<String> set = new TreeSet<>();
        set.add("Jack");
        set.add("rose");
        set.add("Dlei");
        set.add("about");
        set.add("bozai");
        set.add("caocao");
        set.add("Angle");
        System.out.println(set);

        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("播仔", 6500.0, 21));
        employees.add(new Employee("播妞", 7500.0, 18));
        employees.add(new Employee("乔治", 4500.0, 23));
        System.out.println(employees);


        // 降序 --
        Set<Employee> employees1 = new TreeSet<>((o1, o2) -> o2.getAge() - o1.getAge());
        employees1.add(new Employee("播仔", 6500.0, 21));
        employees1.add(new Employee("播妞", 7500.0, 18));
        employees1.add(new Employee("乔治", 4500.0, 23));
        System.out.println(employees1);
    }
}
