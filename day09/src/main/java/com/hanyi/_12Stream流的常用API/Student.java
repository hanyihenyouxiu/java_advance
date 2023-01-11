package com.hanyi._12Stream流的常用API;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/11
 * Time: 22:31
 * Description:
 *
 * @author 寒毅
 */
public class Student {

    public Student(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
