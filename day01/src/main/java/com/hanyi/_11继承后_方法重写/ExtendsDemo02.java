package com.hanyi._11继承后_方法重写;

/**
 * 目标：super调用父类被重写的方法
 *
 * super:代表父类引用。
 * super可以用在子类的实例方法中调用父类被重写的方法。
 */
public class ExtendsDemo02 {

}

class SportMan extends People{
    @Override
    public void run() {
        System.out.println("运动员跑的飞快---");
    }

    public void go() {
        super.run();
        run();
    }
}

class People{
    public void run() {
        System.out.println("人会跑！！");
    }
}