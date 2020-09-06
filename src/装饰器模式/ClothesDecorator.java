package 装饰器模式;

public  abstract class ClothesDecorator implements Person {
    public Person person;
    public ClothesDecorator(Person person){
        this.person=person;
    }
}
