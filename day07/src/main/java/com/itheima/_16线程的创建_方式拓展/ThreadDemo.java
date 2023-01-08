package com.itheima._16线程的创建_方式拓展;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * c.线程的创建方式三：实现Callable接口。
 *      -- 1.定义一个线程任务类实现Callable接口，申明线程执行的结果类型。
 *      -- 2.重写线程人物类的call方法，这个方法可以直接返回执行结果。
 *      -- 3.创建一个Callable的线程任务对象。
 *      -- 4.把Callable的线程任务对象包装成一个未来任务对象。
 *      -- 5.把未来任务对象包装成线程对象。
 *      -- 6.调用线程的start()方法启动线程。
 *
 * 优缺点：
 *  优点：全是优点。
 *      -- 线程任务类只是实现了Callable接口，可以继续集成其它类，同时可以继续实现其他接口。
 *      -- 一个线程任务对象可以被共享成多个线程对象。适合做多线程的资源共享操作。
 *      -- 很适合做线程池的执行任务。
 *      -- 可以直接获取线程执行的结果。
 *  缺点：代码复杂。
 */
public class ThreadDemo {

    public static void main(String[] args) {
        MyCallable m = new MyCallable();
        FutureTask<String> f = new FutureTask(m);
        Thread t = new Thread(f);
        t.start();
        try {
            String o = f.get();
            System.out.println(o);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum++;
            System.out.println(Thread.currentThread().getName() + "--> " + i);
        }
        return "返回值-->" + sum;
    }
}
