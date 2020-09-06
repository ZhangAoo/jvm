package 装饰器模式;

/**
 * 装饰器模式动态地将责任（业务）附加到对象上，如果要扩展功能，装饰器模式提供了比继承更有弹性地一种替代方案。
 *
 * 一个人逛商场，准备买衣服
 * 装饰器模式主要有两个角色：
 * - 装饰器
 * - 被装饰的对象
 *
 * 人买衣服，人就是被装饰的对象，衣服、裤子、帽子就是装饰器。
 *
 * 装饰器和被装饰的对象有两个特点，也是装饰器模式的关键：
 * - 实现同一个接口
 * - 装饰器中使用了被装饰的对象
 */

public class Test {
    public static void main(String[] args) {
        Person tom=new Tom();
        tom=new Jacket(tom);
        tom=new Hat(tom);
        tom.show();
        System.out.println("购物完毕，一共消费了："+tom.cost());
    }
}
