package com.hanyi._01编程思维题目;

/**
 * 目标：非规律化递归问题，编程思维的拓展。
 * <p>
 * 啤酒问题：啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶。
 */
public class BeerDemo {

    public static int size;

    public static int lastPingZi;

    public static int lastGaiZi;

    public static void main(String[] args) {
        buyBeer(10);
        System.out.println(size);
        System.out.println(lastPingZi);
        System.out.println(lastGaiZi);
    }

    public static void buyBeer(int money) {
        int number = money / 2;
        size += number;
        int curPingZi = lastPingZi + number;
        int curGaiZi = lastGaiZi + number;

        int totalMoney = 0;
        totalMoney += (curPingZi / 2) * 2;
        totalMoney += (curGaiZi / 4) * 2;

        lastPingZi = curPingZi % 2;
        lastGaiZi = curGaiZi % 4;

        if (totalMoney >= 2) {
            buyBeer(totalMoney);
        }
    }
}
