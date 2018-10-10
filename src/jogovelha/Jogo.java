package jogovelha;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Jogo extends javax.swing.JFrame {

    boolean player1 = true;
    boolean player2 = false;
    int win1,loss1,win2,loss2,gtied;
    String p1 = "X";
    String p2 = "O";
    
    public Jogo() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	}catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException("Erro: " +e);
	}
        initComponents();
    }
    
    public void Player(){
        if(player1){
            player1 = false;
            player2 = true;
        }else{
            player2 = false;
            player1 = true;
        }
        
        PlayerWinner(p1);
        PlayerWinner(p2);
    }
    
    public void Reset(){
        player1 = true;
        player2 = false;
        Play1.setText("");
        Play2.setText("");
        Play3.setText("");
        Play4.setText("");
        Play5.setText("");
        Play6.setText("");
        Play7.setText("");
        Play8.setText("");
        Play9.setText("");
        p1win.setText("0");
        p2win.setText("0");
        p1loss.setText("0");
        p2loss.setText("0");
        tied.setText("0");
    }
    
    public void PlayerWinner(String p){
        //Verifica linha - Inicio
        if(Play1.getText().equals(p) && Play2.getText().equals(p) && Play3.getText().equals(p)){
            if(Play1.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        
        if(Play4.getText().equals(p) && Play5.getText().equals(p) && Play6.getText().equals(p)){
            if(Play4.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        
        if(Play7.getText().equals(p) && Play8.getText().equals(p) && Play9.getText().equals(p)){
            if(Play7.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        //Verifica linha - Fim
        
        //Verifica coluna - Inicio
        if(Play1.getText().equals(p) && Play4.getText().equals(p) && Play7.getText().equals(p)){
            if(Play1.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        
        if(Play2.getText().equals(p) && Play5.getText().equals(p) && Play8.getText().equals(p)){
            if(Play2.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        
        if(Play3.getText().equals(p) && Play6.getText().equals(p) && Play9.getText().equals(p)){
            if(Play3.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        //Verifica coluna - Fim
        
        //Verifica diagonal - Inicio
        if(Play1.getText().equals(p) && Play5.getText().equals(p) && Play9.getText().equals(p)){
            if(Play1.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        
        if(Play3.getText().equals(p) && Play5.getText().equals(p) && Play7.getText().equals(p)){
            if(Play3.getText().equals(p1)){
                Winner("Player 1");
            }else{
                Winner("Player 2");
            }
        }
        //Verifica diagonal - Fim
        
        //Verifica empate - Inicio
        if(!Play1.getText().equals("") && !Play2.getText().equals("") && !Play3.getText().equals("") && !Play4.getText().equals("") && !Play5.getText().equals("") && !Play6.getText().equals("") && !Play7.getText().equals("") && !Play8.getText().equals("") && !Play9.getText().equals("")){
            Winner("Tied");
        }
        //Verifica empate - Fim
    }
    
    public void Winner(String w){
        if(w.equals("Player 1")){
            JOptionPane.showMessageDialog(this, w + " Won");
            Reset();
            win1 = win1 + 1;
            loss2 = loss2 + 1;
            p1win.setText(String.valueOf(win1));
            p2loss.setText(String.valueOf(loss2));
            p2win.setText(String.valueOf(win2));
            p1loss.setText(String.valueOf(loss1));
            tied.setText(String.valueOf(gtied));
        }else if(w.equals("Player 2")){
            JOptionPane.showMessageDialog(this, w + " Won");
            Reset();
            win2 = win2 + 1;
            loss1 = loss1 + 1;
            p1win.setText(String.valueOf(win1));
            p2loss.setText(String.valueOf(loss2));
            p2win.setText(String.valueOf(win2));
            p1loss.setText(String.valueOf(loss1));
            tied.setText(String.valueOf(gtied));
        }else{
            JOptionPane.showMessageDialog(this, "We " + w);
            Reset();
            gtied = gtied + 1;
            p1win.setText(String.valueOf(win1));
            p2loss.setText(String.valueOf(loss2));
            p2win.setText(String.valueOf(win2));
            p1loss.setText(String.valueOf(loss1));
            tied.setText(String.valueOf(gtied));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Play2 = new javax.swing.JButton();
        Play1 = new javax.swing.JButton();
        Play4 = new javax.swing.JButton();
        Play3 = new javax.swing.JButton();
        Play5 = new javax.swing.JButton();
        Play6 = new javax.swing.JButton();
        Play7 = new javax.swing.JButton();
        Play8 = new javax.swing.JButton();
        Play9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBBegin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        p1win = new javax.swing.JLabel();
        p1loss = new javax.swing.JLabel();
        p2win = new javax.swing.JLabel();
        p2loss = new javax.swing.JLabel();
        tied = new javax.swing.JLabel();
        jBAbout = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCSymbol = new javax.swing.JComboBox<>();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Noughts and Crosses");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Play2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play2ActionPerformed(evt);
            }
        });

        Play1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play1ActionPerformed(evt);
            }
        });

        Play4.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play4ActionPerformed(evt);
            }
        });

        Play3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play3ActionPerformed(evt);
            }
        });

        Play5.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play5ActionPerformed(evt);
            }
        });

        Play6.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play6ActionPerformed(evt);
            }
        });

        Play7.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play7ActionPerformed(evt);
            }
        });

        Play8.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play8ActionPerformed(evt);
            }
        });

        Play9.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Play9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Play1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Play2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Play3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Play4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Play5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Play6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Play7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Play8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Play9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Play3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Play4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Play7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Player 1");

        jLabel2.setText("Wins:");

        jLabel3.setText("Loss:");

        jLabel4.setText("Player 2");

        jLabel5.setText("Wins:");

        jLabel6.setText("Loss:");

        jBBegin.setText("New Game");
        jBBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBeginActionPerformed(evt);
            }
        });

        jLabel7.setText("We Tied:");

        p1win.setText("0");

        p1loss.setText("0");

        p2win.setText("0");

        p2loss.setText("0");

        tied.setText("0");

        jBAbout.setText("About");
        jBAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAboutActionPerformed(evt);
            }
        });

        jLabel9.setText("Symbol for Player 1");

        jCSymbol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O" }));
        jCSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSymbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBBegin)
                .addGap(18, 18, 18)
                .addComponent(jBAbout)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1win))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1loss))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2win))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2loss)))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tied))
                    .addComponent(jLabel9)
                    .addComponent(jCSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(tied))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p1win))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(p1loss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(p2win))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(p2loss))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBegin)
                    .addComponent(jBAbout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBeginActionPerformed
        Reset();
    }//GEN-LAST:event_jBBeginActionPerformed

    private void Play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play1ActionPerformed
        if(player1){
            if(Play1.getText().equals("")){
                Play1.setText(p1);
                Play1.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play1.getText().equals("")){
                Play1.setText(p2);
                Play1.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play1ActionPerformed

    private void Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play2ActionPerformed
        if(player1){
            if(Play2.getText().equals("")){
                Play2.setText(p1);
                Play2.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play2.getText().equals("")){
                Play2.setText(p2);
                Play2.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play2ActionPerformed

    private void Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play3ActionPerformed
        if(player1){
            if(Play3.getText().equals("")){
                Play3.setText(p1);
                Play3.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play3.getText().equals("")){
                Play3.setText(p2);
                Play3.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play3ActionPerformed

    private void Play4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play4ActionPerformed
        if(player1){
            if(Play4.getText().equals("")){
                Play4.setText(p1);
                Play4.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play4.getText().equals("")){
                Play4.setText(p2);
                Play4.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play4ActionPerformed

    private void Play5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play5ActionPerformed
        if(player1){
            if(Play5.getText().equals("")){
                Play5.setText(p1);
                Play5.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play5.getText().equals("")){
                Play5.setText(p2);
                Play5.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play5ActionPerformed

    private void Play6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play6ActionPerformed
        if(player1){
            if(Play6.getText().equals("")){
                Play6.setText(p1);
                Play6.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play6.getText().equals("")){
                Play6.setText(p2);
                Play6.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play6ActionPerformed

    private void Play7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play7ActionPerformed
        if(player1){
            if(Play7.getText().equals("")){
                Play7.setText(p1);
                Play7.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play7.getText().equals("")){
                Play7.setText(p2);
                Play7.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play7ActionPerformed

    private void Play8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play8ActionPerformed
        if(player1){
            if(Play8.getText().equals("")){
                Play8.setText(p1);
                Play8.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play8.getText().equals("")){
                Play8.setText(p2);
                Play8.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play8ActionPerformed

    private void Play9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play9ActionPerformed
        if(player1){
            if(Play9.getText().equals("")){
                Play9.setText(p1);
                Play9.setForeground(Color.green);
                Player();
            }
        }else{
            if(Play9.getText().equals("")){
                Play9.setText(p2);
                Play9.setForeground(Color.red);
                Player();
            }
        }
    }//GEN-LAST:event_Play9ActionPerformed

    private void jBAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Developed By: Yussef Casseb, Senac Rio Claro - 2018");
    }//GEN-LAST:event_jBAboutActionPerformed

    private void jCSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSymbolActionPerformed
        if(jCSymbol.getSelectedItem().equals("X")){
            p1 = "X";
            p2 = "O";
        }else{
            p1 = "O";
            p2 = "X";
        }
    }//GEN-LAST:event_jCSymbolActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Play1;
    private javax.swing.JButton Play2;
    private javax.swing.JButton Play3;
    private javax.swing.JButton Play4;
    private javax.swing.JButton Play5;
    private javax.swing.JButton Play6;
    private javax.swing.JButton Play7;
    private javax.swing.JButton Play8;
    private javax.swing.JButton Play9;
    private javax.swing.JButton jBAbout;
    private javax.swing.JButton jBBegin;
    private javax.swing.JComboBox<String> jCSymbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel p1loss;
    private javax.swing.JLabel p1win;
    private javax.swing.JLabel p2loss;
    private javax.swing.JLabel p2win;
    private javax.swing.JLabel tied;
    // End of variables declaration//GEN-END:variables
}
