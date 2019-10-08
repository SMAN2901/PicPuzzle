package picpuzzle;

import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class PicPuzzle {
    
    static boolean done = new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles").mkdir();
    static Path docPath = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/save.dat");
    
    static Path savePath1 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/score1.dat");
    static Path savePath2 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/score2.dat");
    static Path savePath3 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/score3.dat");
    
    static Path timePath1 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/timescore1.dat");
    static Path timePath2 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/timescore2.dat");
    static Path timePath3 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/timescore3.dat");
    
    static Path[] saveList = {savePath1, savePath2, savePath3};
    static Path[] timeList = {timePath1, timePath2, timePath3};
    static String codeName = "A+B+C+D+EE", codeScore = "1234567890", codeScore1 = "99:99:99";
    static int diff = 0;
    static boolean myFlag = false;
    static boolean mode = true;
    static Timer tm = new Timer();
    static MusicPlayer mp = new MusicPlayer();
    static boolean musicStarted = false;
    
    static void createSaveFile() throws IOException
    {
        File doc = new File(docPath.toString());
        if(doc.exists() && !doc.isDirectory()) { 
            //file is already created
        }
        else{
            boolean b = doc.createNewFile();
            String s = "3";
            Files.write(docPath, s.getBytes(), StandardOpenOption.CREATE);
        }
        
        for(int i=0; i<3; i++){
            doc = new File(saveList[i].toString());
            if(doc.exists() && !doc.isDirectory()) { 
                //file is already created
            }
            else{
                boolean b = doc.createNewFile();
                String s = "", t = codeName + codeScore + "\n";
                for(int a=0; a<5; a++){
                    s += t;
                }
                Files.write(saveList[i], s.getBytes(), StandardOpenOption.CREATE);
            }
        }
        
        for(int i=0; i<3; i++){
            doc = new File(timeList[i].toString());
            if(doc.exists() && !doc.isDirectory()) { 
                //file is already created
            }
            else{
                boolean b = doc.createNewFile();
                String s = "", t = codeName + codeScore1 + "\n";
                for(int a=0; a<5; a++){
                    s += t;
                }
                Files.write(timeList[i], s.getBytes(), StandardOpenOption.CREATE);
            }
        }
    }
    
    public static void Click()
    {  
        String clickSound = "/resources/Sounds/click.mp3";
        Media hit = new Media(PicPuzzle.class.getResource(clickSound).toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
    
    public static void tileClick()
    {  
        String clickSound = "/resources/Sounds/tileClick.mp3";
        Media hit = new Media(PicPuzzle.class.getResource(clickSound).toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
    
    public static void main(String[] args) throws IOException, FontFormatException, InterruptedException {
        createSaveFile();
        com.sun.javafx.application.PlatformImpl.startup(()->{});
 
        GameMenu menu = new GameMenu();
        menu.setVisible(true);
        menu.setTitle("PIC PUZZ");
    } 
}