package 代理模式;

public class PhoneProxy {
    private Phone phone;
    public PhoneProxy(Phone phone){
        this.phone=phone;
    }

    public void sale(){
        System.out.println("开启代理模式");
        this.phone.sale();
    }
}
