/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztm_app;

import javax.swing.JOptionPane;

/**
 *
 * @author micha
 */
public class FormularzWynagrodzenia extends javax.swing.JFrame {
    
    private adminWindow adminFormular; 
    private Boolean isToAdd;
    
    public FormularzWynagrodzenia() {
        initComponents();
        this.setLocationRelativeTo(adminFormular);
    }

    public FormularzWynagrodzenia(Integer ID, adminWindow admin, Boolean isToAdd) {
        initComponents();
        this.setLocationRelativeTo(adminFormular);
        this.adminFormular = admin;
        this.isToAdd = isToAdd;
        nrWynagrodzeniaLabel.setText(ID.toString());
    }
    
    public FormularzWynagrodzenia(Wynagrodzenia wyn, adminWindow admin, Boolean isToAdd) {
        initComponents();
        this.setLocationRelativeTo(adminFormular);
        this.adminFormular = admin;
        this.isToAdd = isToAdd;
        nrWynagrodzeniaLabel.setText(wyn.getNrPracownika().toString());
        kwotaPodstawowaLabel.setText(wyn.getKwotaPodstawowa().toString());
        nrPracownikaLabel.setText(wyn.getNrPracownika().toString());
        premiaLabel.setText(wyn.getPremia().toString());
        dataWynagrodzeniaLabel.setText(wyn.getDataWynagrodzenia());
    }
    /**
     * Creates new form FormularzWynagrodzenia
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nrWynagrodzeniaLabel = new javax.swing.JTextField();
        kwotaPodstawowaLabel = new javax.swing.JTextField();
        premiaLabel = new javax.swing.JTextField();
        dataWynagrodzeniaLabel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nrPracownikaLabel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        commitButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        infoLabel.setText("Dodawanie/Modyfikacja rekordu w tabeli wynagrodzeń");

        jLabel2.setText("Nr wynagrodzenia");

        jLabel3.setText("Kwota podstawowa");

        jLabel4.setText("Premia");

        jLabel5.setText("Data wynagrodzenia");

        nrWynagrodzeniaLabel.setEnabled(false);
        nrWynagrodzeniaLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrWynagrodzeniaLabelActionPerformed(evt);
            }
        });

        dataWynagrodzeniaLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataWynagrodzeniaLabelActionPerformed(evt);
            }
        });

        jLabel1.setText("Nr pracownika");

        jLabel6.setForeground(new java.awt.Color(255, 34, 34));
        jLabel6.setText("*");

        jLabel7.setForeground(new java.awt.Color(255, 34, 34));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(255, 34, 34));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 34, 34));
        jLabel9.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nrWynagrodzeniaLabel)
                    .addComponent(premiaLabel)
                    .addComponent(dataWynagrodzeniaLabel)
                    .addComponent(kwotaPodstawowaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(nrPracownikaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nrWynagrodzeniaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kwotaPodstawowaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premiaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataWynagrodzeniaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nrPracownikaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        commitButton.setText("Commit");
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 34, 34));
        jLabel10.setText("* pole obowiązkowe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(infoLabel)
                            .addGap(45, 45, 45)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(commitButton)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commitButton)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nrWynagrodzeniaLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrWynagrodzeniaLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrWynagrodzeniaLabelActionPerformed

    private void dataWynagrodzeniaLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataWynagrodzeniaLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataWynagrodzeniaLabelActionPerformed

    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed
        Wynagrodzenia wyn = new Wynagrodzenia();
        
        if (nrWynagrodzeniaLabel.getText().trim().isEmpty() || kwotaPodstawowaLabel.getText().trim().isEmpty() || dataWynagrodzeniaLabel.getText().trim().isEmpty() || nrPracownikaLabel.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Obowiązkowe pola nie zostały wypełnione","Błąd",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (premiaLabel.getText().trim().isEmpty()) wyn.setPremia(new Float(0));
        
        if (Float.parseFloat(premiaLabel.getText().trim()) < 0 || Float.parseFloat(kwotaPodstawowaLabel.getText().trim()) < 0) {
            JOptionPane.showMessageDialog(this,"Kwota nie może być ujemna","Błąd",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        wyn.setNrWynagrodzenia(Integer.parseInt(nrWynagrodzeniaLabel.getText().trim()));
        wyn.setKwotaPodstawowa(Float.parseFloat(kwotaPodstawowaLabel.getText().trim()));
        wyn.setPremia(Float.parseFloat(premiaLabel.getText().trim()));
        wyn.setDataWynagrodzenia(dataWynagrodzeniaLabel.getText().trim());
        wyn.setNrPracownika(Integer.parseInt(nrPracownikaLabel.getText().trim()));
        
           
    }//GEN-LAST:event_commitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton commitButton;
    private javax.swing.JTextField dataWynagrodzeniaLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kwotaPodstawowaLabel;
    private javax.swing.JTextField nrPracownikaLabel;
    private javax.swing.JTextField nrWynagrodzeniaLabel;
    private javax.swing.JTextField premiaLabel;
    // End of variables declaration//GEN-END:variables
}
