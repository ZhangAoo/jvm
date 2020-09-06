package 观察者模式;

public class CustomerA extends Customer{
    @Override
    public void update() {
        System.out.println("客户A收到了报纸");
    }
}
