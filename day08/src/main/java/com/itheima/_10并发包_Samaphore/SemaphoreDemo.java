package com.itheima._10并发包_Samaphore;

import java.util.concurrent.Semaphore;

/**
 * 目标：Semaphore的使用介绍。
 * 引入：
 *      Semaphore（发信号）的主要作用是控制线程的并发数量。
 *      synchronized可以起到"锁"的作用，但某个时间段内，只能有一个线程允许执行。
 *      Semaphore可以设计同时允许几个线程执行。
 *      Semaphore字面意思是信号量的意思，它的作用是控制访问特定资源的线程数目。
 * Semaphore的构造器：
 *      public Semaphore(int permits)：  permits表示许可线程的数量
 *      public Semaphore(int permits, boolean fair)：fair表示公平性，如果这个设置为true，下次会优先执行等待时间最久的线程。
 * Semaphore的方法：
 *      public void acquire() throws InterruptedException 表示获取许可
 *      public void release() 表示释放许可。
 * 小结：
 *  Semaphore可以控制线程并发占用锁的数量。
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Service service = new Service();
        new Thread(new MyThread(service), "线程一").start();
        new Thread(new MyThread(service), "线程二").start();
        new Thread(new MyThread(service), "线程三").start();
        new Thread(new MyThread(service), "线程四").start();
        new Thread(new MyThread(service), "线程五").start();

    }
}

class MyThread extends Thread {
    private Service service;

    MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
       service.login();
    }
}

class Service{
    private Semaphore semaphore = new Semaphore(2);

    public void login() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "进入时间=" + System.currentTimeMillis());
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + "登陆成功！");
            System.out.println(Thread.currentThread().getName() + "离开时间=" + System.currentTimeMillis());
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
