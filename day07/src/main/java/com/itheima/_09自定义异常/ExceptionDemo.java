package com.itheima._09自定义异常;

/**
 * 目标：自定义异常
 *
 * 引入：Java已经为开发中可能出现的异常都设计了一个类来表示。
 *      但是实际开发中，异常可能有无数种情况，Java无法为
 *      这个世界上所有的异常都定义一个代表类。
 *      假如一个企业如果想为自己认为的某种业务问题定义成一个异常
 *      就需要自己来自定义异常类。
 *
 * 自定义异常：
 *      自定义编译时异常：
 *          a.定义一个异常类继承Exception
 *          b.重写构造器。
 *          c.再出现异常的地方用throw new 自定义对象抛出。
 *          编译时异常是编译阶段就会报错，体形更加强烈，一定需要处理！！
 *
 *      自定义运行时异常.
 *          a.定义一个异常类继承RuntimeException.
 *          b.重写构造器
 *          c.再出现异常的地方用throw new 已定义对象抛出！
 *          提醒不强烈，编译阶段不会报错！
 */
public class ExceptionDemo {
    public static void main(String[] args) {

    }

    public static void check(int age) {
        if (age >= 0) {
            System.out.println("nb");
        } else {
            try {
                throw new HanyiException("123");
            } catch (HanyiException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
