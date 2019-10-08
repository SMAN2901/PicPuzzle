package picpuzzle;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicPlayer extends Thread{
    @Override
    public void run(){
        try{
            String sound = "/resources/Sounds/background.mp3";
            Media hit = new Media(MusicPlayer.class.getResource(sound).toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            
            while(true){                
                if(mediaPlayer.isMute()){
                    mediaPlayer.play();
                }
                PicPuzzle.musicStarted = true; 
            }
        }
        catch (Exception e){}
    }
}
