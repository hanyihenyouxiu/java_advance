package com.hanyi._08TCP通信方式四;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/2/15
 * Time: 22:07
 * Description:
 *
 * @author 寒毅
 */
public class HandlerSocketThreadPool {

    private ExecutorService executorService;

    public HandlerSocketThreadPool(int maxPoolSize, int queueSize) {
        executorService = new ThreadPoolExecutor(
                maxPoolSize,
                maxPoolSize,
                120L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(queueSize)
        );
    }

    public void execute(Runnable task) {
        this.executorService.execute(task);
    }
}
