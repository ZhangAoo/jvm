package 观察者模式;

public class CustomerB extends Customer{
    @Override
    public void update() {
        System.out.println("客户B收到了报纸");
    }
}
