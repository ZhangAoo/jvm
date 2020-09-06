package 工厂模式;

/**
 * 工厂模式是实际开发中最常见的一种设计模式，需要使用对象的时候不用自己创建，通过工厂来获取。
 */
public class Test {
    public static void main(String[] args) {
        Car car=CarFactory.getCar(2);
        System.out.println(car);
    }
}
