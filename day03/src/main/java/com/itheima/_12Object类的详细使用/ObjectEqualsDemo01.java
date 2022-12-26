package com.itheima._12Object类的详细使用;

/**
 * 目标：常用API的学习-Object类的equals方法使用详解
 *
 * public boolean equals(Object o):
 *      -- 默认是比较两个对象的地址是否相同。相同返回true，反之。
 *      -- 直接比较两个对象的地址是否相同完全相同可以用"=="替代equals
 *          所以equals存在的意义是为了被子类重写，以便程序员看自己可以定制比较规则。
 *      -- 需求：只要两个对象内容一样，我们就认为他们是相等的。
 * 小结：
 *      equals存在的意义是为了被子类重写，以便程序员可以
 *      自己来定制比较规则。
 */
public class ObjectEqualsDemo01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println(student1.equals(student2));
        System.out.println(student1 == student2);
    }
}
