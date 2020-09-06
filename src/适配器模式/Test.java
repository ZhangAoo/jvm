package 适配器模式;

/**
 * 适配器模式是将一个接口，转换成客户期望的另一个类型的接口，让原本不兼容的接口可以实现兼容。
 */
public class Test {
    public static void main(String[] args) {
        MusicPlayer player=new PlayerAdapter();
        player.play("mp3","xxx.mp3");
        player.play("mp4","xxx.mp4");
        player.play("mmm","xxx.mmm");
    }
}
