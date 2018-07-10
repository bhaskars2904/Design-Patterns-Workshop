package adaptorquestion;

public class Client {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("fsvf","111");
        mediaPlayer.play("mp3","222");
        //Notice the incompatibility that client encounters when it wants to play a mp4 or vlc file through MediaPlayer interface
        mediaPlayer.play("mp4", "333");
        mediaPlayer.play("vlc", "444");
        //Create a wrapper that implements the interface to which client makes a request(in this case MediaPlayer) which creates
        //a compatibility with AdvancedMediaPlayer interface
    }
}
