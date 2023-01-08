package com.itheima._07finally关键字;

/**
 * 目标：finally关键字
 *
 * 用在捕获处理的异常格式中的，放在最后面。
 *      try {
 *          // 可能会出现异常的代码
 *      } catch (Exception e) {
 *          e.printStackTrace();
 *      } finally {
 *          // 无论是出现异常还是正常运行都会执行的代码块
 *      }
 *
 *      try 1 次
 *      catch 0-n次 （可以直接finally不写catch)
 *      finally 0-1次
 *
 *      finally的作用：可以在代码执行完毕以后进行资源的释放。
 *      什么是资源？资源都是实现了closeable接口的，都自带close()关闭方法。
 */
public class FinallyDemo {
}
