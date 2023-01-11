package com.hanyi._09并发包_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * 目标：CyclicBarrier
 *
 * CyclicBarrier作用：
 *  某个线程任务必须等待其他线程执行完毕以后才能最终触发自己执行。
 * 构造器：
 *  public CyclicBarrier(int parties, Runnable barrierAction)
 *  // 用于在线层达到屏障5时，优先执行barrierAction，方便处理更复杂的业务场景。
 * 方法：
 *  public int await()
 *  // 每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞。
 * 小结：
 *  可以实现多线程中，某个任务在等待其他线程执行完毕以后触发。
 *  循环屏障可以实现达到一组屏障就触发一个任务执行。
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Meeting());
        Thread t1 = new Thread(new EmployeeThread(cyclicBarrier), "线程1");
        Thread t2 = new Thread(new EmployeeThread(cyclicBarrier), "线程2");
        Thread t3 = new Thread(new EmployeeThread(cyclicBarrier), "线程3");
        Thread t4 = new Thread(new EmployeeThread(cyclicBarrier), "线程4");
        Thread t5 = new Thread(new EmployeeThread(cyclicBarrier), "线程5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class Meeting implements Runnable {

    @Override
    public void run() {
        System.out.println("会议开始了！！");
    }
}

class EmployeeThread extends Thread {

    private CyclicBarrier cyclicBarrier;

    public EmployeeThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "正在进入会议");
            Thread.sleep(3000);
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
