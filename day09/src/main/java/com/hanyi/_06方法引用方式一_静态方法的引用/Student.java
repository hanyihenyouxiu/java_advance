package com.hanyi._06方法引用方式一_静态方法的引用;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2023/1/11
 * Time: 17:06
 * Description:
 *
 * @author 寒毅
 */
public class Student {
    private String name;
    private int age;
    private char sex;

    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
