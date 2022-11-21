//Welcome interface

package Interfaces;

import java.awt.Color;



public class Welcome extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Welcome() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        imagesLogin = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        exitTextX = new javax.swing.JLabel();
        welcomeLoginLabel = new javax.swing.JLabel();
        signInButton = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        signUpButton = new javax.swing.JPanel();
        signUpLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setForeground(new java.awt.Color(0, 0, 0));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(895, 573));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        name.setForeground(new java.awt.Color(230, 230, 230));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("PARKING SON'S");
        backgroundPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 80));

        logoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoEdited.png"))); // NOI18N
        backgroundPanel.add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 240, 210));

        imagesLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/parking image edited_1.png"))); // NOI18N
        imagesLogin.setToolTipText("");
        backgroundPanel.add(imagesLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 580));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setPreferredSize(new java.awt.Dimension(35, 20));

        exitTextX.setFont(new java.awt.Font("agave Nerd Font", 1, 20)); // NOI18N
        exitTextX.setForeground(new java.awt.Color(0, 0, 0));
        exitTextX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTextX.setText("X");
        exitTextX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTextX.setPreferredSize(new java.awt.Dimension(35, 20));
        exitTextX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTextXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTextXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitTextXMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addComponent(exitTextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addComponent(exitTextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 880, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backgroundPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        welcomeLoginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        welcomeLoginLabel.setForeground(new java.awt.Color(51, 51, 51));
        welcomeLoginLabel.setText("¡BIENVENIDO!");
        backgroundPanel.add(welcomeLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        signInButton.setBackground(new java.awt.Color(46, 125, 50));
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        signInLabel.setBackground(new java.awt.Color(46, 125, 50));
        signInLabel.setFont(new java.awt.Font("agave Nerd Font", 1, 14)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 255, 255));
        signInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInLabel.setText("Inciar Sesión");
        signInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout signInButtonLayout = new javax.swing.GroupLayout(signInButton);
        signInButton.setLayout(signInButtonLayout);
        signInButtonLayout.setHorizontalGroup(
            signInButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signInLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signInButtonLayout.setVerticalGroup(
            signInButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signInLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        backgroundPanel.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 232, -1));

        signUpButton.setBackground(new java.awt.Color(46, 125, 50));
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setToolTipText("");
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        signUpLabel.setFont(new java.awt.Font("agave Nerd Font", 1, 14)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setText("Registrarse");
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout signUpButtonLayout = new javax.swing.GroupLayout(signUpButton);
        signUpButton.setLayout(signUpButtonLayout);
        signUpButtonLayout.setHorizontalGroup(
            signUpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signUpButtonLayout.setVerticalGroup(
            signUpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        backgroundPanel.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 232, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    private void exitTextXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextXMouseEntered
        exitButton.setBackground(new Color(254,45,45));
        exitTextX.setForeground(Color.white);
    }//GEN-LAST:event_exitTextXMouseEntered

    private void exitTextXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextXMouseExited
        exitButton.setBackground(Color.white);
        exitTextX.setForeground(Color.black);
    }//GEN-LAST:event_exitTextXMouseExited

    private void exitTextXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextXMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitTextXMousePressed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void signInLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseEntered
        signInButton.setBackground(new Color(0, 80, 5));
    }//GEN-LAST:event_signInLabelMouseEntered

    private void signInLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseExited
        signInButton.setBackground(new Color(46, 125, 50));
        
    }//GEN-LAST:event_signInLabelMouseExited

    private void signUpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseEntered
        signUpButton.setBackground(new Color(0, 80, 5));
    }//GEN-LAST:event_signUpLabelMouseEntered

    private void signUpLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseExited
        signUpButton.setBackground(new Color(0, 125, 50));

    }//GEN-LAST:event_signUpLabelMouseExited

    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        // TODO add your handling code here:
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signInLabelMouseClicked

    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        // TODO add your handling code here:
        SignUp signUp = new SignUp();
        signUp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitTextX;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel imagesLogin;
    private javax.swing.JLabel logoImage;
    private javax.swing.JLabel name;
    private javax.swing.JPanel signInButton;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JPanel signUpButton;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JLabel welcomeLoginLabel;
    // End of variables declaration//GEN-END:variables
}
