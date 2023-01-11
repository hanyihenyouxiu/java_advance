package com.hanyi._08继承_子类不能继承父类的内容;

/**
 * 目标：子类不能继承父类的内容
 *
 * 引入：
 *  子类继承父类：子类就得到了父类的属性和行为
 *  但是并非所有父类的属性和行为等子类都可以继承。
 * 子类不能继承父类的东西：
 *  子类不能继承父类的构造器：子类有自己的构造器。（没有争议的）
 * 有争议的观点：
 *  子类是否可以继承父类的私有成员（私有成员变量，私有成员方法）？
 *
 *  子类是否可以继承父类的静态成员？
 *
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.name);
        c.run();
    }
}

class Cat extends Animal {

}

class Animal {
    public String name;

    public static void test() {

    }

    public void run() {

    }
}
