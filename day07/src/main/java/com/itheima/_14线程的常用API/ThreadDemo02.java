package com.itheima._14线程的常用API;

/**
 * Created with IntelliJ IDEA.
 * 目标：线程休眠API
 *
 * public static void sleep(long time)：让当前线程休眠多少毫秒。
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Thread m = new MyThread();
        m.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程运行中");
        }
    }
}
