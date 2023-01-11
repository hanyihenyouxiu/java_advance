package com.hanyi._01线程通信;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2023/1/9
 * Time: 14:09
 * Description:
 *
 * @author 寒毅
 */
public class DrawThread extends Thread {

    private Account account;

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            account.drawMoney(10000d);
        }
    }
}
