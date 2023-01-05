package com.itheima._02异常_常见的运行时异常;

/**
 * 拓展：常见的运行时异常。
 *      运行时异常的概念：
 *      继承自RuntimeException的异常或者其子类，
 *      编译阶段是不会出错的，它是在运行阶段可能出现的错误，
 *      运行时异常编译阶段可以处理也可以不处理，代码编译都能通过！
 *
 *      1.数组索引越界异常：ArrayIndexOutOfBoundsException
 *      2.空指针异常：NullPointerException
 *          直接输出没有问题。但是调用空指针的变量的功能就会报错！！
 *      3.类型转换异常：ClassCastException
 *      4.迭代器遍历没有此元素异常：NoSuchElementException
 *      5.数学操作异常：ArithmeticException
 *
 * 小结：
 *  运行时异常继承了RuntimeException。编译阶段不会报错，运行时才可能会出现错误！
 */
public class ExceptionDemo {
}
