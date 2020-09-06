package 模板方法模式;

public abstract class Cook {
    public void open(){
        System.out.println("打开油烟机");
    }
    public void fire(){
        System.out.println("生火");
    }
    public abstract void doCook();

    public void outFire(){
        System.out.println("关火");
    }
    public void close(){
        System.out.println("关闭油烟机");
    }

    public final void cook(){
        this.open();
        this.fire();
        this.doCook();
        this.outFire();
        this.close();
    }
}
