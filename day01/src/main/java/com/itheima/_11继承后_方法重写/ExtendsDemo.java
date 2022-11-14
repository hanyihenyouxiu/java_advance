package com.itheima._11继承后_方法重写;

/**
 * 目标：方法重写。
 *
 * 方法重写的概念：
 *      子类继承了父类，子类就得到了父类的某个方法。
 *      但是子类觉得父类的这个方法不好用或者无法满足自己的需求。
 *      子类重写一个与父类申明一样的方法来覆盖父类的该方法，子类的这个方法。
 *      就进行了方法重写。
 * 方法重写的校验注解：@Override
 *      Java建议在重写的方法上面加一个@Override
 *      方法一旦加了这个注解，那就必须是成功重写父类的方法，否则会报错！
 *      @Override优势：可读性好 安全 优雅！
 * 方法重写的要求：
 *      1.子类重写方法的名称和形参列表必须与父类被重写方法一样。
 *      2.子类重写方法的返回值类型申明要么与父类一样，要么比父类方法返回值类型范围更小。
 *      3.子类重写方法的修饰符应该与父类被重写方法的修饰符权限相同或者更大。
 *      4.子类重写方法申明抛出的异常应该与父类被重写的方法申明抛出的异常一样或者范围更小。
 * 方法重写的规范：
 *      1.加上@Override注解。
 *      2.建议"申明不变，重新实现"
 * 小结：
 *      方法重写是子类重写一个与父类申明一样的方法覆盖父类的方法。
 *      方法重写建议加上@Override注解。
 *      方法重写的和新要求：方法名称形参列表必须与被重写方法一致！
 *      建议"申明不变，重新实现"
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.run();
    }
}

class Turtle extends Animal {

    // 方法重写
    @Override
    public void run() {
        System.out.println("王文博跑的贼快");
    }
}

class Animal{
    public void run() {
        System.out.println("动物跑步");
    }
}
