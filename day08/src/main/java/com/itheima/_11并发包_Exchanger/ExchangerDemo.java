package com.itheima._11并发包_Exchanger;

import java.util.concurrent.Exchanger;

/**
 * 目标：Exchanger
 *
 * 作用：
 *      Exchanger（交换者）是一个用于线程间协作的工具类。Exchanger用于进行线程间的数据交换。
 *      这两个线程通过Exchanger方法交换数据，如果第一个线程先执行exchange()方法，它会一直等待第二个线程也执行exchange()方法
 *      当两个线程都到达同步点时，这两个线程就可以交换数据，将本线程产生出来的数据传递给对象。
 * Exchanger构造方法：
 *      public Exchanger()
 * Exchanger重要方法：
 *      public V exchange(V x)
 * 分析：
 *  (1)：需要两个线程。
 *  (2)：需要一个交换对象负责交换两个线程执行的结果。
 * 小结：
 *  Exchanger可以实现线程间的数据交换。
 */
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Girl(exchanger, "女子").start();
        new Boy(exchanger, "男子").start();
    }
}

class Boy extends Thread {
    private Exchanger<String> exchanger;

    Boy(Exchanger<String> exchanger, String name) {
        super(name);
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("男孩开始制作定情人物！");
        try {
            String rs = exchanger.exchange("男子的定情信物！");
            System.out.println(Thread.currentThread().getName() + "收到：" + rs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Girl extends Thread {

    private Exchanger<String> exchanger;

    Girl(Exchanger<String> exchanger, String name) {
        super(name);
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("女孩开始制作定情人物！");
        try {
            String rs = exchanger.exchange("女子的定情信物！");
            System.out.println(Thread.currentThread().getName() + "收到：" + rs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}