package com.itheima._15继承的特点;

/**
 * 目标：继承的特点
 * 1.单继承：一个类只能继承一个直接父类。
 *  为什么Java是单继承？
 *  答：容易造成语法混乱。
 * 2.多层继承：一个类可以间接继承多个父类。（家谱）
 *
 * 3.一个类可以有多个子类。
 * 4.一个类要么默认继承了Object类，要么间接继承了Object类，Object类是Java中的祖宗类。
 */
public class ExtendsDemo {

}

class A {

}

class B extends A {

}

class C extends B{

}
