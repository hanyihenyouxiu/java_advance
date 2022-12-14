package com.hanyi._05异常_编译时异常的处理机制;

/**
 * 目标：编译时异常的处理方式一。
 *
 * 编译时异常：编译阶段就会报错，一定需要程序处理的，否则代码无法通过！
 *
 * 抛出格式：
 *  方法 throws 异常1，异常2，..{
 *
 *  }
 *  建议抛出异常的方法：代表一切异常
 *  方法 throws Exception{
 *
 *  }
 *
 * 方式一：
 *      出现编译时异常的地方层层把异常抛出去给调用者，调用者最终抛出给JVM虚拟机。
 *      JVM虚拟机输出异常信息，直接干掉程序，这种方式与默认方式是一样的。
 *      虽然可以解决代码编译时的错误，但是一旦运行时真的出现异常，程序还是会立即死亡！
 *      这种方式不好！
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {

    }
}
