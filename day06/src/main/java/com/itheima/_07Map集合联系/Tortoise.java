package com.itheima._07Map集合联系;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/3
 * Time: 22:20
 * Description:
 *
 * @author 寒毅
 */
public class Tortoise implements Comparable<Tortoise> {
    private String name;
    private Integer age;

    public Tortoise() {
    }

    public Tortoise(String name, Integer age) {
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
        return "Tortoise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Tortoise o) {
        return o.age - this.getAge();
    }
}
