package com.hanyi._01线程通信;

/**
 * 目标：线程通信（了解原理，代码几乎不用）
 *
 *  线程通信：多个线程因为在同一个进程中，所以相互通信比较容易的。
 *
 *  线程通信的经典模型：生产者与消费者。
 *      生产者负责生成商品，消费者负责消费商品。
 *      生产不能过剩，消费不能没有。
 *
 *  注意：线程通信一定是多个线程在操作同一个资源才需要进行通信。
 *      线程通信必须先保证线程安全，否则毫无意义，代码也会报错！
 *
 *  线程通信的核心方法：
 *      public void wait()：让当前线程进入到等待状态 此方法必须锁对象调用。
 *      public void notify()：唤醒当前锁对象上等待状态的某个线程 此方法必须锁对象调用。
 *      public void notifyAll()：唤醒当前锁对象上等待状态的全部线程 此方法必须锁对象调用。
 */
public class ThreadCommunication {
    public static void main(String[] args) {
        // 创建一个共享账户。
        Account a = new Account("ICBC-111", 0);
        new DrawThread("小明", a).start();
        new DrawThread("小红", a).start();
        new SaveThread("f1", a).start();
        new SaveThread("f2", a).start();
        new SaveThread("f3", a).start();
    }
}
