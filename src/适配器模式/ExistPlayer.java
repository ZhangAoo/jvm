package 适配器模式;

public class ExistPlayer {
    public void playMp3(String filename){
        System.out.println("play--MP3"+filename);
    }
    public void playMp4(String filename){
        System.out.println("play--MP4"+filename);
    }
    public void playMmm(String filename){
        System.out.println("play--Mmm"+filename);
    }
}
