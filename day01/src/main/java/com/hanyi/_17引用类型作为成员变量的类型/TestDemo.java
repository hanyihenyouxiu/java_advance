package com.hanyi._17引用类型作为成员变量的类型;

/**
 *
 */
public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("王绍宁");
        student.setAge(21);
        Address address = new Address("110", "北京", 99, 99);
        student.setAddress(address);
        Address address1 = student.getAddress();
        System.out.println(address1.getCode() + "-->" + address1.getName());
    }
}
