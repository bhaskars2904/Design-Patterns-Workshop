package adaptoranswer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playvlc(String filename) {

    }

    @Override
    public void playmp4(String filename) {
        System.out.println("playing mp4 file "+filename);
    }
}