package enigmamachine;

import java.awt.Frame;

public class EnigmaGUI extends Frame
{
    public EnigmaGUI() 
    {
        initComponents();
    }

    //code that creates the GUI
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabelEnterText = new javax.swing.JLabel();
        tfInput = new javax.swing.JTextField();
        jlabelOutput = new javax.swing.JLabel();
        tfOutput = new javax.swing.JTextField();
        bEncryptCaesar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bDecryptCaesar = new javax.swing.JButton();
        bEncryptSubstitution = new javax.swing.JButton();
        bDecryptSubstitution = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bEncryptRotating = new javax.swing.JButton();
        bDecryptRotating = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bDecodeUnknown = new javax.swing.JButton();

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlabelEnterText.setText("Enter the text to be encrypted/decrypted:");

        tfInput.setText("jTextField1");

        jlabelOutput.setText("Output:");

        tfOutput.setText("jTextField2");

        bEncryptCaesar.setText("Encrypt Text");
        bEncryptCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEncryptCaesarActionPerformed(evt);
            }
        });

        jLabel3.setText("Caesar's Cipher:");

        bDecryptCaesar.setText("Decrypt Text");
        bDecryptCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDecryptCaesarActionPerformed(evt);
            }
        });

        bEncryptSubstitution.setText("Encrypt Text");
        bEncryptSubstitution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEncryptSubstitutionActionPerformed(evt);
            }
        });

        bDecryptSubstitution.setText("Decrypt Text");
        bDecryptSubstitution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDecryptSubstitutionActionPerformed(evt);
            }
        });

        jLabel4.setText("Substitution Cipher:");

        bEncryptRotating.setText("Encrypt Text");
        bEncryptRotating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEncryptRotatingActionPerformed(evt);
            }
        });

        bDecryptRotating.setText("Decrypt Text");
        bDecryptRotating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDecryptRotatingActionPerformed(evt);
            }
        });

        jLabel5.setText("Rotating Cipher:");

        bDecodeUnknown.setText("Decode unknown.txt");
        bDecodeUnknown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDecodeUnknownActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlabelEnterText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfInput))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabelOutput)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bEncryptCaesar)
                            .addComponent(bDecryptCaesar)
                            .addComponent(jLabel3))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bDecryptSubstitution)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bDecryptRotating))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bEncryptSubstitution)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(bEncryptRotating)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bDecodeUnknown)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelEnterText)
                    .addComponent(jlabelOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEncryptCaesar)
                    .addComponent(bEncryptSubstitution)
                    .addComponent(bEncryptRotating))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDecryptCaesar)
                    .addComponent(bDecryptSubstitution)
                    .addComponent(bDecryptRotating))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDecodeUnknown)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bEncryptCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncryptCaesarActionPerformed
      //code for encrypting a Caesar's encryption
    }//GEN-LAST:event_bEncryptCaesarActionPerformed

    private void bDecryptCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecryptCaesarActionPerformed
      //code to decrypt a Caesar encrypted code
    }//GEN-LAST:event_bDecryptCaesarActionPerformed

    private void bEncryptSubstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncryptSubstitutionActionPerformed
      //code for encrypting a substitution cipher
    }//GEN-LAST:event_bEncryptSubstitutionActionPerformed

    private void bDecryptSubstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecryptSubstitutionActionPerformed
      //code for decrypting substitution ciphers
    }//GEN-LAST:event_bDecryptSubstitutionActionPerformed

    private void bEncryptRotatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncryptRotatingActionPerformed
      //code to encrypt rotating ciphers
    }//GEN-LAST:event_bEncryptRotatingActionPerformed

    private void bDecryptRotatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecryptRotatingActionPerformed
      //code to decrypt rotating ciphers
    }//GEN-LAST:event_bDecryptRotatingActionPerformed

    private void bDecodeUnknownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecodeUnknownActionPerformed
       //code to decode a file called unknown.txt
    }//GEN-LAST:event_bDecodeUnknownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDecodeUnknown;
    private javax.swing.JButton bDecryptCaesar;
    private javax.swing.JButton bDecryptRotating;
    private javax.swing.JButton bDecryptSubstitution;
    private javax.swing.JButton bEncryptCaesar;
    private javax.swing.JButton bEncryptRotating;
    private javax.swing.JButton bEncryptSubstitution;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabelEnterText;
    private javax.swing.JLabel jlabelOutput;
    private javax.swing.JTextField tfInput;
    private javax.swing.JTextField tfOutput;
    // End of variables declaration//GEN-END:variables
}
