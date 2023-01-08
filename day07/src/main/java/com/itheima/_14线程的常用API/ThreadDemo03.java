package com.itheima._14线程的常用API;

/**
 * 目标：线程的常用API
 *
 * Thread类的API：
 *      1.public void setName(String name)：给当前线程取名字。
 *      2.public void getName()：获取当前线程的名字。
 *          -- 线程存在默认名字，子线程的默认名称是：Thread-索引
 *          -- 主线程的默认名称就是：main
 *      3.public static Thread currentThread()
 *          -- 获取当前线程对象，这个代码在那个线程中，就得到哪个线程对象。
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        Thread t1 = new MyThread01("线程一号");
        t1.start();

        Thread t2 = new MyThread01("线程二号");
        t2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->在执行" + i);;
        }
    }
}

class MyThread01 extends Thread{

    public MyThread01() {

    }

    public MyThread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "-->在执行" + i);;
        }
    }
}
