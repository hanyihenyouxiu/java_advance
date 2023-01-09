package com.itheima._02线程池;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1.Future<？> submit(Callable task)：提交一个Runnable的任务对象给线程池执行。
 */
public class ThreadPoolsDemo03 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new MyCallable());
        executorService.submit(new MyCallable());
        executorService.submit(new MyCallable());
        executorService.submit(new MyCallable());
    }
}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
        return "1";
    }
}
