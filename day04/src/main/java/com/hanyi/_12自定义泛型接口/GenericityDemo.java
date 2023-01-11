package com.hanyi._12自定义泛型接口;

import java.util.ArrayList;

/**
 * 目标：泛型接口
 *
 * 什么是泛型接口？
 *      使用了泛型定义的接口就是泛型接口。
 * 泛型接口的格式：
 *      修饰符 interface 接口名称<泛型变量> {
 *
 *      }
 *
 *  需求：教务系统，提供一个接口可约束一定要完成数据的增删改查操作。
 *
 * 小结：
 *  泛型接口的核心思想，在实现接口的时候传入真是的数据类型
 *  这样重写的方法就是对该数据类型进行操作！
 *
 * 注意：泛型没有继承关系！！！
 *
 * 通配符：?
 *  ?可以用在使用泛型的时候代表一切类型。
 *  E,T,K,V是在定义泛型的时候使用代表一切类型。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
    }

    public static void run(ArrayList<Car> cars) {

    }
}

class Car{

}

class BMW extends Car{

}

class BENZ extends Car {

}
