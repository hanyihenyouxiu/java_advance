package com.hanyi._10继承后_成员方法的访问特点;

/**
 * 成员方法的访问特点：
 * <p>
 * 就近原则：
 * 子类有就找子类，子类没有就找父类，父类没有就报错。
 * 小结：子类优先自己的方法
 */
public class TestDemo {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.run();
        turtle.eat();
        //turtle.go();//报错
    }
}

class Animal{

    public void eat() {
        System.out.println("动物可以吃东西！");
    }
}

class Turtle extends Animal {

    public void run() {
        System.out.println("王文博跑的贼快！");
    }
}
