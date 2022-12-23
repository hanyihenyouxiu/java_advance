package com.itheima._12实现多个接口的使用注意事项;

/**
 * 扩展：实现多个接口的使用注意事项。
 * <p>
 * 1.如果实现了多个接口，多个接口中存在同名的静态方法并不会冲突，
 * 原因是只能通过各自接口名访问静态方法。
 * 2.当一个类，既继承了一个父类，又实现了若干个接口，
 * 父类中的成员方法与接口中的默认方法重名，父类就近选择执行父类的成员方法。
 * 3.当一个类实现多个接口时，多个接口中存在相同的默认方法。
 * 实现类必须重写这个方法。
 * 4.接口中，没有构造器，不能创建对象。
 * 接口是更彻底的抽象，连构造器都没有，自然不能创建对象。
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        //C.test(); 类只能访问自己的静态方法
    }
}

class C implements A, B{

}

interface A{
    static void test() {

    }
}

interface B{
    static void test() {

    }
}

class Cat extends Animal implements A1{

}

class Animal{
    public void run() {
        System.out.println("动物跑的贼快！");
    }
}

interface A1 {
    default void run() {
        System.out.println("接口中的跑的真快！");
    }
}