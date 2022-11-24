
package Interfaces;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaproject.parking.connectionDB;

public class SignUp extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    connectionDB connection;
    
    
    public SignUp() {
        initComponents();
        
        connection = new connectionDB("parking_son");
        connection.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        exitTextX = new javax.swing.JLabel();
        signUpButton = new javax.swing.JPanel();
        signUpLabel = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        inputPassSignUp = new rojerusan.RSPasswordTextPlaceHolder();
        passText = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        inputUserSignUp = new app.bolivia.swing.JCTextField();
        userText = new javax.swing.JLabel();
        signUpText = new javax.swing.JLabel();
        textSignIn = new javax.swing.JLabel();
        textWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(915, 580));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoEdited.png"))); // NOI18N
        logo.setText("jLabel2");
        backgroundPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 240, 210));

        name.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("PARKING SON'S");
        backgroundPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 80));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/parking image edited_1.png"))); // NOI18N
        backgroundPanel.add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 580));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 885, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backgroundPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        signUpButton.setBackground(new java.awt.Color(46, 125, 50));
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        signUpLabel.setBackground(new java.awt.Color(46, 125, 50));
        signUpLabel.setFont(new java.awt.Font("agave Nerd Font", 1, 14)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setText("REGISTRARSE");
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpLabelMousePressed(evt);
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

        backgroundPanel.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 232, -1));

        separator1.setBackground(new java.awt.Color(0, 0, 0));
        separator1.setForeground(new java.awt.Color(0, 0, 0));
        backgroundPanel.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 440, 10));

        inputPassSignUp.setBackground(new java.awt.Color(255, 255, 255));
        inputPassSignUp.setBorder(null);
        inputPassSignUp.setForeground(new java.awt.Color(0, 0, 0));
        inputPassSignUp.setToolTipText("");
        inputPassSignUp.setFont(new java.awt.Font("agave Nerd Font", 0, 12)); // NOI18N
        inputPassSignUp.setMinimumSize(new java.awt.Dimension(197, 32));
        inputPassSignUp.setPhColor(new java.awt.Color(102, 102, 102));
        inputPassSignUp.setPlaceholder("**********");
        inputPassSignUp.setPreferredSize(new java.awt.Dimension(197, 32));
        backgroundPanel.add(inputPassSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 440, 40));

        passText.setFont(new java.awt.Font("agave Nerd Font", 0, 14)); // NOI18N
        passText.setForeground(new java.awt.Color(0, 0, 0));
        passText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passText.setText("CONTRASEÑA");
        backgroundPanel.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        separator.setBackground(new java.awt.Color(0, 0, 0));
        separator.setForeground(new java.awt.Color(0, 0, 0));
        backgroundPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 440, 10));

        inputUserSignUp.setBackground(new java.awt.Color(255, 255, 255));
        inputUserSignUp.setBorder(null);
        inputUserSignUp.setForeground(new java.awt.Color(0, 0, 0));
        inputUserSignUp.setFont(new java.awt.Font("agave Nerd Font", 0, 12)); // NOI18N
        inputUserSignUp.setMinimumSize(new java.awt.Dimension(197, 32));
        inputUserSignUp.setPhColor(new java.awt.Color(102, 102, 102));
        inputUserSignUp.setPlaceholder("Ingrese su nombre de usuario");
        inputUserSignUp.setPreferredSize(new java.awt.Dimension(197, 32));
        backgroundPanel.add(inputUserSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 172, 440, 40));

        userText.setFont(new java.awt.Font("agave Nerd Font", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(0, 0, 0));
        userText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userText.setText("USUARIO");
        backgroundPanel.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        signUpText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signUpText.setForeground(new java.awt.Color(0, 0, 0));
        signUpText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpText.setText("REGISTRARSE");
        signUpText.setToolTipText("");
        backgroundPanel.add(signUpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        textSignIn.setFont(new java.awt.Font("agave Nerd Font", 0, 12)); // NOI18N
        textSignIn.setText("¿Ya tienes una cuenta?");
        textSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textSignInMouseExited(evt);
            }
        });
        backgroundPanel.add(textSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, -1));

        textWarning.setFont(new java.awt.Font("agave Nerd Font", 0, 12)); // NOI18N
        textWarning.setForeground(new java.awt.Color(255, 51, 51));
        backgroundPanel.add(textWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 440, 20));

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

    
    private void exitTextXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextXMouseEntered

        exitButton.setBackground(new Color(254, 45,45));
        exitTextX.setForeground(Color.white);
    }//GEN-LAST:event_exitTextXMouseEntered

    private void exitTextXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextXMouseExited
        exitButton.setBackground(Color.white);
        exitTextX.setForeground(Color.BLACK);
    }//GEN-LAST:event_exitTextXMouseExited

    private void exitTextXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextXMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitTextXMousePressed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    private void signUpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseEntered
        signUpButton.setBackground(new Color(0, 80, 5));
    }//GEN-LAST:event_signUpLabelMouseEntered

    private void signUpLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseExited
        signUpButton.setBackground(new Color(46, 125, 50));
    }//GEN-LAST:event_signUpLabelMouseExited

    private void signUpLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMousePressed
        String user = inputUserSignUp.getText();
        String pass = String.valueOf(inputPassSignUp.getPassword());
        String query = "insert into usuarios(usuario, contraseña) VALUES ('"+ user +"', '"+ pass +"')";
        String query2 = "select 1 from usuarios where usuario = ?;";

              
            
            if(user.isEmpty() || pass.isEmpty()){
                
                textWarning.setText("Por favor ingrese un nombre de usuario y contraseña.");
                textWarning.setForeground(Color.red);

                separator.setForeground(Color.red);
                separator1.setForeground(Color.red);
                separator.setBackground(Color.red);
                separator1.setBackground(Color.red);
                
            } else if(connection.ifExists(query2, user)){
                
                textWarning.setText("Este usuario ya se encuentra registrado");
                textWarning.setForeground(Color.red);

                separator.setForeground(Color.red);
                separator1.setForeground(Color.red);
                separator.setBackground(Color.red);
                separator1.setBackground(Color.red);
                        
                inputUserSignUp.setText("");
                inputPassSignUp.setText("");
                
            } else {
                
                try {
                    Statement st = connection.connect().createStatement();
                    st.executeUpdate(query);

                    textWarning.setText("Usuario registrado correctamente");
                    textWarning.setForeground(new Color(46, 125, 50));

                    separator.setForeground(new Color(46, 125, 50));
                    separator1.setForeground(new Color(46, 125, 50));
                    separator.setBackground(new Color(46, 125, 50));
                    separator1.setBackground(new Color(46, 125, 50));

                    if(textWarning.getText().equals("Usuario registrado correctamente")) {
                        ConfirmSignUp csignup = new ConfirmSignUp();
                        csignup.setVisible(true);

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    System.err.println("No se ha podido realizar la consulta a la base de datos.");
                }
            }
    }//GEN-LAST:event_signUpLabelMousePressed

    private void textSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSignInMouseEntered
        textSignIn.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_textSignInMouseEntered

    private void textSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSignInMouseExited
        textSignIn.setForeground(new Color(187,187, 187));
    }//GEN-LAST:event_textSignInMouseExited

    private void textSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSignInMouseClicked
        // TODO add your handling code here:
        SignIn signin = new SignIn();
        signin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_textSignInMouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitTextX;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel imageBackground;
    private rojerusan.RSPasswordTextPlaceHolder inputPassSignUp;
    private app.bolivia.swing.JCTextField inputUserSignUp;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel name;
    private javax.swing.JLabel passText;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JPanel signUpButton;
    public javax.swing.JLabel signUpLabel;
    private javax.swing.JLabel signUpText;
    private javax.swing.JLabel textSignIn;
    private javax.swing.JLabel textWarning;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}
