package com.itheima._05抽象类设计模板模式;

/**
 * 目标：抽象类设计模板设计模式
 * <p>
 * 什么是设计模式？
 *  设计模式是前人或者技术大牛或者软件行业在生产实战中发现的优秀软件设计架构和思想。
 *  后来者可以直接用这些架构或者思想就可以设计出优秀，提交效率，提高软件可扩展性和可维护性的软件。
 *
 * 模板设计模式的作用：优化代码架构，提高代码的复用性，相同功能的重复代码无需反复书写！
 * 可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重写实现！
 */
public class AbstractDemo {

}

class Student extends Template {

    @Override
    public String writeMain() {
        return "天生就是那么优秀";
    }
}

abstract class Template {
    private String title = "寒毅很优秀";
    private String one = "说说他有多优秀";
    private String last = "真的很优秀！";

    public void write() {
        System.out.println(title);
        System.out.println(one);
        // 正文
        System.out.println(writeMain());
        System.out.println(last);
    }

    public abstract String writeMain();
}
