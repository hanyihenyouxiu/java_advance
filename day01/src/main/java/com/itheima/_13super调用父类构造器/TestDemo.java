package com.itheima._13super调用父类构造器;

/**
 * 目标：super调用父类构造器
 *
 * 特点：
 *  子类的全部构造器默认一定会调用父类的无参构造器。
 * super(...)：可以根据参数选择调用父类的某个构造器。
 *
 * 小结：
 *  可以在子类构造器中通过super(...)根据参数选择调用父类的构造器，以便调用父类构造器构造器初始化继承自父类的数据。
 */
public class TestDemo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("金丝猴", 10, '熊');
        monkey.eatBanana();
    }
}

class Monkey extends Animal {

    public Monkey() {
    }

    public Monkey(String name, Integer age, char sex) {
        super(name, age, sex);
    }

    public void eatBanana() {
        System.out.println(getName() + "-->" + getAge() + "-->" + getSex());
    }
}

class Animal {
    private String name;
    private Integer age;
    private char sex;

    public Animal() {
    }

    public Animal(String name, Integer age, char sex) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
