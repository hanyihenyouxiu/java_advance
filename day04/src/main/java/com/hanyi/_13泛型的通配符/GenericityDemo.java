package com.hanyi._13泛型的通配符;

import java.util.ArrayList;

/**
 * 目标：泛型通配符
 *
 * 需求：开发一个极品飞车的游戏，所有的汽车都能一起参加比赛。
 *
 * 通配符：？
 * ？可以用在使用泛型的时候表示一切泛型。
 *  E T K V 是在定义泛型的时候使用代表一切类型。
 *
 *  泛型的上下限：
 *  ? extends Car： 那么问号必须是Car或者Car的子类
 *  ? super Car :那么问号必须是Car或者Car的父类
 */
public class GenericityDemo {

}

class Car {
    public static void main(String[] args) {
        ArrayList<BM> bm = new ArrayList<>();
        bm.add(new BM());
        bm.add(new BM());
        bm.add(new BM());
        bm.add(new BM());

        ArrayList<BC> bc = new ArrayList<>();
        bc.add(new BC());
        bc.add(new BC());
        bc.add(new BC());
        bc.add(new BC());
    }

    public static void run(ArrayList<?> cards) {
        for (int i = 0; i < cards.size(); i++) {

        }
    }
}

class BM extends Car {

}

class BC extends Car {

}