package com.conversor;

import funciones.Conversiones;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.JSONParser;
import netscape.javascript.JSObject;
import org.json.JSONObject;


        


public class Conversor extends javax.swing.JFrame {
    
    Conversiones convertidor = new Conversiones();
    Object typeObjectConverter = "DOP a USD";
            
    int xMouse, yMouse; 
           
    public Conversor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        imgBanner = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        bgBtnExit = new javax.swing.JPanel();
        btnTextExit = new javax.swing.JLabel();
        panelFields = new javax.swing.JPanel();
        titleApp = new javax.swing.JLabel();
        titleFieldCurrency = new javax.swing.JLabel();
        optionConvertions = new javax.swing.JComboBox<>();
        titleTypeConvertion = new javax.swing.JLabel();
        currencyField = new javax.swing.JTextField();
        bgBtn = new javax.swing.JPanel();
        btnText = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/banner.jpg"))); // NOI18N
        bg.add(imgBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 390, 600));

        header.setBackground(new java.awt.Color(69, 169, 225));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        bgBtnExit.setBackground(new java.awt.Color(255, 255, 255));
        bgBtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgBtnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgBtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bgBtnExitMouseExited(evt);
            }
        });

        btnTextExit.setBackground(new java.awt.Color(70, 73, 75));
        btnTextExit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnTextExit.setForeground(new java.awt.Color(70, 73, 75));
        btnTextExit.setText("X");
        btnTextExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTextExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTextExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgBtnExitLayout = new javax.swing.GroupLayout(bgBtnExit);
        bgBtnExit.setLayout(bgBtnExitLayout);
        bgBtnExitLayout.setHorizontalGroup(
            bgBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBtnExitLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnTextExit)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        bgBtnExitLayout.setVerticalGroup(
            bgBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgBtnExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTextExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(bgBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 850, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(bgBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        panelFields.setBackground(new java.awt.Color(69, 169, 225));
        panelFields.setForeground(new java.awt.Color(255, 255, 255));

        titleApp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleApp.setForeground(new java.awt.Color(255, 255, 255));
        titleApp.setText("Conversor De Monedas");

        titleFieldCurrency.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleFieldCurrency.setForeground(new java.awt.Color(255, 255, 255));

        optionConvertions.setBackground(new java.awt.Color(255, 255, 255));
        optionConvertions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        optionConvertions.setForeground(new java.awt.Color(70, 73, 75));
        optionConvertions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOP a USD", "DOP a Euro", "DOP a COP", "DOP a MXN", "DOP a BTC", "USD a DOP", "Euro a DOP", "COP a DOP", "MXN a DOP", "BTC a DOP", "Fahrenheit a Celsius", "Celsius a Fahrenheit" }));
        optionConvertions.setBorder(null);
        optionConvertions.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                optionConvertionsInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        optionConvertions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionConvertionsActionPerformed(evt);
            }
        });

        titleTypeConvertion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleTypeConvertion.setForeground(new java.awt.Color(255, 255, 255));
        titleTypeConvertion.setText("Tipo de conversion");

        currencyField.setBackground(new java.awt.Color(69, 169, 225));
        currencyField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        currencyField.setForeground(new java.awt.Color(255, 255, 255));
        currencyField.setText("Ingresar cantidad a convertir");
        currencyField.setToolTipText("");
        currencyField.setBorder(null);
        currencyField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                currencyFieldFocusLost(evt);
            }
        });
        currencyField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                currencyFieldMousePressed(evt);
            }
        });
        currencyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyFieldActionPerformed(evt);
            }
        });

        bgBtn.setBackground(new java.awt.Color(70, 73, 75));
        bgBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bgBtnMouseExited(evt);
            }
        });

        btnText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnText.setForeground(new java.awt.Color(255, 255, 255));
        btnText.setText("Convertir");

        javax.swing.GroupLayout bgBtnLayout = new javax.swing.GroupLayout(bgBtn);
        bgBtn.setLayout(bgBtnLayout);
        bgBtnLayout.setHorizontalGroup(
            bgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgBtnLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(btnText)
                .addGap(72, 72, 72))
        );
        bgBtnLayout.setVerticalGroup(
            bgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBtnLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnText)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        separador.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelFieldsLayout = new javax.swing.GroupLayout(panelFields);
        panelFields.setLayout(panelFieldsLayout);
        panelFieldsLayout.setHorizontalGroup(
            panelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFieldsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFieldsLayout.createSequentialGroup()
                        .addGroup(panelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionConvertions, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleApp, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGap(106, 106, 106))
            .addGroup(panelFieldsLayout.createSequentialGroup()
                .addGroup(panelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFieldsLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(bgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFieldsLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(titleTypeConvertion))
                    .addGroup(panelFieldsLayout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(titleFieldCurrency)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelFieldsLayout.setVerticalGroup(
            panelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFieldsLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(titleApp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(panelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFieldsLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(titleFieldCurrency))
                    .addGroup(panelFieldsLayout.createSequentialGroup()
                        .addComponent(titleTypeConvertion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionConvertions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addComponent(bgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        bg.add(panelFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currencyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currencyFieldActionPerformed

    private void optionConvertionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionConvertionsActionPerformed
        // TODdd your handling code here:
        Object typeConverter = optionConvertions.getSelectedItem();
        
        System.out.println(typeConverter);
        
        
        if (typeConverter == "Fahrenheit a Celsius" || typeConverter == "Celsius a Fahrenheit") {
            titleApp.setText("");
            titleApp.setText("Conversor De Temperatura");
            panelFields.setBackground(new Color(4,217,57));
            header.setBackground(new Color(4,217,57));
            currencyField.setBackground(new Color(4,217,57));
            
            imgBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/banner-temperatura.jpg")));
        } else {
            titleApp.setText("");
            titleApp.setText("Conversor De Monedas");
            panelFields.setBackground(new Color(69,169,225));
            header.setBackground(new Color(69,169,225));
            currencyField.setBackground(new Color(69,169,225));
            
            imgBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/banner.jpg")));
        }
        
        
        typeObjectConverter = typeConverter;
    }//GEN-LAST:event_optionConvertionsActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);    
    }//GEN-LAST:event_headerMouseDragged

    private void bgBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgBtnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bgBtnExitMouseClicked

    private void bgBtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgBtnExitMouseEntered
        // TODO add your handling code here:
        btnTextExit.setForeground(Color.white);
        bgBtnExit.setBackground(Color.red);
    }//GEN-LAST:event_bgBtnExitMouseEntered

    private void bgBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgBtnExitMouseExited
        // TODO add your handling code here:
        btnTextExit.setForeground(new Color(70,73,75));
        bgBtnExit.setBackground(Color.white);
    }//GEN-LAST:event_bgBtnExitMouseExited

    private void bgBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgBtnMouseEntered
        // TODO add your handling code here:
        
        bgBtn.setBackground(new Color(90,93,95));
    }//GEN-LAST:event_bgBtnMouseEntered

    private void bgBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgBtnMouseExited
        // TODO add your handling code here:
        bgBtn.setBackground(new Color(70,73,75));
    }//GEN-LAST:event_bgBtnMouseExited

    private void currencyFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currencyFieldMousePressed
        // TODO add your handling code here:
        
        
        if (currencyField.getText().equals("Ingresar cantidad a convertir")) {
            currencyField.setText("");
            currencyField.setForeground(new Color(70,73,75));   
        }
    }//GEN-LAST:event_currencyFieldMousePressed

    private void bgBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgBtnMouseClicked
        try {
            String message = null;
            String messageError = "Ingresar una cantidad valida a convertir (Solo numeros)";


            System.out.println(typeObjectConverter);
            System.out.println(currencyField.getText());
            System.out.println(!currencyField.getText().equals("Ingresar cantidad a convertir") && currencyField.getText().length() >= 1 && currencyField.getText().matches("[+-]?\\d*(\\.\\d+)?")); 
            boolean isValid = !currencyField.getText().equals("Ingresar cantidad a convertir") && currencyField.getText().length() >= 1 && currencyField.getText().matches("[+-]?\\d*(\\.\\d+)?");

       
            if (isValid) {
                if (typeObjectConverter == "DOP a USD") {
                    Object data = convertidor.pesoADolar(currencyField.getText());
                    message = "El cambio de DOP a USD es: " + Math.ceil((double) data) + "USD";
                }

                if (typeObjectConverter == "DOP a Euro") {
                    Object data = convertidor.pesoAEuro(currencyField.getText());
                    message = "El cambio de DOP a Euro es: " + Math.ceil((double) data) + "EUR";
                }


                if (typeObjectConverter == "DOP a COP") {
                    Object data = convertidor.pesoAColombiano(currencyField.getText());
                    message = "El cambio de DOP a COP es: " + Math.ceil((double) data) + "COP";
                }

                if (typeObjectConverter == "DOP a MXN") {
                    Object data = convertidor.pesoAMexicano(currencyField.getText());
                    message = "El cambio de DOP a MXN es: " + Math.ceil((double) data) + "MXN";
                }
                
                if (typeObjectConverter == "DOP a BTC") {
                    Object data = convertidor.PesoABitcoin(currencyField.getText());
                    message = "El cambio de DOP a BTC es: " + Math.ceil((double) data) + "BTC";
                }
                
                //temperaturas
                if (typeObjectConverter == "Fahrenheit a Celsius") {
                    Object data = convertidor.fahrenheitACelsius(Double.parseDouble(currencyField.getText()));
                    message = "El cambio de Fahrenheit a Celsius es: " + Math.ceil((double) data) + "°C";
                }
                
                if (typeObjectConverter == "Celsius a Fahrenheit") {
                    Object data = convertidor.celsiusAFahrenheit(Double.parseDouble(currencyField.getText()));
                    message = "El cambio de Celsius a Fahrenheit es: " + Math.ceil((double) data) + "°F";
                }
                
                
                //conversiones invertidos                
                if (typeObjectConverter == "BTC a DOP") {
                    Object data = convertidor.bitcoinAPeso(currencyField.getText());
                    message = "El cambio de DOP a MXN es: " + Math.ceil((double) data) + "DOP";
                }
                
                if (typeObjectConverter == "USD a DOP") {
                    Object data = convertidor.dolarAPeso(currencyField.getText());
                    message = "El cambio de USD a DOP es: " + Math.ceil((double) data) + "DOP";
                }
                if (typeObjectConverter == "USD a DOP") {
                    Object data = convertidor.dolarAPeso(currencyField.getText());
                    message = "El cambio de USD a DOP es: " + Math.ceil((double) data) + "DOP";
                }
                
                if (typeObjectConverter == "COP a DOP") {
                    Object data = convertidor.colombianoAPeso(currencyField.getText());
                    message = "El cambio de COP a DOP es: " + Math.ceil((double) data) + "DOP";
                }
                if (typeObjectConverter == "MXN a DOP") {
                    Object data = convertidor.mexicanoAPeso(currencyField.getText());
                    message = "El cambio de MXN a DOP es: " + Math.ceil((double) data) + "DOP";
                }
                
                //Aqui se agregara el valor de la conversion
                javax.swing.JOptionPane.showMessageDialog(null, message , "Conversor", JOptionPane.PLAIN_MESSAGE);
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, messageError, "Error al convertir", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(Conversor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bgBtnMouseClicked

    private void btnTextExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnTextExitMouseClicked

    private void btnTextExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextExitMouseEntered
        // TODO add your handling code here:
        btnTextExit.setForeground(Color.white);
        bgBtnExit.setBackground(Color.red);
    }//GEN-LAST:event_btnTextExitMouseEntered

    private void btnTextExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextExitMouseExited
        // TODO add your handling code here:
        btnTextExit.setForeground(new Color(70,73,75));
        bgBtnExit.setBackground(Color.white);
    }//GEN-LAST:event_btnTextExitMouseExited

    private void currencyFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currencyFieldFocusLost
        // TODO add your handling code here:
        
        if (currencyField.getText().isEmpty()) {
            currencyField.setText("Ingresar cantidad a convertir");
            currencyField.setForeground(new Color(255,255,255));
        }
        
    }//GEN-LAST:event_currencyFieldFocusLost

    private void optionConvertionsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_optionConvertionsInputMethodTextChanged
        // TODO add your handling code here
    }//GEN-LAST:event_optionConvertionsInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgBtn;
    private javax.swing.JPanel bgBtnExit;
    private javax.swing.JLabel btnText;
    private javax.swing.JLabel btnTextExit;
    private javax.swing.JTextField currencyField;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imgBanner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> optionConvertions;
    private javax.swing.JPanel panelFields;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel titleApp;
    private javax.swing.JLabel titleFieldCurrency;
    private javax.swing.JLabel titleTypeConvertion;
    // End of variables declaration//GEN-END:variables

    private Color RGBColor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
