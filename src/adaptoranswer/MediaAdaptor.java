package adaptoranswer;

public class MediaAdaptor implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    MediaAdaptor(String mediaType){
        if(mediaType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer =  new VlcPlayer();
        }
        else if(mediaType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String mediaType, String filename) {
        if(mediaType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playvlc(filename);
        }
        else if(mediaType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playmp4(filename);
        }
    }
}
