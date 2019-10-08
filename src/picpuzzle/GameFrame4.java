package picpuzzle;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Math.abs;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public final class GameFrame4 extends javax.swing.JFrame {
    public GameFrame4() throws FontFormatException, IOException {
        initComponents();
        CustomCursor();
        setFont();
        counterField.setText(PicPuzzle.mode ? "0" : "00:00:00");
        createButtonList();
        createPathList();
        enableButtons(false);
        numText.setVisible(false);
        
        //code for centering the frame regardless screen size 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        previewLabel = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();
        shuffleButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        pzlButton1 = new javax.swing.JButton();
        pzlButton2 = new javax.swing.JButton();
        pzlButton3 = new javax.swing.JButton();
        pzlButton4 = new javax.swing.JButton();
        pzlButton5 = new javax.swing.JButton();
        pzlButton6 = new javax.swing.JButton();
        pzlButton7 = new javax.swing.JButton();
        pzlButton8 = new javax.swing.JButton();
        pzlButton9 = new javax.swing.JButton();
        pzlButton10 = new javax.swing.JButton();
        pzlButton11 = new javax.swing.JButton();
        pzlButton12 = new javax.swing.JButton();
        pzlButton13 = new javax.swing.JButton();
        pzlButton14 = new javax.swing.JButton();
        pzlButton15 = new javax.swing.JButton();
        pzlButton16 = new javax.swing.JButton();
        counterField = new javax.swing.JTextField();
        cheatPass = new javax.swing.JTextField();
        numText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jLabelpOpen = new javax.swing.JLabel();
        jLabelShuffle = new javax.swing.JLabel();
        jLabelSideBar = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(989, 644));
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

        previewLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previewLabelMouseClicked(evt);
            }
        });
        jPanel1.add(previewLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 300, 300));

        openButton.setBackground(new java.awt.Color(51, 51, 51));
        openButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        openButton.setForeground(new java.awt.Color(0, 153, 255));
        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/open.png"))); // NOI18N
        openButton.setBorder(null);
        openButton.setFocusPainted(false);
        openButton.setOpaque(false);
        openButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openButtonMouseExited(evt);
            }
        });
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });
        jPanel1.add(openButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 70, 70));

        shuffleButton.setBackground(new java.awt.Color(51, 51, 51));
        shuffleButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        shuffleButton.setForeground(new java.awt.Color(0, 153, 255));
        shuffleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/shuffle.png"))); // NOI18N
        shuffleButton.setBorder(null);
        shuffleButton.setFocusPainted(false);
        shuffleButton.setOpaque(false);
        shuffleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shuffleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shuffleButtonMouseExited(evt);
            }
        });
        shuffleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shuffleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(shuffleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 70, 70));

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/home.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setFocusPainted(false);
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
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 70, 70));

        pzlButton1.setFocusPainted(false);
        pzlButton1.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 120));

        pzlButton2.setFocusPainted(false);
        pzlButton2.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 120));

        pzlButton3.setFocusPainted(false);
        pzlButton3.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, 120));

        pzlButton4.setFocusPainted(false);
        pzlButton4.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 120, 120));

        pzlButton5.setFocusPainted(false);
        pzlButton5.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, 120));

        pzlButton6.setFocusPainted(false);
        pzlButton6.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, 120));

        pzlButton7.setFocusPainted(false);
        pzlButton7.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 120, 120));

        pzlButton8.setFocusPainted(false);
        pzlButton8.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 120, 120));

        pzlButton9.setFocusPainted(false);
        pzlButton9.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 120, 120));

        pzlButton10.setFocusPainted(false);
        pzlButton10.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 120));

        pzlButton11.setFocusPainted(false);
        pzlButton11.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 120, 120));

        pzlButton12.setFocusPainted(false);
        pzlButton12.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 120, 120));

        pzlButton13.setFocusPainted(false);
        pzlButton13.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 120, 120));

        pzlButton14.setFocusPainted(false);
        pzlButton14.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 120, 120));

        pzlButton15.setFocusPainted(false);
        pzlButton15.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 120, 120));

        pzlButton16.setBackground(new java.awt.Color(0, 153, 255));
        pzlButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pzlButton16.setFocusPainted(false);
        pzlButton16.setPreferredSize(new java.awt.Dimension(120, 120));
        pzlButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzlButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(pzlButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 120, 120));

        counterField.setEditable(false);
        counterField.setBackground(new java.awt.Color(51, 51, 51));
        counterField.setFont(new java.awt.Font("Roboto Condensed Light", 0, 36)); // NOI18N
        counterField.setForeground(new java.awt.Color(255, 255, 255));
        counterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        counterField.setText("000");
        counterField.setAutoscrolls(false);
        counterField.setBorder(null);
        counterField.setCaretColor(new java.awt.Color(51, 51, 51));
        counterField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        counterField.setEnabled(false);
        counterField.setOpaque(false);
        jPanel1.add(counterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 270, 50));

        cheatPass.setBackground(new java.awt.Color(51, 51, 51));
        cheatPass.setForeground(new java.awt.Color(51, 51, 51));
        cheatPass.setBorder(null);
        cheatPass.setCaretColor(new java.awt.Color(51, 51, 51));
        cheatPass.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        cheatPass.setOpaque(false);
        cheatPass.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        cheatPass.setSelectionColor(new java.awt.Color(51, 51, 51));
        cheatPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cheatPassKeyPressed(evt);
            }
        });
        jPanel1.add(cheatPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 160, 20));

        numText.setBackground(new java.awt.Color(51, 51, 51));
        numText.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        numText.setForeground(new java.awt.Color(255, 0, 0));
        numText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numText.setText("0");
        numText.setBorder(null);
        numText.setOpaque(false);
        numText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numTextKeyPressed(evt);
            }
        });
        jPanel1.add(numText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 50, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 280, 3));

        jLabelHome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHome.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHome.setText("Home");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 70, -1));

        jLabelpOpen.setBackground(new java.awt.Color(255, 255, 255));
        jLabelpOpen.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabelpOpen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpOpen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelpOpen.setText("Open");
        jLabelpOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelpOpenMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelpOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 70, -1));

        jLabelShuffle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelShuffle.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabelShuffle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelShuffle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelShuffle.setText("Shuffle");
        jLabelShuffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelShuffleMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelShuffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 70, -1));

        jLabelSideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pics/sidePanel.jpg"))); // NOI18N
        jLabelSideBar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabelSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, -6, 340, 650));

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pics/backPanel.jpg"))); // NOI18N
        jLabelBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="Variabls">
    int tiles = 16, moves = 0, dim = 4;
    int buttonDistance;
    String filename;
    File file;
    boolean done = new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles").mkdir();
    boolean newGame = true;
    boolean imageSelected = false;
    boolean win = false;
    JButton emptyButton;
    
    Path defaultPath = Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/gameImage.jpg");
    String blurImagePath = new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/blurImage.jpg";
    Path p = defaultPath;
    Path[] pathList = {p,p,p,p,p,p,p,p,p,p,p,p,p,p,p};
    JButton[] buttonList = new javax.swing.JButton[20];
    Color myBlue = new Color(0, 153, 255);
    
    int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, pos = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int[] buttonX = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, buttonY = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    
    int xx,xy;
    
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Set font">
    final void setFont() throws FontFormatException, IOException
    {
        InputStream is = getClass().getResourceAsStream("/resources/Fonts/rabbit.ttf");
        Font f = Font.createFont(Font.TRUETYPE_FONT, is);
        
        for(Component comp : jPanel1.getComponents()){
            if(comp != counterField){
                comp.setFont(f.deriveFont(18.0f));
            }
            else{
                comp.setFont(f.deriveFont(40.0f));
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Crop image">
    void cropImage() throws IOException{
        BufferedImage bImage = ImageIO.read(file);
        int i=0, w = bImage.getWidth()-4, h = bImage.getHeight()-4;
        for(int a=0; a<4; a++){
            for(int b=0; b<4; b++){
                if(a==3 && b==3) break;
                int x = b+(b*(w/4)), y = a+(a*(h/4));
                BufferedImage cropedImage = bImage.getSubimage(x, y, w/4, h/4);
                ImageIO.write(cropedImage, "jpg", new File(pathList[i++].toString()));
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="set image">
    void setImage() throws IOException{
        for(int a=0; a<15; a++){
            int w = buttonList[a].getWidth(), h = buttonList[a].getHeight();
            Image cropedImage = ImageIO.read(new File(pathList[a].toString()));
            cropedImage = cropedImage.getScaledInstance(w, h, Image.SCALE_SMOOTH);
            buttonList[a].setIcon(new ImageIcon(cropedImage));
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Blur Image">
    void blurImage(File file, File opFile) throws IOException{
        int radius = 10;
        int size = radius * 2 + 1;
        float weight = 1.0f / (size * size);
        float[] data = new float[size * size];

        for (int i = 0; i < data.length; i++) {
            data[i] = weight;
        }

        Kernel kernel = new Kernel(size, size, data);
        ConvolveOp op = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
        BufferedImage bimage = ImageIO.read(file);
        BufferedImage rimage = ImageIO.read(opFile);
        BufferedImage bluredImage = op.filter(bimage, rimage);
        Image image = bluredImage.getSubimage(30, 30, bluredImage.getWidth() - 60, bluredImage.getHeight() - 60);
        int w = jLabelBG.getWidth(), h = jLabelBG.getHeight();
        image = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        jLabelBG.setIcon(new ImageIcon(image));
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="set preview">
    void setPreview() throws IOException{
        int w = previewLabel.getWidth(), h = previewLabel.getHeight();
        Image image = ImageIO.read(new File(defaultPath.toString()));
        image = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        previewLabel.setIcon(new ImageIcon(image));
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="click button">
    void clickButton(int i) throws FileNotFoundException, IOException, FontFormatException
    {
        if(!imageSelected){
            showMessage("picture", 0, "");
        }
        else if(newGame){
            showMessage("shuffle", 0, "");
        }
        else{
            int x1 = buttonList[i].getX(), y1 = buttonList[i].getY();
            int x2 = emptyButton.getX(), y2 = emptyButton.getY();
            if((abs(x1 - x2) == 0 && abs(y1 - y2) == buttonDistance) || (abs(y1 - y2) == 0 && abs(x1 - x2) == buttonDistance)){
                PicPuzzle.tileClick();
                swapButton(i);
                if(PicPuzzle.mode){
                    counterField.setText(Integer.toString(moves));
                }
            }
            if(gameWon()){
                PicPuzzle.myFlag = true;
                boolean newHighScore = PicPuzzle.mode ? Scoring.isHighScore(moves, dim) : Scoring.isHighScore(counterField.getText(), dim, true);
                if(newHighScore){
                    Scoring.moves = moves;
                    Scoring.timing = counterField.getText();
                    Scoring.difficulty = dim;
                    String msg = PicPuzzle.mode ? "highscore" : "timescore";
                    showMessage(msg, moves, counterField.getText());
                }
                else{
                    String msg = PicPuzzle.mode ? "win" : "timewin";
                    showMessage(msg, moves, counterField.getText());
                }
                newGame = true;
                win = true;
                moves = 0;
                enableButtons(false);
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="swap button">
    void swapButton(int i)
    {
        JButton button1 = buttonList[i], button2 = emptyButton;
        int x1 = button1.getX(), y1 = button1.getY();
        int x2 = button2.getX(), y2 = button2.getY();
        button1.setLocation(x2, y2);
        button2.setLocation(x1, y1);
        int p1 = pos[i], p2 = pos[15];
        pos[i] = p2;
        pos[15] = p1;
        arr[p1] = 15;
        arr[p2] = i;
        moves++;
    }
    // </editor-fold> 
    
    
    // <editor-fold defaultstate="collapsed" desc="game won">
    boolean gameWon()
    {
        for(int a=0; a<tiles; a++){
            if(arr[a] != a){
                return false;
            }
        }
        return true;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="create button list">
    final void createButtonList()
    {
        buttonList[0] = pzlButton1;
        buttonList[1] = pzlButton2;
        buttonList[2] = pzlButton3;
        buttonList[3] = pzlButton4;
        buttonList[4] = pzlButton5;
        buttonList[5] = pzlButton6;
        buttonList[6] = pzlButton7;
        buttonList[7] = pzlButton8;
        buttonList[8] = pzlButton9;
        buttonList[9] = pzlButton10;
        buttonList[10] = pzlButton11;
        buttonList[11] = pzlButton12;
        buttonList[12] = pzlButton13;
        buttonList[13] = pzlButton14;
        buttonList[14] = pzlButton15;
        buttonList[15] = pzlButton16;
        emptyButton = pzlButton16;
        buttonDistance = abs(buttonList[0].getBounds().x - buttonList[1].getBounds().x);
        for(int a=0; a<16; a++){
            buttonX[a] = buttonList[a].getBounds().x;
            buttonY[a] = buttonList[a].getBounds().y;
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="create path list">
    final void createPathList()
    {
        String s1 = new JFileChooser().getFileSystemView().getDefaultDirectory().toString()+"/gameFiles/cropedImage";
        String s2 = ".jpg";
        for(int a=0; a<15; a++){
            String s = s1 + Integer.toString(a+1) + s2;
            pathList[a] = Paths.get(s);
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="enable buttons">
    final void enableButtons(boolean on){
        for(int a=0; a<tiles; a++){
            buttonList[a].setEnabled(on);
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="show message">
    void showMessage(String messageType, int moves, String timing) throws FontFormatException, IOException
    {
        PopUpMessage msg = new PopUpMessage(this, messageType, moves, timing);
        msg.setVisible(true);
        msg.setTitle("PIC PUZZ");
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="set combination">
    void setCombination()
    {
        for(int a=0;a<16;a++){
            arr[a] = a;
            pos[a] = a;
            buttonList[a].setBounds(buttonX[a], buttonY[a], buttonList[a].getWidth(), buttonList[a].getHeight());
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="open button">
    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        PicPuzzle.Click();
            try{
            FileDialog filedialog = new FileDialog(GameFrame4.this,"Open File",FileDialog.LOAD);
            filedialog.setFile("*.jpg;*.jpeg");
            filedialog.setVisible(true);
            if(filedialog.getFile() != null){
                PicPuzzle.diff = 0;
                PicPuzzle.myFlag = true;
                counterField.setText(PicPuzzle.mode ? "0" : "00:00:00");
                
                filename = filedialog.getDirectory() + filedialog.getFile();
                file = new File(filename);
                
                File deleteFile = new File(defaultPath.toString());
                deleteFile.delete();
                File blurFile = new File(blurImagePath);
                blurFile.delete();
                Files.copy(file.toPath(),defaultPath);
                Files.copy(file.toPath(),Paths.get(blurImagePath));
                file = new File(defaultPath.toString());
                imageSelected = true;
                newGame = true;
                win = false;
            
                blurImage(file, blurFile);
                cropImage();
                setImage();
                setCombination();
                setPreview();
                enableButtons(false);
            }
        }
        catch(IOException e){}
    }//GEN-LAST:event_openButtonActionPerformed
// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="shuffle button">
    private void shuffleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shuffleButtonActionPerformed
        PicPuzzle.Click();
        if(!imageSelected){
            try{
                showMessage("picture", 0, "");
            }
            catch (FontFormatException | IOException ex){}
        }
        else{
            Random rand = new Random();
            for(int a=0; a<1000; a++){
                int n = rand.nextInt(14);
                swapButton(n);
            }
            
            win = false;
            moves = 0;
            
            enableButtons(true);
            if(newGame){
                PicPuzzle.diff = 0;
                newGame = false;
                if(!PicPuzzle.tm.isAlive()){
                    PicPuzzle.tm.start();
                    PicPuzzle.tm.setPriority(10);
                }
                else{
                    PicPuzzle.myFlag = false;
                }
            }  
        }
    }//GEN-LAST:event_shuffleButtonActionPerformed
// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="back button ">
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        PicPuzzle.Click();
        try {
            GameMenu menu = new GameMenu();
            PicPuzzle.diff = 0;
            PicPuzzle.myFlag = true;
            menu.setVisible(true);
            this.setVisible(false);
            menu.setTitle("PIC PUZZ");
        }
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_backButtonActionPerformed
// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="puzzle buttons">
    private void pzlButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton1ActionPerformed
        try{
            clickButton(0);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton1ActionPerformed

    private void pzlButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton2ActionPerformed
        try{
            clickButton(1);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton2ActionPerformed

    private void pzlButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton3ActionPerformed
        try{
            clickButton(2);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton3ActionPerformed

    private void pzlButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton4ActionPerformed
        try{
            clickButton(3);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton4ActionPerformed

    private void pzlButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton5ActionPerformed
        try{
            clickButton(4);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton5ActionPerformed

    private void pzlButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton6ActionPerformed
        try{
            clickButton(5);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton6ActionPerformed

    private void pzlButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton7ActionPerformed
        try{
            clickButton(6);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton7ActionPerformed

    private void pzlButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton8ActionPerformed
        try{
            clickButton(7);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton8ActionPerformed

    private void pzlButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton9ActionPerformed
        try{
            clickButton(8);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton9ActionPerformed

    private void pzlButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton10ActionPerformed
        try{
            clickButton(9);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton10ActionPerformed

    private void pzlButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton11ActionPerformed
        try{
            clickButton(10);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton11ActionPerformed

    private void pzlButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton12ActionPerformed
        try{
            clickButton(11);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton12ActionPerformed

    private void pzlButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton13ActionPerformed
        try{
            clickButton(12);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton13ActionPerformed

    private void pzlButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton14ActionPerformed
        try{
            clickButton(13);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton14ActionPerformed

    private void pzlButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton15ActionPerformed
        try{
            clickButton(14);
        }
        catch (FileNotFoundException ex){}
        catch (FontFormatException | IOException ex){}
    }//GEN-LAST:event_pzlButton15ActionPerformed

    private void pzlButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzlButton16ActionPerformed
        //Do nothing
    }//GEN-LAST:event_pzlButton16ActionPerformed
// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Button mouse over">
    private void openButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseEntered
        openButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_openButtonMouseEntered

    private void shuffleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shuffleButtonMouseEntered
        shuffleButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_shuffleButtonMouseEntered

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_backButtonMouseEntered
    // </editor-fold> 
    
    
    // <editor-fold defaultstate="collapsed" desc="button mouse exit">
    private void openButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseExited
        openButton.setForeground(myBlue);
    }//GEN-LAST:event_openButtonMouseExited

    private void shuffleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shuffleButtonMouseExited
        shuffleButton.setForeground(myBlue);
    }//GEN-LAST:event_shuffleButtonMouseExited

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setForeground(Color.RED);
    }//GEN-LAST:event_backButtonMouseExited
        // </editor-fold>
    

    // <editor-fold defaultstate="collapsed" desc="preview click">
    private void previewLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewLabelMouseClicked
        if(win){
            shuffleButton.doClick();
            counterField.setText(PicPuzzle.mode ? "0" : "00:00:00");
        }
    }//GEN-LAST:event_previewLabelMouseClicked
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Cheat code">
    private void cheatPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cheatPassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(numText.isVisible()){
                numText.setVisible(false);
            }
            else{
                if(cheatPass.getText().equals("2901")){
                    numText.setVisible(true);
                }
            }
            cheatPass.setText("");
        }
    }//GEN-LAST:event_cheatPassKeyPressed

    private void numTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numTextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int n = Integer.valueOf(numText.getText());
            swapButton(n);
        }
    }//GEN-LAST:event_numTextKeyPressed
 // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Drag window">
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
    
    // <editor-fold defaultstate="collapsed" desc="Open Label Click">
    private void jLabelpOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelpOpenMouseClicked
        openButton.doClick();
    }//GEN-LAST:event_jLabelpOpenMouseClicked
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Shuffle Label Click">
    private void jLabelShuffleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShuffleMouseClicked
        shuffleButton.doClick();
    }//GEN-LAST:event_jLabelShuffleMouseClicked
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Home Label Click">
    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        backButton.doClick();
    }//GEN-LAST:event_jLabelHomeMouseClicked
                                      
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
    }
    //</editor-fold>
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new GameFrame4().setVisible(true);
                }
                catch (FontFormatException | IOException ex){}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cheatPass;
    public static javax.swing.JTextField counterField;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelShuffle;
    private javax.swing.JLabel jLabelSideBar;
    private javax.swing.JLabel jLabelpOpen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField numText;
    private javax.swing.JButton openButton;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JButton pzlButton1;
    private javax.swing.JButton pzlButton10;
    private javax.swing.JButton pzlButton11;
    private javax.swing.JButton pzlButton12;
    private javax.swing.JButton pzlButton13;
    private javax.swing.JButton pzlButton14;
    private javax.swing.JButton pzlButton15;
    private javax.swing.JButton pzlButton16;
    private javax.swing.JButton pzlButton2;
    private javax.swing.JButton pzlButton3;
    private javax.swing.JButton pzlButton4;
    private javax.swing.JButton pzlButton5;
    private javax.swing.JButton pzlButton6;
    private javax.swing.JButton pzlButton7;
    private javax.swing.JButton pzlButton8;
    private javax.swing.JButton pzlButton9;
    private javax.swing.JButton shuffleButton;
    // End of variables declaration//GEN-END:variables
}
