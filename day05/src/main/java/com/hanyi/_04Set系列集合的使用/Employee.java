package com.hanyi._04Set系列集合的使用;

/**
 *
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double price;
    private int age;

    public Employee() {
    }

    public Employee(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

    /**
     * 重写了比较方法
     * 比较着:this
     * 被比较者：o
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Employee o) {
        // 规则：Java规则
        // 程序员认为比较者大于被比较者，返回正数！
        // 程序员认为比较者小于被比较者，返回负数！
        // 程序员认为比较者等于被比较者，返回0！
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}
