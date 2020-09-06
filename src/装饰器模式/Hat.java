package 装饰器模式;

public class Hat extends ClothesDecorator {
    public Hat(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return this.person.cost()+50;
    }

    @Override
    public void show() {
        this.person.show();
        System.out.println("买了一个帽子，累计消费："+this.cost());
    }
}
