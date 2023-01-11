package com.hanyi._06方法引用方式一_静态方法的引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 目标：方法引用有四种形式。
 * 1.静态方法的引用。
 * 2.实例方法的引用。
 * 3.特定类型方法的引用。
 * 4.构造器引用
 *
 * 1.静态方法的引用。
 *  引用格式：
 *      类名::静态方法。
 *  简化步骤：
 *      a.定义一个静态方法，把需要简化的代码方到一个静态方法中去。
 *  静态方法引用的注意事项
 *      "重要：被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致。"
 *      如果函数式接口的抽象方法有返回值，则被引用的方法必须也有相同的返回值。
 *      如果函数式接口的抽象方法没有返回值，则被引用的方法可以有返回值，也可以没有返回值。
 * 小结：
 *      静态方法引用简化Lambda表达式。
 *      前面的参数后面的方法的参数个数一样的情况下才能尝试方法引用简化。
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("黎明", 18, '男');
        Student s2 = new Student("周杰伦", 19, '男');
        Student s3 = new Student("张杰", 20, '男');
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, (o1, o2) -> Student.compareByAge(o1, o2));

        Collections.sort(list, Student::compareByAge); // 方法引用
    }
}
