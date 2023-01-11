package com.hanyi._07内部类_静态内部类;

/**
 * 目标：静态内部类的研究（了解语法即可）
 *
 * 什么是静态内部类？
 *  有static修饰，属于外部类本身，会随着外部类一起加载一次。
 * 静态内部类中的成份研究：
 *  类有的成份它都有，静态内部类属于内部类本身，只会加载一起
 *  所以它的特点与外部类是完全一样的，只是位置在别人里面而已。
 *
 *  外部类 = 宿主 内部类 = 寄生
 *
 *  静态内部类的访问格式：
 *      外部类名称.内部类名称
 *
 *  静态内部类创建对象的格式：
 *      外部类名称.内部类名称 对象名 = new 外部类名称.内部类构造器;
 *
 *  静态内部类的访问拓展：
 *      静态内部类中是否可以直接访问外部类的静态成员
 *      静态内部类中是否可以直接访问外部类的实例成员
 */
public class innerClass {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.setName("好");
        in.setAge(1);
        System.out.println(in.getName());
        System.out.println(in.getAge());
        in.show();
    }
}

class Outer{

    public static int age1 = 12;//可以
    public String b = "2";//不可以

    // 静态内部类：有static修饰，属于外部类本身，只会加载一次。
    public static class Inner {
        private String name;
        private int age;

        public static String school = "黑马";

        public void show() {
            System.out.println(name + "--->" + age + "岁");
        }

        public Inner() {
            System.out.println(age1);
            //System.out.println(b); // 不能直接访问，可以创建外部类对象然后访问
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
