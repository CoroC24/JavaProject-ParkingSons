package Interfaces;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaproject.parking.connectionDB;

public class Home extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public static SimpleDateFormat sdfResult = new SimpleDateFormat("HH:mm:ss", Locale.US);
    public static SimpleDateFormat sdfResultMinutes = new SimpleDateFormat("m", Locale.US);
    
    connectionDB connection;

    
    public Home() {
        initComponents();
        
        connection = new connectionDB("parking_son");
        connection.connect();
        
        priceParkingText.setText("El precio a pagar es: $$$");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelBar = new javax.swing.JPanel();
        vehiclesButton = new javax.swing.JPanel();
        vehiclesButtonImg = new javax.swing.JLabel();
        vehiclesParkingButton = new javax.swing.JPanel();
        vehiclesParkingButtonImg = new javax.swing.JLabel();
        historyButton = new javax.swing.JPanel();
        historyButtonImg = new javax.swing.JLabel();
        homeButton = new javax.swing.JPanel();
        homeButtonImg = new javax.swing.JLabel();
        exitButtonPanelBar = new javax.swing.JPanel();
        exitButtonTextPanelBar = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        exitTextX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputPlateText = new javax.swing.JLabel();
        inputPlateHome = new app.bolivia.swing.JCTextField();
        separator = new javax.swing.JSeparator();
        inputDateExitHome = new app.bolivia.swing.JCTextField();
        inputDateExitText = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        priceParkingText = new javax.swing.JLabel();
        consultButton = new javax.swing.JPanel();
        consultLabel = new javax.swing.JLabel();
        textWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("home"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBar.setBackground(new java.awt.Color(46, 125, 50));

        vehiclesButton.setBackground(new java.awt.Color(46, 125, 50));
        vehiclesButton.setPreferredSize(new java.awt.Dimension(40, 40));

        vehiclesButtonImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehiclesButtonImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vehicleDashEdited.png"))); // NOI18N
        vehiclesButtonImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehiclesButtonImg.setPreferredSize(new java.awt.Dimension(38, 40));
        vehiclesButtonImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vehiclesButtonImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vehiclesButtonImgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vehiclesButtonImgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout vehiclesButtonLayout = new javax.swing.GroupLayout(vehiclesButton);
        vehiclesButton.setLayout(vehiclesButtonLayout);
        vehiclesButtonLayout.setHorizontalGroup(
            vehiclesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesButtonLayout.createSequentialGroup()
                .addComponent(vehiclesButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        vehiclesButtonLayout.setVerticalGroup(
            vehiclesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesButtonLayout.createSequentialGroup()
                .addComponent(vehiclesButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        vehiclesParkingButton.setBackground(new java.awt.Color(46, 125, 50));
        vehiclesParkingButton.setPreferredSize(new java.awt.Dimension(40, 40));

        vehiclesParkingButtonImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehiclesParkingButtonImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vehiclesHistoryDash.png"))); // NOI18N
        vehiclesParkingButtonImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehiclesParkingButtonImg.setPreferredSize(new java.awt.Dimension(38, 40));
        vehiclesParkingButtonImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vehiclesParkingButtonImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vehiclesParkingButtonImgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vehiclesParkingButtonImgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout vehiclesParkingButtonLayout = new javax.swing.GroupLayout(vehiclesParkingButton);
        vehiclesParkingButton.setLayout(vehiclesParkingButtonLayout);
        vehiclesParkingButtonLayout.setHorizontalGroup(
            vehiclesParkingButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesParkingButtonLayout.createSequentialGroup()
                .addComponent(vehiclesParkingButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        vehiclesParkingButtonLayout.setVerticalGroup(
            vehiclesParkingButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesParkingButtonLayout.createSequentialGroup()
                .addComponent(vehiclesParkingButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        historyButton.setBackground(new java.awt.Color(46, 125, 50));
        historyButton.setPreferredSize(new java.awt.Dimension(40, 40));

        historyButtonImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historyButtonImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/historyDash.png"))); // NOI18N
        historyButtonImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historyButtonImg.setPreferredSize(new java.awt.Dimension(38, 40));
        historyButtonImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historyButtonImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historyButtonImgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                historyButtonImgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout historyButtonLayout = new javax.swing.GroupLayout(historyButton);
        historyButton.setLayout(historyButtonLayout);
        historyButtonLayout.setHorizontalGroup(
            historyButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyButtonLayout.createSequentialGroup()
                .addComponent(historyButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        historyButtonLayout.setVerticalGroup(
            historyButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyButtonLayout.createSequentialGroup()
                .addComponent(historyButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        homeButton.setBackground(new java.awt.Color(46, 125, 50));
        homeButton.setPreferredSize(new java.awt.Dimension(40, 40));

        homeButtonImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeButtonImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/homeDashEdited.png"))); // NOI18N
        homeButtonImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButtonImg.setPreferredSize(new java.awt.Dimension(38, 40));
        homeButtonImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonImgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeButtonImgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addComponent(homeButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addComponent(homeButtonImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        exitButtonPanelBar.setBackground(new java.awt.Color(46, 125, 50));
        exitButtonPanelBar.setPreferredSize(new java.awt.Dimension(40, 40));

        exitButtonTextPanelBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButtonTextPanelBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitEdited.png"))); // NOI18N
        exitButtonTextPanelBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButtonTextPanelBar.setMinimumSize(new java.awt.Dimension(40, 40));
        exitButtonTextPanelBar.setPreferredSize(new java.awt.Dimension(38, 40));
        exitButtonTextPanelBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonTextPanelBarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonTextPanelBarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitButtonTextPanelBarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitButtonPanelBarLayout = new javax.swing.GroupLayout(exitButtonPanelBar);
        exitButtonPanelBar.setLayout(exitButtonPanelBarLayout);
        exitButtonPanelBarLayout.setHorizontalGroup(
            exitButtonPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonPanelBarLayout.createSequentialGroup()
                .addComponent(exitButtonTextPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        exitButtonPanelBarLayout.setVerticalGroup(
            exitButtonPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonPanelBarLayout.createSequentialGroup()
                .addComponent(exitButtonTextPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBarLayout = new javax.swing.GroupLayout(panelBar);
        panelBar.setLayout(panelBarLayout);
        panelBarLayout.setHorizontalGroup(
            panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehiclesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelBarLayout.createSequentialGroup()
                .addGroup(panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehiclesParkingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButtonPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBarLayout.setVerticalGroup(
            panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vehiclesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vehiclesParkingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButtonPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        background.add(panelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 580));

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
                .addContainerGap(879, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("agave Nerd Font", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¡BIENVENIDO!");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 160, 30));

        jLabel2.setFont(new java.awt.Font("agave Nerd Font", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Aquí puedes consultar el valor que debe pagar por el vehículo estacionado");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 520, -1));

        inputPlateText.setFont(new java.awt.Font("agave Nerd Font", 0, 16)); // NOI18N
        inputPlateText.setForeground(new java.awt.Color(51, 51, 51));
        inputPlateText.setText("Ingrese la placa del vehículo");
        inputPlateText.setToolTipText("");
        inputPlateText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.add(inputPlateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 240, 40));

        inputPlateHome.setBackground(new java.awt.Color(255, 255, 255));
        inputPlateHome.setBorder(null);
        inputPlateHome.setForeground(new java.awt.Color(0, 0, 0));
        inputPlateHome.setFont(new java.awt.Font("agave Nerd Font", 0, 12)); // NOI18N
        inputPlateHome.setPlaceholder("CKX765");
        background.add(inputPlateHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 420, 30));

        separator.setBackground(new java.awt.Color(51, 51, 51));
        separator.setForeground(new java.awt.Color(51, 51, 51));
        separator.setPreferredSize(new java.awt.Dimension(0, 2));
        background.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 420, -1));

        inputDateExitHome.setBackground(new java.awt.Color(255, 255, 255));
        inputDateExitHome.setBorder(null);
        inputDateExitHome.setForeground(new java.awt.Color(0, 0, 0));
        inputDateExitHome.setFont(new java.awt.Font("agave Nerd Font", 0, 12)); // NOI18N
        inputDateExitHome.setPlaceholder("09:32");
        background.add(inputDateExitHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 420, 30));

        inputDateExitText.setFont(new java.awt.Font("agave Nerd Font", 0, 16)); // NOI18N
        inputDateExitText.setForeground(new java.awt.Color(51, 51, 51));
        inputDateExitText.setText("Ingrese la hora de salida");
        inputDateExitText.setToolTipText("");
        inputDateExitText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.add(inputDateExitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 240, 40));

        separator1.setBackground(new java.awt.Color(51, 51, 51));
        separator1.setForeground(new java.awt.Color(51, 51, 51));
        separator1.setPreferredSize(new java.awt.Dimension(0, 2));
        background.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 420, -1));

        priceParkingText.setFont(new java.awt.Font("agave Nerd Font", 0, 16)); // NOI18N
        priceParkingText.setForeground(new java.awt.Color(51, 51, 51));
        priceParkingText.setText("El precio a pagar es: $$$");
        background.add(priceParkingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        consultButton.setBackground(new java.awt.Color(46, 125, 50));
        consultButton.setForeground(new java.awt.Color(255, 255, 255));
        consultButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        consultLabel.setBackground(new java.awt.Color(46, 125, 50));
        consultLabel.setFont(new java.awt.Font("agave Nerd Font", 1, 14)); // NOI18N
        consultLabel.setForeground(new java.awt.Color(255, 255, 255));
        consultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consultLabel.setText("CONSULTAR");
        consultLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consultLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout consultButtonLayout = new javax.swing.GroupLayout(consultButton);
        consultButton.setLayout(consultButtonLayout);
        consultButtonLayout.setHorizontalGroup(
            consultButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        consultButtonLayout.setVerticalGroup(
            consultButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        background.add(consultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 232, -1));

        textWarning.setBackground(new java.awt.Color(255, 255, 255));
        textWarning.setFont(new java.awt.Font("agave Nerd Font", 0, 14)); // NOI18N
        textWarning.setForeground(new java.awt.Color(255, 0, 0));
        textWarning.setToolTipText("");
        background.add(textWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 560, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonImgMouseEntered
        homeButton.setBackground(new Color(0, 80, 5));
        homeButtonImg.setToolTipText("Inicio");
    }//GEN-LAST:event_homeButtonImgMouseEntered

    private void homeButtonImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonImgMouseExited
        homeButton.setBackground(new Color(46, 125, 50));
    }//GEN-LAST:event_homeButtonImgMouseExited

    private void vehiclesButtonImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesButtonImgMouseEntered
        vehiclesButton.setBackground(new Color(0, 80, 5));
        vehiclesButtonImg.setToolTipText("Registrar Vehículo");
    }//GEN-LAST:event_vehiclesButtonImgMouseEntered

    private void vehiclesButtonImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesButtonImgMouseExited
        vehiclesButton.setBackground(new Color(46, 125, 50));
    }//GEN-LAST:event_vehiclesButtonImgMouseExited

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

    private void vehiclesParkingButtonImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesParkingButtonImgMouseEntered
        vehiclesParkingButton.setBackground(new Color(0, 80, 5));
        vehiclesParkingButtonImg.setToolTipText("Vehículos Estacionados Actualmente");
    }//GEN-LAST:event_vehiclesParkingButtonImgMouseEntered

    private void vehiclesParkingButtonImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesParkingButtonImgMouseExited
        vehiclesParkingButton.setBackground(new Color(46, 125, 50));
    }//GEN-LAST:event_vehiclesParkingButtonImgMouseExited

    private void historyButtonImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyButtonImgMouseEntered
        historyButton.setBackground(new Color(0, 80, 5));
        historyButtonImg.setToolTipText("Historial de Vehículos");
    }//GEN-LAST:event_historyButtonImgMouseEntered

    private void historyButtonImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyButtonImgMouseExited
        historyButton.setBackground(new Color(46, 125, 50));
    }//GEN-LAST:event_historyButtonImgMouseExited

    private void homeButtonImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonImgMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_homeButtonImgMousePressed

    private void vehiclesButtonImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesButtonImgMousePressed
        vehiclesEntering vehiclesE = new vehiclesEntering();
        vehiclesE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vehiclesButtonImgMousePressed

    private void vehiclesParkingButtonImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesParkingButtonImgMousePressed
        vehiclesInParking vehiclesP = new vehiclesInParking();
        vehiclesP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vehiclesParkingButtonImgMousePressed

    private void historyButtonImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyButtonImgMousePressed
        history history = new history();
        history.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_historyButtonImgMousePressed

    private void exitButtonTextPanelBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonTextPanelBarMousePressed
        
        ConfirmExit confirmE = new ConfirmExit();
        confirmE.setVisible(true);
    }//GEN-LAST:event_exitButtonTextPanelBarMousePressed

    private void exitButtonTextPanelBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonTextPanelBarMouseEntered
        exitButtonPanelBar.setBackground(new Color(0, 80, 5));
        exitButtonTextPanelBar.setToolTipText("Salir");
    }//GEN-LAST:event_exitButtonTextPanelBarMouseEntered

    private void exitButtonTextPanelBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonTextPanelBarMouseExited
        exitButtonPanelBar.setBackground(new Color(46, 125, 50));
    }//GEN-LAST:event_exitButtonTextPanelBarMouseExited

    private void consultLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultLabelMouseEntered
        consultButton.setBackground(new Color(0, 80, 5));
    }//GEN-LAST:event_consultLabelMouseEntered

    private void consultLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultLabelMouseExited
        consultButton.setBackground(new Color(46, 125, 50));
    }//GEN-LAST:event_consultLabelMouseExited

    private void consultLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultLabelMousePressed
        String plate = inputPlateHome.getText();
        String dateE = inputDateExitHome.getText();
        
        int parkingPrice = 0;
        
        String query = "select 1 from vehiculosentrando where placa = ?;";
        String query2 = "UPDATE diferencia_horas SET horaSalida = '"+ dateE +"' WHERE placa = '"+ plate +"'";
        String query3 = "select tipoVehiculo, horaEntrada, horaSalida from diferencia_horas where placa = '"+ plate +"'";
        String query4 = "DELETE from vehiculosentrando WHERE placa = '"+ plate +"'";
        
        if(plate.isEmpty() || dateE.isEmpty()){
            
            textWarning.setText("Por favor ingrese la placa y la hora de salida");
            textWarning.setForeground(Color.red);

            separator.setForeground(Color.red);
            separator1.setForeground(Color.red);
            separator.setBackground(Color.red);
            separator1.setBackground(Color.red);
            
        } else if(connection.ifExists(query, plate)) {
            
            try {
                Statement st = connection.connect().createStatement();
                st.executeUpdate(query2);
                
                Statement st2 = connection.connect().createStatement();
                ResultSet rs = st2.executeQuery(query3);
                
                if (rs.next()) {
                    String veh = rs.getString(1);
                    String timeEnter = rs.getString(2);
                    String timeExit =  rs.getString(3);
                    
                    System.out.println(veh);
                    
                    try {
                        
                        Date difference = connection.getDifferenceBetweenDates(sdfResult.parse(timeEnter), sdfResult.parse(timeExit));
                        
                        String timeResult = sdfResult.format(difference);
                        
                        
                        System.out.println(timeResult);
                        
                        String minutes = sdfResultMinutes.format(difference);
                        
                        System.out.println(minutes);

                        
                        int minutesInParking = Integer.parseInt(minutes);
                        
                        
                        if(veh == "Moto") {
                                                    
                            if(minutesInParking <= 30) {
                                parkingPrice = 500;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else if(minutesInParking > 30 && minutesInParking <= 60) {
                                parkingPrice = 1000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else if(minutesInParking > 60  && minutesInParking <= 120) {
                                parkingPrice = 2000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else {
                                parkingPrice = 3000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                            }
                            
                        } else if(veh == "Carro Particular") {
                            
                            if(minutesInParking <= 30) {
                                parkingPrice = 1000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else if(minutesInParking > 30 && minutesInParking <= 60) {
                                parkingPrice = 2000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else if(minutesInParking > 60  && minutesInParking <= 120) {
                                parkingPrice = 3000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else {
                                parkingPrice = 5000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                            }
                            
                        } else {
                            
                            if(minutesInParking <= 30) {
                                parkingPrice = 1500;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else if(minutesInParking > 30 && minutesInParking <= 60) {
                                parkingPrice = 2500;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else if(minutesInParking > 60  && minutesInParking <= 120) {
                                parkingPrice = 4000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                                
                            } else {
                                parkingPrice = 6000;
                                priceParkingText.setText("El precio a pagar es: "+ parkingPrice +"$");
                            }
                        }
                        
                        
                    } catch (ParseException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
                }
                
            } catch(SQLException ex) {
                Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("No se ha podido realizar la consulta a la base de datos.");
            }
        }


        
    }//GEN-LAST:event_consultLabelMousePressed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel consultButton;
    public javax.swing.JLabel consultLabel;
    private javax.swing.JPanel exitButton;
    private javax.swing.JPanel exitButtonPanelBar;
    private javax.swing.JLabel exitButtonTextPanelBar;
    private javax.swing.JLabel exitTextX;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel historyButton;
    private javax.swing.JLabel historyButtonImg;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeButtonImg;
    public app.bolivia.swing.JCTextField inputDateExitHome;
    private javax.swing.JLabel inputDateExitText;
    public app.bolivia.swing.JCTextField inputPlateHome;
    private javax.swing.JLabel inputPlateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelBar;
    private javax.swing.JLabel priceParkingText;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JLabel textWarning;
    private javax.swing.JPanel vehiclesButton;
    private javax.swing.JLabel vehiclesButtonImg;
    private javax.swing.JPanel vehiclesParkingButton;
    private javax.swing.JLabel vehiclesParkingButtonImg;
    // End of variables declaration//GEN-END:variables
}
