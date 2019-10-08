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
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public final class PopUpMessage extends javax.swing.JDialog{
    public PopUpMessage(JFrame frame, String messageType, int moves, String timing) throws FontFormatException, IOException {
        super(frame, true);
        
        initComponents();
        CustomCursor();
        setFont();
        this.setTitle("PIC PUZZ");
        
        this.getRootPane ().setOpaque (false);
        this.getContentPane ().setBackground (new Color (0, 0, 0, 0));
        this.setBackground (new Color (0, 0, 0, 0));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        setMessage(messageType, moves, timing);
    }
    
    int xx,xy;
  
    ImageIcon warning = new ImageIcon(getClass().getResource("/resources/Pics/errorPopup.png"));
    ImageIcon win = new ImageIcon(getClass().getResource("/resources/Pics/winPopup.png"));
    ImageIcon credit = new ImageIcon(getClass().getResource("/resources/Pics/creditPopup.png"));
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        messageText = new javax.swing.JTextArea();
        nameField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(200, 200));
        setUndecorated(true);
        setOpacity(0.98F);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setOpaque(false);
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

        messageText.setEditable(false);
        messageText.setBackground(new java.awt.Color(102, 102, 102));
        messageText.setColumns(20);
        messageText.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        messageText.setForeground(new java.awt.Color(255, 255, 255));
        messageText.setLineWrap(true);
        messageText.setRows(4);
        messageText.setAutoscrolls(false);
        messageText.setBorder(null);
        messageText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        messageText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        messageText.setEnabled(false);
        messageText.setFocusable(false);
        messageText.setOpaque(false);
        messageText.setRequestFocusEnabled(false);
        jPanel1.add(messageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 60, 560, 160));

        nameField.setBackground(new java.awt.Color(51, 51, 51));
        nameField.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nameField.setForeground(new java.awt.Color(51, 51, 51));
        nameField.setBorder(null);
        nameField.setCaretColor(new java.awt.Color(255, 255, 255));
        nameField.setOpaque(false);
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 550, 50));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/close.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 30, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pics/creditPopup.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Set message">
    final void setMessage(String messageType, int moves, String timing) throws FontFormatException, IOException
    {
        switch (messageType) {
            case "shuffle":
                nameField.setVisible(false);
                messageText.setText("SHUFFLE TO PLAY");
                jLabel1.setIcon(warning);
                break;
            case "picture":
                nameField.setVisible(false);
                messageText.setText("Opps!!\n"+"You forgot to open a picture!!");
                jLabel1.setIcon(warning); 
                break;
            case "win":
                nameField.setVisible(false);
                messageText.setText("You've done it!! \nUsed " + Integer.toString(moves) + " Moves");
                messageText.setDisabledTextColor(Color.BLACK);
                jLabel1.setIcon(win);
                break;
            case "timewin":
                nameField.setVisible(false);
                messageText.setText("You've done it!! \nTime elapsed " + timing);
                messageText.setDisabledTextColor(Color.BLACK);
                jLabel1.setIcon(win);
                break;
            case "highscore":
                messageText.setText("High Score!! \nUsed " + Integer.toString(moves) + " Moves\nEnter your name and press enter:");
                messageText.setDisabledTextColor(Color.BLACK);
                jLabel1.setIcon(win);
                break;
            case "timescore":
                messageText.setText("High Score!! \nTime elapsed " + timing + "\nEnter your name and press enter:");
                messageText.setDisabledTextColor(Color.BLACK);
                jLabel1.setIcon(win);
                break;
            case "credit":
                nameField.setVisible(false);
                //note: the credit text is in the image, no need for this now XD
                //messageText.setText("Sadman Rizwan \nNazmul Islam \nDept. of C.S.E. \nPremier University, Chittagong");
                //messageText.setDisabledTextColor(Color.BLACK);
                jLabel1.setIcon(credit);
                break;
            default:
                nameField.setText("ITS A BUG!");
                jLabel1.setIcon(warning);
                break;
        }
        InputStream is = getClass().getResourceAsStream("/resources/Fonts/rabbit.ttf");
        Font f = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(30.0f);
        messageText.setFont(f);
        
        is = getClass().getResourceAsStream("/resources/Fonts/rabbit.ttf");
        f = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(40.0f);
        nameField.setFont(f);
        
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Set font">
    final void setFont() throws FontFormatException, IOException
    {
        InputStream is = getClass().getResourceAsStream("/resources/Fonts/rabbit.ttf");
        Font f = Font.createFont(Font.TRUETYPE_FONT, is);
        //messageText.setFont(f);
        //nameField.setFont(f);
        for(Component comp : jPanel1.getComponents()){
            comp.setFont(f.deriveFont(40.0f));
        }
    }
     // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Name field">
    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        if(nameField.getText().length() >= 10 || !Character.isLetterOrDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_nameFieldKeyTyped
    
    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                if(PicPuzzle.mode){
                    Scoring.saveScore(nameField.getText());
                }
                else{
                    Scoring.saveScore(nameField.getText(),true);
                }
                this.setVisible(false);
            }
            catch (IOException ex){}
        }
    }//GEN-LAST:event_nameFieldKeyPressed

     // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Close window">
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PicPuzzle.Click();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
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
    
    // <editor-fold defaultstate="collapsed" desc="Custom Cursor">
    public void CustomCursor() throws IOException
    {
        InputStream iconImg = getClass().getResourceAsStream("/resources/Pics/cursor.png");
        Image icon = ImageIO.read(iconImg);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Point p = new Point(0,0);
        Cursor cur = tk.createCustomCursor(icon, p, "cursor");
        setCursor(cur);
        jButton1.setCursor(cur);
    }
    //</editor-fold>
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new PopUpMessage(null,"",0,"").setVisible(true);
                }
                catch (FontFormatException | IOException ex){}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea messageText;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
