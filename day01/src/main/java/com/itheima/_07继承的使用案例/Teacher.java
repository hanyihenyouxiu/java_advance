package com.itheima._07继承的使用案例;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2022/11/8
 * Time: 15:26
 * Description:
 *
 * @author 寒毅
 */
public class Teacher extends People {
    public void teach() {
        System.out.println(getName() + "老师开始讲课");
    }
}
