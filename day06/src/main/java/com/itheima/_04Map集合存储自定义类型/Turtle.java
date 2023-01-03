package com.itheima._04Map集合存储自定义类型;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/3
 * Time: 21:57
 * Description:
 *
 * @author 寒毅
 */
public class Turtle {
    private String name;
    private Integer age;

    public Turtle() {
    }

    public Turtle(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turtle turtle = (Turtle) o;
        return Objects.equals(name, turtle.name) && Objects.equals(age, turtle.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
