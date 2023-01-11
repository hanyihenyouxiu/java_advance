package com.hanyi._11JDK1_8之后接口新增的方法;

/**
 目标：JDK1.8开始之后接口新增的三个方法。
 JDK1.8之前接口中只能是抽象方法和常量。
 JDK1.8之后接口不在单一。
 JDK1.8开始之后接口新增了三个方法：
    （1）默认方法：其实就是我们之前写的实例方法。
        --必须用default修饰
        --默认会加public修饰
        --只能用接口的实现类的对象来调用
    （2）静态方法。
        --默认会加public修饰
        --接口的静态方法只能接口类名本身调用
    （3）私有方法。（1.9才开始支持的）
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        PingPongMan pingPongMan = new PingPongMan();
        pingPongMan.run();
    }
}

class PingPongMan implements SportMan {

}

interface SportMan {
    //1.默认方法
    default void run() {
        System.out.println("跑的贼快！");
    }

    //2.静态方法
    static void inAddr() {

    }

    //3.私有方法
//    private void go() {
//
//    }
}