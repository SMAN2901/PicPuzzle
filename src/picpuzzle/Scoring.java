package picpuzzle;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public final class Scoring extends javax.swing.JFrame {
    public Scoring() throws FontFormatException, IOException {
        initComponents();
        CustomCursor();
        setFont();
        getDifficulty();
        if(PicPuzzle.mode){
            viewScore(difficulty);
        }
        else{
            viewScore(difficulty, true);
        }
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        scoreText = new javax.swing.JTextArea();
        scoreLabel2 = new javax.swing.JLabel();
        scoreLabel3 = new javax.swing.JLabel();
        scoreLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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

        nameLabel.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("HIGH SCORES");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 390, 60));

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 153, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setFocusPainted(false);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        backButton.setOpaque(false);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 80, 40));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        nameText.setEditable(false);
        nameText.setBackground(new java.awt.Color(51, 51, 51));
        nameText.setColumns(20);
        nameText.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.setLineWrap(true);
        nameText.setRows(5);
        nameText.setAutoscrolls(false);
        nameText.setBorder(null);
        nameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nameText.setEnabled(false);
        nameText.setFocusable(false);
        nameText.setOpaque(false);
        nameText.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(nameText);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 400, 300));

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        scoreText.setEditable(false);
        scoreText.setBackground(new java.awt.Color(51, 51, 51));
        scoreText.setColumns(20);
        scoreText.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        scoreText.setForeground(new java.awt.Color(255, 255, 255));
        scoreText.setLineWrap(true);
        scoreText.setRows(5);
        scoreText.setAutoscrolls(false);
        scoreText.setBorder(null);
        scoreText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scoreText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        scoreText.setEnabled(false);
        scoreText.setFocusable(false);
        scoreText.setOpaque(false);
        scoreText.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(scoreText);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 400, 300));

        scoreLabel2.setBackground(new java.awt.Color(51, 51, 51));
        scoreLabel2.setFont(new java.awt.Font("Roboto Condensed Light", 1, 36)); // NOI18N
        scoreLabel2.setForeground(new java.awt.Color(0, 153, 255));
        scoreLabel2.setText("MEDIUM");
        scoreLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(scoreLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, 50));

        scoreLabel3.setBackground(new java.awt.Color(51, 51, 51));
        scoreLabel3.setFont(new java.awt.Font("Roboto Condensed Light", 1, 36)); // NOI18N
        scoreLabel3.setForeground(new java.awt.Color(0, 153, 255));
        scoreLabel3.setText("HARD");
        scoreLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(scoreLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, 50));

        scoreLabel1.setBackground(new java.awt.Color(51, 51, 51));
        scoreLabel1.setFont(new java.awt.Font("Roboto Condensed Light", 1, 36)); // NOI18N
        scoreLabel1.setForeground(new java.awt.Color(0, 153, 255));
        scoreLabel1.setText("EASY");
        scoreLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(scoreLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, 840, 2));

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pics/backPanel.jpg"))); // NOI18N
        jLabelBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jLabelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 525));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Variable diclarations"> 
    boolean done = new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles").mkdir();
    static Path savePath = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/save.dat");
    
    static Path docPath1 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/score1.dat");
    static Path docPath2 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/score2.dat");
    static Path docPath3 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/score3.dat");
    
    static Path timePath1 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/timescore1.dat");
    static Path timePath2 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/timescore2.dat");
    static Path timePath3 = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/timescore3.dat");
    
    static int difficulty = 3, moves = 0;
    static String timing = "99:99:99";
    static Color myBlue = new Color(0, 153, 255);
    Color myGray = new Color(35,35,35);
    
    int xx,xy;
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="View Score"> 
    void viewScore(int difficulty) throws IOException
    {
        setLabels(difficulty);
        Path path = docPath1;
        if(difficulty == 4){
            path = docPath2;
        }
        else if(difficulty == 5){
            path = docPath3;
        }
        File doc = new File(path.toString());
        String s1 = "", s2 = "1234567890";
        String nameList[] = {s1,s1,s1,s1,s1};
        String scoreList[] = {s2,s2,s2,s2,s2};
        int i = 0;
        
        
        if(doc.exists() && !doc.isDirectory()) { 
            try{
                BufferedReader b = new BufferedReader(new FileReader(doc));
                while ((s1 = b.readLine()) != null && i<5){
                    if(s1.length() < 11){
                        clearSaveFile();
                        return;
                    }
                    nameList[i] = s1.substring(0, 10);
                    scoreList[i++] = s1.substring(10);
                }
            }
            catch (IOException ex){}
        }
        
        String name = "", score = "";
        for(int a=0; a<5; a++){
            if(!nameList[a].equals(PicPuzzle.codeName) && !scoreList[a].equals(PicPuzzle.codeScore)){
                name += nameList[a] + "\n";
                score += scoreList[a] + " MOVES\n";
            }
        }
        nameText.setText(name);
        nameText.setFont(backButton.getFont());
        scoreText.setText(score);
        scoreText.setFont(backButton.getFont());
    }
    
    void viewScore(int difficulty, boolean nothing) throws IOException
    {
        setLabels(difficulty);
        Path path = timePath1;
        if(difficulty == 4){
            path = timePath2;
        }
        else if(difficulty == 5){
            path = timePath3;
        }
        File doc = new File(path.toString());
        String s1 = "", s2 = "99:99:99";
        String nameList[] = {s1,s1,s1,s1,s1};
        String scoreList[] = {s2,s2,s2,s2,s2};
        int i = 0;
        
        
        if(doc.exists() && !doc.isDirectory()) { 
            try{
                BufferedReader b = new BufferedReader(new FileReader(doc));
                while ((s1 = b.readLine()) != null && i<5){
                    if(s1.length() < 11){
                        clearSaveFile(true);
                        return;
                    }
                    nameList[i] = s1.substring(0, 10);
                    scoreList[i++] = s1.substring(10);
                }
            }
            catch (IOException ex){}
        }
        
        String name = "", score = "";
        for(int a=0; a<5; a++){
            if(!nameList[a].equals(PicPuzzle.codeName) && !scoreList[a].equals(PicPuzzle.codeScore1)){
                name += nameList[a] + "\n";
                score += scoreList[a] + "\n";
            }
        }
        nameText.setText(name);
        nameText.setFont(backButton.getFont());
        scoreText.setText(score);
        scoreText.setFont(backButton.getFont());
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Is high Score"> 
    static boolean isHighScore(int moves, int difficulty) throws FileNotFoundException, IOException
    {
        Path path = docPath1;
        if(difficulty == 4){
            path = docPath2;
        }
        else if(difficulty == 5){
            path = docPath3;
        }
        File doc = new File(path.toString());
        int i = 0;
        String s;
        int[] scoreList = {0,0,0,0,0,0};
        if(doc.exists() && !doc.isDirectory()){ 
            BufferedReader b = new BufferedReader(new FileReader(doc));
            while ((s = b.readLine()) != null && i<5){
                scoreList[i++] = Integer.valueOf(s.substring(10));
            }
        }
        return moves < scoreList[4];
    }
    
    static boolean isHighScore(String timing, int difficulty, boolean nothing) throws FileNotFoundException, IOException
    {
        Path path = timePath1;
        if(difficulty == 4){
            path = timePath2;
        }
        else if(difficulty == 5){
            path = timePath3;
        }
        File doc = new File(path.toString());
        int i = 0;
        String s;
        String[] scoreList = {"99:99:99","99:99:99","99:99:99","99:99:99","99:99:99","99:99:99"};
        if(doc.exists() && !doc.isDirectory()){ 
            BufferedReader b = new BufferedReader(new FileReader(doc));
            while ((s = b.readLine()) != null && i<5){
                scoreList[i++] = s.substring(10);
            }
        }
        System.out.println(timing);
        System.out.println(scoreList[4]);
        return timing.compareTo(scoreList[4])<0;
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Save Score"> 
    static void saveScore(String name) throws FileNotFoundException, IOException
    {
        Path path = docPath1;
        if(difficulty == 4){
            path = docPath2;
        }
        else if(difficulty == 5){
            path = docPath3;
        }
        File doc = new File(path.toString());
        int i = 0;
        String s =  "";
        String[] nameList = {s,s,s,s,s,s};
        int[] scoreList = {0,0,0,0,0,0};
        name = processName(name);
        if(doc.exists() && !doc.isDirectory()) { 
            BufferedReader b = new BufferedReader(new FileReader(doc));
            while ((s = b.readLine()) != null && i<5){
                nameList[i] = s.substring(0, 10);
                scoreList[i++] = Integer.valueOf(s.substring(10));
            }
            
            nameList[i] = name;
            scoreList[i] = moves;
            
            for(int a=0; a<6; a++){
                int v = scoreList[a], x = a;
                for(int j=a+1; j<6; j++){
                    if(v > scoreList[j]){
                        v = scoreList[j];
                        x = j;
                    }
                }
                int temp = scoreList[a];
                scoreList[a] = scoreList[x];
                scoreList[x] = temp;
                
                String tmp = nameList[a];
                nameList[a] = nameList[x];
                nameList[x] = tmp;
            }
            
            String saveString = "";
            for(int a=0; a<5; a++){
                if(scoreList[a] > 0){
                    saveString += nameList[a] + Integer.toString(scoreList[a]) + "\n";
                }
            }
            
            try (PrintWriter writer = new PrintWriter(doc)){
                writer.print(saveString);
                writer.close();
            }
        }
    }
    
    static void saveScore(String name, boolean nothing) throws FileNotFoundException, IOException
    {
        Path path = timePath1;
        if(difficulty == 4){
            path = timePath2;
        }
        else if(difficulty == 5){
            path = timePath3;
        }
        File doc = new File(path.toString());
        int i = 0;
        String s =  "", s1 = "99:99:99";
        String[] nameList = {s,s,s,s,s,s};
        String[] scoreList = {s1,s1,s1,s1,s1,s1};
        name = processName(name);
        if(doc.exists() && !doc.isDirectory()) { 
            BufferedReader b = new BufferedReader(new FileReader(doc));
            while ((s = b.readLine()) != null && i<5){
                nameList[i] = s.substring(0, 10);
                scoreList[i++] = s.substring(10);
            }
            
            nameList[i] = name;
            scoreList[i] = timing;
            
            for(int a=0; a<6; a++){
                String v = scoreList[a];
                int x = a;
                for(int j=a+1; j<6; j++){
                    if(v.compareTo(scoreList[j])>0){
                        v = scoreList[j];
                        x = j;
                    }
                }
                String temp = scoreList[a];
                scoreList[a] = scoreList[x];
                scoreList[x] = temp;
                
                String tmp = nameList[a];
                nameList[a] = nameList[x];
                nameList[x] = tmp;
            }
            
            String saveString = "";
            for(int a=0; a<5; a++){
                if(scoreList[a].charAt(0) != '9'){
                    saveString += nameList[a] + scoreList[a] + "\n";
                }
            }
            
            try (PrintWriter writer = new PrintWriter(doc)){
                writer.print(saveString);
                writer.close();
            }
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Clear Save"> 
    void clearSaveFile() throws FileNotFoundException
    {
        Path path = docPath1;
        if(difficulty == 4){
            path = docPath2;
        }
        else if(difficulty == 5){
            path = docPath3;
        }
        File doc = new File(path.toString());
        String s = "", t = PicPuzzle.codeName + PicPuzzle.codeScore + "\n";
        for(int a=0; a<5; a++){
            s += t;
        }
        try (PrintWriter writer = new PrintWriter(doc)){
            writer.print(s);
            writer.close();
        }
    }
    
    void clearSaveFile(boolean nothing) throws FileNotFoundException
    {
        Path path = timePath1;
        if(difficulty == 4){
            path = timePath2;
        }
        else if(difficulty == 5){
            path = timePath3;
        }
        File doc = new File(path.toString());
        String s = "", t = PicPuzzle.codeName + PicPuzzle.codeScore1 + "\n";
        for(int a=0; a<5; a++){
            s += t;
        }
        try (PrintWriter writer = new PrintWriter(doc)){
            writer.print(s);
            writer.close();
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Process Name"> 
    static String processName(String name)
    {
        while(name.length() < 10){
            name += " ";
        }
        return name;
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Set Labels"> 
    void setLabels(int difficulty)
    {
        switch (difficulty) {
            case 3:
                scoreLabel1.setForeground(Color.WHITE);
                scoreLabel2.setForeground(myGray);
                scoreLabel3.setForeground(myGray);
                break;
            case 4:
                scoreLabel2.setForeground(Color.WHITE);
                scoreLabel1.setForeground(myGray);
                scoreLabel3.setForeground(myGray);
                break;
            case 5:
                scoreLabel3.setForeground(Color.WHITE);
                scoreLabel1.setForeground(myGray);
                scoreLabel2.setForeground(myGray);
                break;
            default:
                break;
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Set font"> 
    final void setFont() throws FontFormatException, IOException
    {
        InputStream is = getClass().getResourceAsStream("/resources/Fonts/rabbit.ttf");
        Font f = Font.createFont(Font.TRUETYPE_FONT, is);
        
        for(Component comp : jPanel1.getComponents()){
            comp.setFont(f.deriveFont(40.0f));
        }
        
        is = getClass().getResourceAsStream("/resources/Fonts/break.ttf");
        f = Font.createFont(Font.TRUETYPE_FONT, is);
        nameLabel.setFont(f.deriveFont(60.0f));
        
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Back Button"> 
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       PicPuzzle.Click();
        try {
            GameMenu menu = new GameMenu();
            this.setVisible(false);
            menu.setVisible(true);
            menu.setTitle("PIC PUZZ");
        }
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_backButtonActionPerformed
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Score Tabs"> 
    private void scoreLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreLabel1MouseClicked
        PicPuzzle.Click();
        try{
            if(PicPuzzle.mode){
                viewScore(3);
            }
            else{
                viewScore(3,true);
            }
        }
        catch (IOException ex){}
    }//GEN-LAST:event_scoreLabel1MouseClicked

    private void scoreLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreLabel2MouseClicked
        PicPuzzle.Click();
        try{
            if(PicPuzzle.mode){
                viewScore(4);
            }
            else{
                viewScore(4,true);
            }
        }
        catch (IOException ex){}
    }//GEN-LAST:event_scoreLabel2MouseClicked

    private void scoreLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreLabel3MouseClicked
        PicPuzzle.Click();
        try{
            if(PicPuzzle.mode){
                viewScore(5);
            }
            else{
                viewScore(5,true);
            }
        }
        catch (IOException ex){}
    }//GEN-LAST:event_scoreLabel3MouseClicked
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="More of Back button"> 
    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setForeground(myBlue);
    }//GEN-LAST:event_backButtonMouseExited
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Window Drag"> 
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Get difficulty"> 
    final void getDifficulty() throws IOException
    {
        String s = new String(Files.readAllBytes(savePath));
        difficulty = Integer.valueOf(s);
    }
     // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Custom Cursor">
    public void CustomCursor() throws IOException
    {
        InputStream iconImg = getClass().getResourceAsStream("/resources/Pics/cursor.png");
        Image icon = ImageIO.read(iconImg);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Point p = new Point(0,0);
        Cursor cur = tk.createCustomCursor(icon, p, "cursor");
        setCursor(cur);
        backButton.setCursor(cur);
    }
    //</editor-fold>
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new Scoring().setVisible(true);
                }
                catch (FontFormatException | IOException ex){}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea nameText;
    private javax.swing.JLabel scoreLabel1;
    private javax.swing.JLabel scoreLabel2;
    private javax.swing.JLabel scoreLabel3;
    private javax.swing.JTextArea scoreText;
    // End of variables declaration//GEN-END:variables
}
