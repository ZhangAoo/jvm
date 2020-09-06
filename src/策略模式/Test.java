package 策略模式;

/**
 * 策略模式种定义了各自算法、方法，分别封装起来，让它们之间可以互相替换，可以让算法独立于算法的使用者，实现解耦合。
 * 一般情况下将一种行为写成一个类型或者方法，比如 计算器中的 加、减、乘、除。
 * 策略模式是将每个方法都定义成一个类，然后动态选择使用哪个算法。
 * 开闭原则：对修改关闭、对扩展开放
 *
 * 别人不能修改你的代码，但是别人可以在你代码的基础上进行扩展
 */

public class Test {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.setOperation(new OperationAdd());
        int result=calculator.doOperation(1,2);
        System.out.println(result);
        calculator.setOperation(new OperationSub());
        result=calculator.doOperation(2,1);
        System.out.println(result);
    }
}
