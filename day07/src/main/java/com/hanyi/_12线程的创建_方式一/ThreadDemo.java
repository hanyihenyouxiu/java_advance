package com.hanyi._12线程的创建_方式一;

/**
 * 目标：线程的创建方式一。
 * <p>
 * 多线程是很有用的，我们在程序中创建线程的方式有三种：
 * 1.直接定义一个类继承线程类Thread，重写run()方法，创建线程对象
 * 调用线程对象的start()方法启动线程。
 * 2.定义一个线程任务类实现Runnable接口，重写run()方法，创建线程任务对象，把
 * 线程任务对象包装成线程对象，调用线程对象的start()方法启动线程。
 * 3.实现Callable接口
 * <p>
 * a.继承Thread类的方式
 * -- 1.定义一个线程类继承Thread类。
 * -- 2.重写run()方法。
 * -- 3.创建一个新的线程对象。
 * -- 4.调用线程对象的start()方法启动线程。
 *
 * 继承Thread类的优缺点：
 *      优点：代码简单
 *      缺点：线程类已经继承了Thread类无法继承其它类了，功能不能通过继承拓展（单继承的局限性）。
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("阿里巴");
    }
}
