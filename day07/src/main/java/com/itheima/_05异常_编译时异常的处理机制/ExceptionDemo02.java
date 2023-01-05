package com.itheima._05异常_编译时异常的处理机制;

/**
 * 目标：编译时异常的处理方式二。
 *
 * 方式二：再出现异常的地方自己处理，谁出现谁处理。
 *
 * 自己捕获异常和处理异常的格式：捕获异常
 *      try {
 *          // 监视可能出现异常的代码
 *      } catch(异常类型1 变量) {
 *          // 处理异常
 *      } catch(异常类型2 变量) {
 *          // 处理异常
 *      } ...
 *
 * 监视捕获处理异常企业级写法：
 *      try {
 *          // 可能出现异常的代码
 *      } catch(Exception e) {
 *          e.printStackTrace(); // 直接打印异常栈信息
 *      }
 *      可以捕获处理一切异常类型！
 *
 * 小结：
 *      第二种方式可以处理异常，并且出现异常后代吗也不会死亡。
 *      这种方案还是可以的。
 *      但是从理论上来说，这种方式不是最好的，上层调用者不能直接知道底层的执行情况！
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {

    }
}
