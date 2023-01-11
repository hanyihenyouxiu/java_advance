package com.hanyi._06原子性;

/**
 * 目标：保证原子性操作
 */
public class VolatileAtomicDemo02 {

    public static void main(String[] args) {
        MyRunnable02 m = new MyRunnable02();
        for (int i = 0; i < 100; i++) {
            new Thread(m).start();
        }
    }

}

class MyRunnable02 implements Runnable {
    private int count;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                //synchronized (this) {
                count++;
                System.out.println(count);
            }
        }
    }
}
