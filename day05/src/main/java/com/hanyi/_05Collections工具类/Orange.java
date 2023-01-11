package com.hanyi._05Collections工具类;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2022/12/30
 * Time: 17:17
 * Description:
 *
 * @author 寒毅
 */
public class Orange implements Comparable<Orange> {
    private String name;
    private double weight;
    private String price;

    public Orange() {
    }

    public Orange(String name, double weight, String price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public int compareTo(Orange o) {
        return (int) (this.weight - o.weight);
    }
}
