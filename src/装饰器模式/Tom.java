package 装饰器模式;

public class Tom implements Person{
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("开始购物");
    }
}
