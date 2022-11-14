package com.itheima._03抽象类的特征;

/**
 * 目标：抽象类的特征
 *
 * 抽象类的特征是：有得有失。
 * 得：抽象类得到了拥有抽象方法的能力。
 * 失：抽象类失去了创建对象的能力。（抽象类不能创建对象）。
 *
 * 面试题：抽象类是否有构造器，抽象类是否可以创建对象？
 *    答：抽象类作为类一定有构造器，而且抽象类必须有构造器。
 *    提供给子类创建对象调用父类构造器使用。
 *
 *    抽象类虽然有构造器但是抽象类不能创建对象。
 *    没有方法体创建对象的意义就没有了，Java非常严谨。
 *
 *    抽象类本身意味着抽象，抽象不能具体化。
 * 注意：抽象类除了有得有失，类的其他成份它都具备。
 */
public class AbstractDemo {
    public static void main(String[] args) {

    }
}

abstract class Animal{

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    private String name;

    public void test() {

    }

    public static void inAddr() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}