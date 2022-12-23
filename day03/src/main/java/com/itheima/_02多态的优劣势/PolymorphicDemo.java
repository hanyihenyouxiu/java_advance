package com.itheima._02多态的优劣势;

/**
 * 目标：多态的优劣势
 *
 * 优势：
 *      1.在多态的形式下，右边对象可以实现组件化切换，业务功能也随之改变，
 *      便于扩展和维护。
 *      2.实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，
 *      可以传入一切子类对象进行方法的调用，更能体现出多态的扩展性与便利。
 *
 * 劣势：
 *      1.多态形式下，不能直接调用子类特有的功能。编译看左边！！
 *      父类中没有子类特有的功能，所以代码在编译阶段就直接报错了！
 * 小结：
 *      记住以上语法。
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.run();
    }

    //public static void go(Dog dog) {
    public static void go(Animal dog) {
        System.out.println("开始！");
        dog.run();
        System.out.println("结束！");
    }
}

class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("狗跑的贼快！");
    }
}

class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("小猫咪跑的快！");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠。。");
    }
}

class Animal {
    public void run() {
        System.out.println("动物跑！");
    }

    public void lookDoor() {
        System.out.println("狗看门。。");
    }
}
