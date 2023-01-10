package com.itheima._04volatile关键字;

/**
 * 目标：并发编程下，多线程访问变量的不可见性问题。
 *
 * 引入：
 *      多个线程访问共享资源，会出现一个线程修改变量的值后，其它线程看不到最新值的情况。
 *
 * 不可见性的原因：
 *      每个线程都有自己的工作内存，线程都是从主内存拷贝共享变量的副本值。
 *      每个线程是在自己的工作内存中操作共享变量的。
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
            if (v.isFlag()) {
                System.out.println("main结束了！");
                return;
            }
        }

    }
}
