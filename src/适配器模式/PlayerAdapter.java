package 适配器模式;

public class PlayerAdapter implements MusicPlayer {
    private ExistPlayer player;

    public PlayerAdapter() {
        this.player = new ExistPlayer();
    }

    @Override
    public void play(String type, String filename) {
        if (type.equals("mp3")){
            this.player.playMp3(filename);
        }else if (type.equals("mp4")){
            this.player.playMp4(filename);
        }else if (type.equals("mmm")){
            this.player.playMmm(filename);
        }
    }
}
