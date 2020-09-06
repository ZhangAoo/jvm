package 单例模式;

public class Test {
    public static void main(String[] args){
        for(int i=0;i<2;i++){
            new Thread(()->{
                SingleObject2 singleObject=SingleObject2.getInstance();
            }).start();
        }
    }
}
