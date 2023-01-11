package com.hanyi._14this和super关键字使用总结;

/**
 * 总结和扩展：this和super关键字使用总结
 *
 * this代表了当前对象的引用(继承中指代子类对象)：
 *  this.子类成员变量。
 *  this.子类成员方法。
 *  this(...)：可以根据参数匹配访问其本类其它构造器。
 *  super代表了父类对象的引用(继承中指代了父类对象空间)
 *  super.父类成员变量。
 *  super.父类的成员方法。
 *  super(...)：可以根据参数匹配访问父类的构造器。
 * 拓展：this(...)根据参数匹配访问本类其它构造器。
 *
 * 注意：
 *  this(...)借用本类其他构造器。
 *  super(...)调用父类的构造器。
 *  this(...)和super(...必须放在构造器的第一行，否则报错！)
 *  所以this(...)和super(...)不能同时出现在构造器中！！
 */
public class ThisDemo {
    public static void main(String[] args) {
        // 例如不写学校默认就是黑马！
        Student zbj = new Student("天蓬元帅", 1000);
        System.out.println(zbj.getName());
        System.out.println(zbj.getAge());
        System.out.println(zbj.getSchoolName());

        Student swk = new Student("孙悟空", 2000, "清华大学！");
        System.out.println(swk.getName());
        System.out.println(swk.getAge());
        System.out.println(swk.getSchoolName());
    }
}

class Student {

    public Student() {
    }

    public Student(String name, Integer age) {
        //借用兄弟构造器
        this(name, age, "黑马");
    }

    public Student(String name, Integer age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    private String name;
    private Integer age;
    private String schoolName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
