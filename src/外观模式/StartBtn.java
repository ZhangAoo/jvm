package 外观模式;

public class StartBtn {
    public void start(){
        new CPU().start();
        new Disk().start();
        new Memory().start();
    }
}
