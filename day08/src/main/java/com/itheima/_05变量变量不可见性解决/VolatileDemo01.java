package com.itheima._05变量变量不可见性解决;

/**
 * 目标：并发编程下变量不可见性解决方案。
 * 现象：并发编程下，多线程修改变量，会出现线程间变量的不可见性。
 * 解决方案有两种常见方式：
 *  1.加锁
 *      -- 每次枷锁会清空线程自己的工作内存，从新读取主内存最新值。
 *  2.volatile
 *      -- volatile修饰的变量可以再多线程并发修改下，实现线程间变量的可见性。
 *      -- 一旦一个线程修改了volatile修饰的变量，另一个线程可以立即取到最新值。
 */
public class VolatileDemo01 extends Thread {

    //private boolean flag = false; // 不可见
    private volatile boolean flag = false; //可见

    @Override
    public void run() {
        System.out.println("线程一开始休息了");
        try {
            Thread.sleep(1000);
            System.out.println("线程一休息好了");
        } catch (Exception e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("线程一结束了----> 状态修改了呀--->" + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class Visibility{
    public static void main(String[] args) {
        System.out.println("main方法开始运行啦");
        VolatileDemo01 v = new VolatileDemo01();
        v.start();
        while (true) {
//            synchronized (Visibility.class) {
//                if (v.isFlag()) {
//                    System.out.println("main结束了！");
//                    return;
//                }
//            }
            if (v.isFlag()) {
                System.out.println("main结束了！");
                return;
            }
        }

    }
}
