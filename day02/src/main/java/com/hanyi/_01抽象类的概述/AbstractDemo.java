package com.hanyi._01抽象类的概述;

/**
 * 目标：抽象类的概述。
 *
 * 什么是抽象类？
 *      父类想知道子类一定要完成某个功能，但是每个子类完成的情况是不一样的。
 *      子类以后也不会用自己重写的功能，那么父类的该功能就可以定义成抽象方法，子类重写调用子类自己的就可以了。
 * 什么是抽象方法？
 *      抽象方法：没有方法体，只有方法签名，必须用abstract修饰。
 *      拥有抽象方法的类必须定义成抽象类。
 */
public class AbstractDemo {

}

class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("狗跑的贼快...");
    }
}

class Cat extends Animal{
    public void run() {
        System.out.println("猫跑的贼快...");
    }
}

abstract class Animal {
    public abstract void run();
}
