package enigmamachine;
import java.awt.Frame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * EnigmaGUI.java creates a GUI for the encryption to provide ease of access for
 * the requirements.
 * Built for CIS252's team project assignment
 * @author Kyle Jolicoeur
 */
public class EnigmaGUI extends Frame
{
    SubstitutionCipher substitution = new SubstitutionCipher();
    CaesarCipher caesar = new CaesarCipher();
    RotatingCipher rotating = new RotatingCipher();
    UnknownCipher unknown = new UnknownCipher();
    SimpleEnigma enigma = new SimpleEnigma();
    
    public EnigmaGUI() 
    {
        initComponents();
    }

    //code that creates the GUI
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        bExit = new javax.swing.JButton();
        bSetKey = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        bEnigmaEncrypt = new javax.swing.JButton();
        bEnigmaDecode = new javax.swing.JButton();
        tfEnigmaInput = new javax.swing.JTextField();
        tfEnigmaOutput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        setName("Enigma Machine"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("Enigma Machine"); // NOI18N

        jlabelEnterText.setText("Enter the text to be encrypted/decrypted:");

        jlabelOutput.setText("Output:");

        bEncryptCaesar.setText("Encrypt Text");
        bEncryptCaesar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bEncryptCaesarActionPerformed(evt);
            }
        });

        jLabel3.setText("Caesar's Cipher:");

        bDecryptCaesar.setText("Decrypt Text");
        bDecryptCaesar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bDecryptCaesarActionPerformed(evt);
            }
        });

        bEncryptSubstitution.setText("Encrypt Text");
        bEncryptSubstitution.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bEncryptSubstitutionActionPerformed(evt);
            }
        });

        bDecryptSubstitution.setText("Decrypt Text");
        bDecryptSubstitution.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bDecryptSubstitutionActionPerformed(evt);
            }
        });

        jLabel4.setText("Substitution Cipher:");

        bEncryptRotating.setText("Encrypt Text");
        bEncryptRotating.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bEncryptRotatingActionPerformed(evt);
            }
        });

        bDecryptRotating.setText("Decrypt Text");
        bDecryptRotating.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bDecryptRotatingActionPerformed(evt);
            }
        });

        jLabel5.setText("Rotating Cipher:");

        bDecodeUnknown.setText("Decode unknown.txt");
        bDecodeUnknown.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bDecodeUnknownActionPerformed(evt);
            }
        });

        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bExitActionPerformed(evt);
            }
        });

        bSetKey.setText("Set Key");
        bSetKey.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bSetKeyActionPerformed(evt);
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
                            .addComponent(jlabelOutput))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bEncryptCaesar)
                            .addComponent(bDecryptCaesar)
                            .addComponent(jLabel3))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bEncryptSubstitution)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(bEncryptRotating)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bSetKey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bDecryptSubstitution, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bDecryptRotating, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bDecodeUnknown, javax.swing.GroupLayout.Alignment.TRAILING))))))
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
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSetKey)
                    .addComponent(bDecodeUnknown))
                .addGap(18, 18, 18)
                .addComponent(bExit)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jTextField1.setText(enigma.getOuterRotor());

        jLabel1.setText("Outer Rotor");

        jLabel2.setText("Middle Rotor");

        jLabel6.setText("Inner Rotor");

        jTextField2.setText(enigma.getMiddleRotor());

        jTextField3.setText(enigma.getInnerRotor());

        bEnigmaEncrypt.setText("Encrypt Text");
        bEnigmaEncrypt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bEnigmaEncryptActionPerformed(evt);
            }
        });

        bEnigmaDecode.setText("Decode Text");
        bEnigmaDecode.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bEnigmaDecodeActionPerformed(evt);
            }
        });

        jLabel7.setText("Output");

        jLabel8.setText("Enter the text to be encrypted/decrypted:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(102, 102, 102))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(bEnigmaEncrypt))
                            .addComponent(tfEnigmaInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(bEnigmaDecode))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(tfEnigmaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEnigmaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEnigmaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEnigmaEncrypt)
                    .addComponent(bEnigmaDecode))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Enigma Machine");
    }// </editor-fold>//GEN-END:initComponents

    private void bEncryptCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncryptCaesarActionPerformed
      //code for encrypting a Caesar's encryption
        String encodedText = caesar.encode(tfInput.getText());
        tfOutput.setText(encodedText);
    }//GEN-LAST:event_bEncryptCaesarActionPerformed

    private void bDecryptCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecryptCaesarActionPerformed
      //code to decrypt a Caesar encrypted code
        String decodedText = caesar.decode(tfInput.getText());
        tfOutput.setText(decodedText);
    }//GEN-LAST:event_bDecryptCaesarActionPerformed

    private void bEncryptSubstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncryptSubstitutionActionPerformed
      //code for encrypting a substitution cipher
        String encodedText = substitution.encode(tfInput.getText());
        tfOutput.setText(encodedText);
    }//GEN-LAST:event_bEncryptSubstitutionActionPerformed

    private void bDecryptSubstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecryptSubstitutionActionPerformed
      //code for decrypting substitution ciphers
        String decodedText = substitution.decode(tfInput.getText());
        tfOutput.setText(decodedText);
    }//GEN-LAST:event_bDecryptSubstitutionActionPerformed

    private void bEncryptRotatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncryptRotatingActionPerformed
      //code to encrypt rotating ciphers
        String encodedText = rotating.encode(tfInput.getText());
        tfOutput.setText(encodedText);
    }//GEN-LAST:event_bEncryptRotatingActionPerformed

    private void bDecryptRotatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecryptRotatingActionPerformed
      //code to decrypt rotating ciphers
        String decodedText = rotating.decode(tfInput.getText());
        tfOutput.setText(decodedText);
    }//GEN-LAST:event_bDecryptRotatingActionPerformed

    private void bDecodeUnknownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecodeUnknownActionPerformed
        try {
            unknown.decrypt();
        } catch (IOException ex) {
            Logger.getLogger(EnigmaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDecodeUnknownActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void bSetKeyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bSetKeyActionPerformed
    {//GEN-HEADEREND:event_bSetKeyActionPerformed
        SetKeyDialog dialog = new SetKeyDialog(this, true);
        
    }//GEN-LAST:event_bSetKeyActionPerformed

    private void bEnigmaEncryptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bEnigmaEncryptActionPerformed
    {//GEN-HEADEREND:event_bEnigmaEncryptActionPerformed
       String encodedText = enigma.encode(tfEnigmaInput.getText());
       tfEnigmaOutput.setText(encodedText);
    }//GEN-LAST:event_bEnigmaEncryptActionPerformed

    private void bEnigmaDecodeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bEnigmaDecodeActionPerformed
    {//GEN-HEADEREND:event_bEnigmaDecodeActionPerformed
        String decodedText = enigma.decode(tfEnigmaInput.getText());
        tfEnigmaOutput.setText(decodedText);
    }//GEN-LAST:event_bEnigmaDecodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDecodeUnknown;
    private javax.swing.JButton bDecryptCaesar;
    private javax.swing.JButton bDecryptRotating;
    private javax.swing.JButton bDecryptSubstitution;
    private javax.swing.JButton bEncryptCaesar;
    private javax.swing.JButton bEncryptRotating;
    private javax.swing.JButton bEncryptSubstitution;
    private javax.swing.JButton bEnigmaDecode;
    private javax.swing.JButton bEnigmaEncrypt;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bSetKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jlabelEnterText;
    private javax.swing.JLabel jlabelOutput;
    private javax.swing.JTextField tfEnigmaInput;
    private javax.swing.JTextField tfEnigmaOutput;
    private javax.swing.JTextField tfInput;
    private javax.swing.JTextField tfOutput;
    // End of variables declaration//GEN-END:variables
}
