package com.itheima._03死锁;

/**
 * 目标：死锁。
 * <p>
 * 死锁是这样一个情形；多个线程同时被阻塞，它们中的一个或者全部狗仔等待某个资源释放，
 * 由于线程被无线期地阻塞，因此程序不可能正常终止。
 * <p>
 * 客户（占用资金，等待经销商的货品资源）  经销商（占用货品资源，等待客户的资金）
 * <p>
 * Java死锁产生的四个必要条件：
 * 1、互斥使用，即当资源被一个线程使用（占有）时，别的线程不能使用。
 * 2、不可抢占，资源请求者不能强制从资源占有者手中抢夺资源，资源只能由资源占有者主动释放。
 * 3、请求和保持，即当资源请求者在请求其他的资源的同时保持对原有资源的占有。
 * 4、循环等待，即存在一个等待循环队列：p1要p2的资源，p2要p1的资源，这样就形成了一个等待环路。
 * <p>
 * 当上述四个条件都成立的时候，便形成了死锁。当然，死锁的情况下如果打破上述任何一个条件，便可让死锁消失。
 */
public class ThreadDead {
    public static Object resource1 = new Object();
    public static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("11111");
                synchronized (resource2) {
                    System.out.println("11111");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (resource2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("22222");
                synchronized (resource1) {
                    System.out.println("22222");
                }
            }
        }).start();
    }
}
