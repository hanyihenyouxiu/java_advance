package com.itheima._16引用类型作为方法参数和返回值;

/**
 * 目标：引用类型作为方法参数和返回值。
 * 引用类型作为Java的数据类型，自然可以作为方法的参数类型和返回值类型。
 * 除了基本数据类型都是引用数据类型了。
 *
 * 小结：引用类型作为数据类型可以在一切可以使用类型的地方使用！！（废话）
 */
public class TestDemo {
    public static void main(String[] args) {
        Dog jinMao = new Dog();
        go(jinMao);

        Dog dog = createDog();
    }

    public static Dog createDog() {
        // 可以进行代码的加工
        return new Dog();
    }
    public static void go(Dog dog) {
        System.out.println("比赛开始。。。");
        dog.run();
        System.out.println("比赛结束。。。");
    }
}

class Dog {
    public void run() {
        System.out.println("狗跑的贼快！");
    }
}