package com.itheima._15线程的创建_方式二;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/8
 * Time: 20:54
 * Description:
 *
 * @author 寒毅
 */
public class ThreadDemo02 {

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "==>" + i);
            }
        }).start();
    }
}
