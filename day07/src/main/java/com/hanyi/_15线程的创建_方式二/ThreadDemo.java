package com.hanyi._15线程的创建_方式二;

/**
 * 目标：线程的创建方式二。
 *
 * b.实现Runnable接口的方式。
 *  -- 1.创建一个线程任务类实现Runnable接口。
 *  -- 2.重写run()方法。
 *  -- 3.创建一个线程任务对象。
 *  -- 4.把线程任务对象包装成线程对象。
 *  -- 5.调用线程对象的start()方法启动线程。
 *
 * 实现Runnable接口的优缺点：
 *  优点：
 *      -- 线程任务类只是实现了Runnable接口，可以继续继承其它类，同时可以继续实现其他接口。
 *      -- 一个线程任务对象可以被共享成多个线程对象。适合做多线程的资源共享操作。
 *      -- 增加程序的健壮性，实现解耦操作，代码可呗被多个线程共享，代码和线程独立。
 *      -- 线程池可以放入实现Runnable或Callable线程任务对象。
 *          注意：其实Thread类本身也是实现了Runnable接口的。
 *  缺点：
 *      代码复杂一些、
 * Thread的构造器：
 *      -- public Thread(){}
 *      -- public Thread(String name){}
 *      -- public Thread(Runnable target){}
 *      -- public Thread(Runnable target, String name){}
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable(), "线程一");
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}
