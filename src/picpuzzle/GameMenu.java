package picpuzzle;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public final class GameMenu extends javax.swing.JFrame {
    public GameMenu() throws FontFormatException, IOException {
        initComponents();
        
        CustomCursor();
        if(!PicPuzzle.mode){
            modeButton.doClick();
            modeButton.doClick();
        }
        setFont();
        setDifficulty();
        BackgroundSound();
        
        //code for centering the frame regardless screen size 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        difficultyButton = new javax.swing.JButton();
        creditButton = new javax.swing.JButton();
        highscoreButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        difficultyLabel = new javax.swing.JLabel();
        creditLabel = new javax.swing.JLabel();
        playLabel = new javax.swing.JLabel();
        quitLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        modeButton = new javax.swing.JButton();
        modeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 66, 66));
        setLocation(new java.awt.Point(500, 200));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("PIC PUZZ");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 74));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(204, 255, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 900, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pics/backPanel.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 393));

        jPanel2.setBackground(new java.awt.Color(27, 27, 27));
        jPanel2.setForeground(new java.awt.Color(66, 66, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playButton.setBackground(new java.awt.Color(27, 27, 27));
        playButton.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        playButton.setForeground(new java.awt.Color(0, 153, 255));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/play.png"))); // NOI18N
        playButton.setToolTipText("Play the game");
        playButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        playButton.setBorderPainted(false);
        playButton.setFocusPainted(false);
        playButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        playButton.setOpaque(false);
        playButton.setSelected(true);
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playButtonMouseExited(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jPanel2.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, 50));

        difficultyButton.setBackground(new java.awt.Color(27, 27, 27));
        difficultyButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        difficultyButton.setForeground(new java.awt.Color(0, 153, 255));
        difficultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/easy.png"))); // NOI18N
        difficultyButton.setToolTipText("Choose difficulty");
        difficultyButton.setBorder(null);
        difficultyButton.setFocusPainted(false);
        difficultyButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        difficultyButton.setOpaque(false);
        difficultyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                difficultyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                difficultyButtonMouseExited(evt);
            }
        });
        difficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyButtonActionPerformed(evt);
            }
        });
        jPanel2.add(difficultyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 60, 50));

        creditButton.setBackground(new java.awt.Color(27, 27, 27));
        creditButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        creditButton.setForeground(new java.awt.Color(0, 153, 255));
        creditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/credit.png"))); // NOI18N
        creditButton.setToolTipText("Nothing special here");
        creditButton.setBorder(null);
        creditButton.setFocusPainted(false);
        creditButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        creditButton.setOpaque(false);
        creditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditButtonMouseExited(evt);
            }
        });
        creditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditButtonActionPerformed(evt);
            }
        });
        jPanel2.add(creditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 60, 50));

        highscoreButton.setBackground(new java.awt.Color(27, 27, 27));
        highscoreButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        highscoreButton.setForeground(new java.awt.Color(0, 153, 255));
        highscoreButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/highscore.png"))); // NOI18N
        highscoreButton.setToolTipText("Show Previous Scores");
        highscoreButton.setBorder(null);
        highscoreButton.setFocusPainted(false);
        highscoreButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        highscoreButton.setOpaque(false);
        highscoreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                highscoreButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                highscoreButtonMouseExited(evt);
            }
        });
        highscoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highscoreButtonActionPerformed(evt);
            }
        });
        jPanel2.add(highscoreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 60, 50));

        exitButton.setBackground(new java.awt.Color(27, 27, 27));
        exitButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 0, 0));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/exit.png"))); // NOI18N
        exitButton.setToolTipText("Quit the game");
        exitButton.setBorder(null);
        exitButton.setFocusPainted(false);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        exitButton.setOpaque(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 60, 50));

        difficultyLabel.setBackground(new java.awt.Color(51, 51, 51));
        difficultyLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        difficultyLabel.setForeground(new java.awt.Color(153, 153, 153));
        difficultyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        difficultyLabel.setText("Easy");
        difficultyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                difficultyLabelMouseClicked(evt);
            }
        });
        jPanel2.add(difficultyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 130, 70, 40));

        creditLabel.setBackground(new java.awt.Color(51, 51, 51));
        creditLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(153, 153, 153));
        creditLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditLabel.setText("Credits");
        creditLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditLabelMouseClicked(evt);
            }
        });
        jPanel2.add(creditLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 80, 40));

        playLabel.setBackground(new java.awt.Color(51, 51, 51));
        playLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        playLabel.setForeground(new java.awt.Color(153, 153, 153));
        playLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playLabel.setText("Play");
        playLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playLabelMouseClicked(evt);
            }
        });
        jPanel2.add(playLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 40));

        quitLabel.setBackground(new java.awt.Color(51, 51, 51));
        quitLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        quitLabel.setForeground(new java.awt.Color(153, 153, 153));
        quitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quitLabel.setText("Quit");
        quitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitLabelMouseClicked(evt);
            }
        });
        jPanel2.add(quitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 130, 70, 40));

        scoreLabel.setBackground(new java.awt.Color(51, 51, 51));
        scoreLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(153, 153, 153));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("High Score");
        scoreLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreLabelMouseClicked(evt);
            }
        });
        jPanel2.add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 160, 40));

        modeButton.setBackground(new java.awt.Color(27, 27, 27));
        modeButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        modeButton.setForeground(new java.awt.Color(0, 153, 255));
        modeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/relax.png"))); // NOI18N
        modeButton.setToolTipText("");
        modeButton.setBorder(null);
        modeButton.setFocusPainted(false);
        modeButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        modeButton.setOpaque(false);
        modeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modeButtonMouseExited(evt);
            }
        });
        modeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(modeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 60, 50));

        modeLabel.setBackground(new java.awt.Color(51, 51, 51));
        modeLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        modeLabel.setForeground(new java.awt.Color(153, 153, 153));
        modeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modeLabel.setText("Relax");
        modeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeLabelMouseClicked(evt);
            }
        });
        jPanel2.add(modeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 900, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Variable diclarations"> 

    boolean done = new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles").mkdir();
    Path docPath = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/save.dat");
    File doc = new File(docPath.toString());
    static int difficulty = 3;
    Color myBlue = new Color(0, 153, 255);
    Color myGray = new Color(153,153,153);
    
    int xx,xy;
 
    InputStream img = getClass().getResourceAsStream("/resources/Icons/rush.png");
    Image rushIcon = ImageIO.read(img);
    InputStream img2 = getClass().getResourceAsStream("/resources/Icons/relax.png");
    Image relaxIcon = ImageIO.read(img2);
    
    InputStream easyImg = getClass().getResourceAsStream("/resources/Icons/easy.png");
    Image easyIcon = ImageIO.read(easyImg);
    InputStream midImg = getClass().getResourceAsStream("/resources/Icons/medium.png");
    Image midIcon = ImageIO.read(midImg);
    InputStream hardImg = getClass().getResourceAsStream("/resources/Icons/hard.png");
    Image hardIcon = ImageIO.read(hardImg);
    
     //</editor-fold>
   
    
    // <editor-fold defaultstate="collapsed" desc="Set Font"> 
    final void setFont() throws FontFormatException, IOException
    {
        InputStream is = getClass().getResourceAsStream("/resources/Fonts/rabbit.ttf");
        Font f = Font.createFont(Font.TRUETYPE_FONT, is);
        
        for(Component comp : jPanel2.getComponents()){
            comp.setFont(f.deriveFont(18.0f));
        }
        is = getClass().getResourceAsStream("/resources/Fonts/break.ttf");
        f = Font.createFont(Font.TRUETYPE_FONT, is);
        nameLabel.setFont(f.deriveFont(60.0f));
        
        
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Play Button Action"> 
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        PicPuzzle.Click();
        try{
            switch (difficulty) {
                case 3:
                {
                    GameFrame3 obj = new GameFrame3();
                    obj.setVisible(true);
                    this.setVisible(false);
                    obj.setTitle("PIC PUZZ");
                    break;
                }
                case 4:
                {
                    GameFrame4 obj = new GameFrame4();  
                    obj.setVisible(true);
                    this.setVisible(false);
                    obj.setTitle("PIC PUZZ");
                    break;
                }
                case 5:
                {
                    GameFrame5 obj = new GameFrame5();
                    obj.setVisible(true);
                    this.setVisible(false);
                    obj.setTitle("PIC PUZZ");
                    break;
                }
                default:
                break;
            }
        }
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_playButtonActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Exit Button Action"> 
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        PicPuzzle.Click();
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Get Difficulty"> 
    void getDifficulty() throws IOException
    {
        String s = new String(Files.readAllBytes(docPath));
        difficulty = Integer.valueOf(s);
        if(difficulty < 3 || difficulty > 5){
            difficulty = 3;
            saveDifficulty();
        }
    }
        //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Set Difficulty"> 
    final void setDifficulty()
    {
        try{
            getDifficulty();
        }
        catch (IOException ex){}
        
        if(difficulty == 3){
            difficultyLabel.setText("Easy");
            difficultyButton.setIcon(new ImageIcon(easyIcon));
        }
        else if(difficulty == 4){
            difficultyLabel.setText("Medium");
            difficultyButton.setIcon(new ImageIcon(midIcon));
        }
        if(difficulty == 5){
            difficultyLabel.setText("Hard");
            difficultyButton.setIcon(new ImageIcon(hardIcon));
        }
    }
        //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Save Difficulty"> 

    void saveDifficulty() throws IOException
    {
        String s = Integer.toString(difficulty);
        File file = new File(docPath.toString());
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(s);
            writer.close();
        }
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Difficulty Button Action"> 
    private void difficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyButtonActionPerformed
        PicPuzzle.Click();
        
        difficulty++;
        if(difficulty == 6){
            difficulty = 3;
        }
        
        
        try{
            saveDifficulty();
            setDifficulty();
        }
        catch (IOException ex){}
    }//GEN-LAST:event_difficultyButtonActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Score Button Action">     
    private void highscoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highscoreButtonActionPerformed
        PicPuzzle.Click();
        try{
            Scoring obj = new Scoring();
            this.setVisible(false);
            obj.setVisible(true);
            obj.setTitle("HIGH SCORE");
        }
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_highscoreButtonActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Credit Button Action"> 
    private void creditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditButtonActionPerformed
        PicPuzzle.Click();
        try{
            showMessage("credit", 0, "");
        }
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_creditButtonActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="All Button mouse over Actions">     
    private void playButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseEntered
        playButton.setForeground(Color.WHITE);
        playLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_playButtonMouseEntered
    
  
    private void difficultyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_difficultyButtonMouseEntered
        difficultyButton.setForeground(Color.WHITE);
        difficultyLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_difficultyButtonMouseEntered

    
  
    private void highscoreButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_highscoreButtonMouseEntered
        highscoreButton.setForeground(Color.WHITE);
        scoreLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_highscoreButtonMouseEntered

    
    
    private void creditButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditButtonMouseEntered
        creditButton.setForeground(Color.WHITE);
        creditLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_creditButtonMouseEntered

    
    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setForeground(Color.WHITE);
        quitLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitButtonMouseEntered
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="All Button mouse exit Actions"> 
    private void playButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseExited
        playButton.setForeground(myBlue);
        playLabel.setForeground(myGray);
    }//GEN-LAST:event_playButtonMouseExited

    private void difficultyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_difficultyButtonMouseExited
        difficultyButton.setForeground(myGray);
        difficultyLabel.setForeground(myGray);
    }//GEN-LAST:event_difficultyButtonMouseExited

    private void highscoreButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_highscoreButtonMouseExited
        highscoreButton.setForeground(myBlue);
        scoreLabel.setForeground(myGray);
    }//GEN-LAST:event_highscoreButtonMouseExited

    private void creditButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditButtonMouseExited
        creditButton.setForeground(myBlue);
        creditLabel.setForeground(myGray);
    }//GEN-LAST:event_creditButtonMouseExited

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setForeground(Color.RED);
        quitLabel.setForeground(myGray);
    }//GEN-LAST:event_exitButtonMouseExited

        //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window"> 
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();  
    }//GEN-LAST:event_jPanel1MousePressed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Mode Button">     
    private void modeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeButtonMouseEntered
        // TODO add your handling code here:
        modeLabel.setForeground(Color.white);
        if(PicPuzzle.mode)
            modeButton.setToolTipText("Complete with lest number of moves");
        else
            modeButton.setToolTipText("Compete against a time limit");
    }//GEN-LAST:event_modeButtonMouseEntered

    private void modeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeButtonMouseExited
        // TODO add your handling code here:
        modeLabel.setForeground(myGray);
    }//GEN-LAST:event_modeButtonMouseExited

    private void modeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeButtonActionPerformed
        // TODO add your handling code here:
        PicPuzzle.Click();
        if(PicPuzzle.mode)
        {
            PicPuzzle.mode = false;
            modeLabel.setText("Rush");
            modeButton.setIcon(new ImageIcon(rushIcon));
        }
        else
        {
            PicPuzzle.mode = true;
            modeLabel.setText("Relax");
            modeButton.setIcon(new ImageIcon(relaxIcon));
        }
        
    }//GEN-LAST:event_modeButtonActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Name lebel pressing actions">  
    private void playLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playLabelMouseClicked
        playButton.doClick();
    }//GEN-LAST:event_playLabelMouseClicked

    private void difficultyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_difficultyLabelMouseClicked
        difficultyButton.doClick();
    }//GEN-LAST:event_difficultyLabelMouseClicked

    private void scoreLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreLabelMouseClicked
        highscoreButton.doClick();
    }//GEN-LAST:event_scoreLabelMouseClicked

    private void modeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeLabelMouseClicked
        modeButton.doClick();
    }//GEN-LAST:event_modeLabelMouseClicked

    private void creditLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditLabelMouseClicked
        creditButton.doClick();
    }//GEN-LAST:event_creditLabelMouseClicked

    private void quitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitLabelMouseClicked
        exitButton.doClick();
    }//GEN-LAST:event_quitLabelMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Show message"> 
    void showMessage(String messageType, int moves, String st) throws FontFormatException, IOException
    {
        PopUpMessage msg = new PopUpMessage(this, messageType, moves, "");
        msg.getRootPane().setOpaque(false);
        msg.setVisible(true);
        msg.setTitle("PIC PUZZ");
        msg.getRootPane().setOpaque(false);
    }
     //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Custom Cursor">
    public void CustomCursor() throws IOException
    {
        InputStream iconImg = getClass().getResourceAsStream("/resources/Pics/cursor.png");
        Image icon = ImageIO.read(iconImg);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Point p = new Point(0,0);
        Cursor cur = tk.createCustomCursor(icon, p, "cursor");
        setCursor(cur);
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="background music">
    public void BackgroundSound()
    {
        if(!PicPuzzle.musicStarted){
            PicPuzzle.mp.start();
        }
    }
    //</editor-fold>
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GameMenu().setVisible(true);
                } 
                catch (FontFormatException | IOException ex){}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditButton;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JButton difficultyButton;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton highscoreButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton modeButton;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel playLabel;
    private javax.swing.JLabel quitLabel;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
