package com.itheima._07继承的使用案例;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2022/11/8
 * Time: 15:27
 * Description:
 *
 * @author 寒毅
 */
public class Test {
    public static void main(String[] args) {
        Teacher boNiu = new Teacher();
        boNiu.setName("波妞");
        boNiu.setAge(18);
        System.out.println(boNiu.getName());
        System.out.println(boNiu.getAge());
        boNiu.eat();
        boNiu.teach();
    }
}
