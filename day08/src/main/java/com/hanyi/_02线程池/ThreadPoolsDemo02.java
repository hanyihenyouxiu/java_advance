package com.hanyi._02线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 目标：创建一个线程池。
 *
 * 线程池在java中的代表类：ExecutorService(接口)
 *
 * Java在Executor类下提供了一个静态方法得到一个线程池对象：
 *      1.public static ExecutorService newFixedThreadPool(int nThreads)：
 *      创建一个线程池返回
 * ExecutorService提交线程任务对象执行的方法：
 *      1.Future<？> submit(Runnable task)：提交一个Runnable的任务对象给线程池执行。
 * 小结：
 *      shutdown():// 等待任务执行完毕以后才会关闭线程池。
 *      shutdownNow():// 立即关闭线程池的代码，无论任务是否执行完毕！
 *      线程池中的线程可以被服用，线程用完以后可以继续去执行其他任务。
 */
public class ThreadPoolsDemo02 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<?> submit = executorService.submit(new MyRunnable());
        Future<?> submit1 = executorService.submit(new MyRunnable());
        Future<?> submit2 = executorService.submit(new MyRunnable());
        Future<?> submit3 = executorService.submit(new MyRunnable());
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "->>" + i);
        }
    }
}
