package com.itheima._20线程同步_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/8
 * Time: 21:31
 * Description:
 *
 * @author 寒毅
 */
public class Account {

    private final Lock lock = new ReentrantLock();

    private String idCard;
    private static Double money;

    public Account() {
    }

    public Account(String idCard, Double money) {
        this.idCard = idCard;
        this.money = money;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void drawMoney(double i) {
        System.out.println(Thread.currentThread().getName());
        try {
            lock.lock();
            if (this.getMoney() >= i) {
                System.out.println(Thread.currentThread().getName() + "余额足够取走了");
                this.setMoney(this.getMoney() - i);
                System.out.println("账户剩余" + this.getMoney());
            } else {
                System.out.println(Thread.currentThread().getName() + "余额不够！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
