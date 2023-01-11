package com.hanyi._07继承的使用案例;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2022/11/8
 * Time: 15:23
 * Description:
 *
 * @author 寒毅
 */
public class People {

    private String name;
    private Integer age;

    public void eat() {
        System.out.println(name + "在吃饭！");
    }

    public People() {

    }

    public People(String name, Integer age) {
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
}
