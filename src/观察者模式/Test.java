package 观察者模式;

/**
 * 观察者模式定义了对象之间的一对多依赖关系，当一共对象改变状态时，它的所有依赖都会收到通知并自动更新。
 *
 * 发布-订阅
 *
 * 观察者模式属于行为型模式，行为型模式关注的是对象之间的通信，观察者模式就是观察者和被观察者之间的通信。
 *
 * 观察者模式还有另外一个名字“订阅-发布模式”。
 *
 * 观察者模式有两种角色：
 *
 * - 观察者，订阅者
 * - 被观察者，发布者
 *
 * 从逻辑上讲，观察者模式就是：当被观察者的状态改变，就通知观察者，如何实现？
 *
 * 被观察者保存了一份所有观察者的列表，只需要调用观察者的 update 方法即可。
 *
 * 用发布-订阅报纸的实例来表示，就是客户向报社订阅报纸，报社就要保存一份所有客户的地址名单，然后有新报纸来了，就按照名单一个个派送报纸即可。
 */

public class Test {
    public static void main(String[] args) {
        NewsOffice newsOffice=new NewsOffice();
        Customer customerA=new CustomerA();
        Customer customerB=new CustomerB();
        newsOffice.addCustomer(customerA);
        newsOffice.addCustomer(customerB);
        newsOffice.newspaperSend();
    }
}
