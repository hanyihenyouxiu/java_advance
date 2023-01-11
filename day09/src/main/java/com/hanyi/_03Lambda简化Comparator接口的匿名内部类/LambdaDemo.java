package com.hanyi._03Lambda简化Comparator接口的匿名内部类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 目标：Lambda简化Comparator接口匿名内部类写法
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("黎明", 18, '男');
        Student s2 = new Student("周杰伦", 19, '男');
        Student s3 = new Student("张杰", 20, '男');
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 按照年龄进行排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());


        Collections.sort(list, Comparator.comparingInt(Student::getAge));
    }
}
