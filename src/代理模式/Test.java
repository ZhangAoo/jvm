package 代理模式;

/**
 * 代理模式是实际开发中使用频率较高的一种设计模式，比如 Spring AOP 就是代理模式的具体应用。
 *
 * 通过代理对象来实现目标对象与业务方法的解耦合，从而扩展处空间来完成其他操作。
 */
public class Test {
    public static void main(String[] args) {
        Phone phone=new iPhone();
        PhoneProxy proxy=new PhoneProxy(phone);
        proxy.sale();
    }
}
