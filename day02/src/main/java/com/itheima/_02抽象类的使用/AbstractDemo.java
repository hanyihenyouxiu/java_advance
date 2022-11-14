package com.itheima._02抽象类的使用;

/**
 * 目标：抽象类的使用。
 *
 * 抽象类的作用：为了被子类继承。
 *
 * 小结：
 *  抽象类是为了被子类继承，约束子类要重写抽象方法。
 *  注意：一个类继承了抽象，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.work();

        Manager manager = new Manager();
        manager.work();
    }
}

// 班主任
class Manager extends Employee{

    @Override
    public void work() {
        System.out.println("班主任要管理提醒学生...");
    }
}

// 老师
class Teacher extends Employee {

    @Override
    public void work() {
        System.out.println("老师需要上课...");
    }
}

// 需求：一家公司开发员工管理系统（讲师，班主任）
abstract class Employee {
    // 子类都要完成工作这个功能，但是每个子类工作内容不一样，那么久定义抽象方法
    public abstract void work();
}
