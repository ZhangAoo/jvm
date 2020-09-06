package 模板方法模式;

/**
 * 模板方法模式在一个方法中定义一个算法的骨架，从而将一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 */
public class Test {
    public static void main(String[] args) {
        Cook cook=new CookTomatos();
        cook.doCook();
    }
}
