package com.itheima._09内部类_局部内部类;

/**
 * 目标：局部内部类
 *
 * 定义在方法中，在构造器中，代码块中，for循环中定义的内部类
 * 就是局部内部类。
 *
 * 局部内部类中的成份特点：
 *  可以定义实例成员，不能定义静态成员
 *  可以定义常量的。
 */
public class InnerClass {

    public static void main(String[] args) {
        class A{
            public void test() {

            }
        }

        A a = new A();
        a.test();
    }

    public static void test() {
        class Animal {

        }

        class Cat extends Animal {
        }
    }
}