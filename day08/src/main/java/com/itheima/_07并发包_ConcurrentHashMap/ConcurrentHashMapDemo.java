package com.itheima._07并发包_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 目标：并发包的介绍。
 *
 * 并发包的来历：
 *  在实际开发中如果不需要考虑线程安安全问题，大家不需要做线程安全，因为如果做了反而性能不好！
 *  但是开发中有很多业务是需要考虑线程安全问题的，此时就必须考虑了，否则业务出现问题。
 *  Java很多业务场景提供了性能优异，且线程安全的并发包，程序员可以选择使用。
 *
 *  Map集合中的典型集合：HashMap它是线程不安全的，性能好
 *      -- 如果在要求线程安全的业务情况下就不能用这个集合做Map集合，否则业务会崩溃~~
 *  为了保证线程安全，可以使用HashTable、注意：线程中加入了计时
 *      -- HashTable是线程安全的Map集合，但是性能较差！
 *  为了保证线程安全，再看ConcurrentHashMap（不止线程安全，而且效率高，性能好，最新最好用的线程安全Map集合）
 *      -- ConcurrentHashMap保证了线程安全，综合性能较好！
 */
public class ConcurrentHashMapDemo {

    //public static Map<String, String> map = new HashMap<>();
    public static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "线程一");
        t1.start();
        Thread t2 = new Thread(new MyRunnable(), "线程二");
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(map.size());
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 50000; i++) {
            ConcurrentHashMapDemo.map.put(Thread.currentThread().getName() + i, i + "");
        }
    }
}
