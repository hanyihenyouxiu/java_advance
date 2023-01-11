package com.hanyi._08并发包_CountDownLath;

import java.util.concurrent.CountDownLatch;

/**
 * 目标：CountDownLatch的使用。
 *
 * CountDownLatch允许一个或多个线程等他其它线程完成操作，在执行自己。
 *
 * 构造器：
 *  public CountDownLatch(int count)：初始化唤醒需要的down几步。
 * 方法：
 *  public void await() throws InterruptedException：让当前线程等待，必须down完才会执行。
 *  public void countDown()：计数器进行减一
 * 小结：
 *  CountDownLatch可以控制线程在执行过程中等待自己，让其他线程唤醒自己。
 */
public class CountDownLathDemo {

    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(1);
        ThreadA threadA = new ThreadA(c);
        ThreadB threadB = new ThreadB(c);
        threadA.start();
        threadB.start();
    }
}

class ThreadA extends Thread {

    private CountDownLatch countDownLatch;

    public ThreadA(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        System.out.println("A");
        try {
            this.countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("C");
    }
}

class ThreadB extends Thread{

    private CountDownLatch countDownLatch;

    public ThreadB(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        System.out.println("B");
        countDownLatch.countDown();
    }
}
