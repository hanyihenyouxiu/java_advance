package com.hanyi._06原子性;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 目标：保证原子性操作方案二：使用原子类，性能搞笑，线程安全。
 *
 * 概述：Java从JDK1.5开始提供了java.util.concurrent.atomic包
 *  这个包中的院子操作提供了用法简单，性能高效，线程安全的更新一个变量的方式。
 *
 * 原子类：可以实现原子更新操作
 * int get()                                获取值
 * int getAndIncrement():                   以原子方式将前面值加怡，注意，这里返回的是自增前的值
 * int incrementAndGet()                    以原子方式将当前值加一，注意这里返回的是自增后的值。
 * int addAndGet(int date)                  以原子方式将输入的数值与实例中的值相加
 * int getAndSet(int value)                 以原子方式将设置为newValue的值，并返回就只、
 */
public class VolatileAtomicDemo03 {

    public static void main(String[] args) {
        MyRunnable03 m = new MyRunnable03();
        for (int i = 0; i < 100; i++) {
            new Thread(m).start();
        }
    }

}

class MyRunnable03 implements Runnable {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            count.incrementAndGet();
            System.out.println(count);
        }

    }
}
