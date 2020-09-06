package 装饰器模式;

public class Jacket extends ClothesDecorator{
    public Jacket(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return this.person.cost()+100;
    }

    @Override
    public void show() {
this.person.show();
        System.out.println("买了一件夹克，累计消费：" + this.cost());
    }
}
