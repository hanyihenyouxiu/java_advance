package com.hanyi._11继承后_方法重写;

/**
 * 目标：静态方法和私有方法是否可以被重写（拓展）
 * 都不能被重写
 */
public class ExtendsDemo03 {

}

class Mac extends Computer {
    @Override
    public void go() {
        System.out.println("苹果开机");
    }
}

class Computer{
    public void go() {
        System.out.println("笔记本开机");
    }
}