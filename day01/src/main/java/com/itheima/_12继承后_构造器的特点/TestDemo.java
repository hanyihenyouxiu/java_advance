package com.itheima._12继承后_构造器的特点;

/**
 * 目标：继承后-构造器的特点。
 *
 * 特点：
 *      子类构造器的第一行默认一定会先访问父类的无参构造器，在执行子类自己的构造器。
 * 为什么子类构造器会先调用父类构造器？
 *      1.子类的构造器的第一行默认有一个super()调用父类的无参数构造器，写不写都存在！
 *      2.子类继承父类，子类就得到了父类的属性和行为。
 *          当我们调用子类构造器初始化子类对象数据的时候，必须先调用父类构造器初始化继承自父类的属性和行为
 */
public class TestDemo {
    Tiger t = new Tiger();
}

class Animal{
    public Animal() {
        System.out.println("Animal的无参构造器");
    }
}

class Tiger extends Animal {
    private String name;

    public Tiger() {
        // super(); //默认存在的，根据参数去匹配调用父类的构造器
        System.out.println("Tiger的无参构造器");
    }

    public Tiger(String name) {
        this.name = name;
    }
}