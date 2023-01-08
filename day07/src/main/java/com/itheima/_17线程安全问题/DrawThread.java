package com.itheima._17线程安全问题;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/1/8
 * Time: 21:33
 * Description:
 *
 * @author 寒毅
 */
public class DrawThread extends Thread{

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.drawMoney(10000);
    }
}
