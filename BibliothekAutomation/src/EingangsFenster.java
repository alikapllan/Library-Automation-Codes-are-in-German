
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.sql.*;

public class EingangsFenster extends javax.swing.JFrame {

    /**
     * Creates new form EingangsFenster
     */
    public EingangsFenster() {
        initComponents();
        
        //damit das Fenster in der Mitte vom Bildschirm stehen bleibt
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        benutzerfeld = new javax.swing.JTextField();
        kennwortsfeld = new javax.swing.JPasswordField();
        iconA = new javax.swing.JLabel();
        iconB = new javax.swing.JLabel();
        einloggenButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eingangsfenster");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Benutzer: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Kennwort: ");

        benutzerfeld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        benutzerfeld.setForeground(new java.awt.Color(204, 204, 204));
        benutzerfeld.setText("Benutzername");
        benutzerfeld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                benutzerfeldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                benutzerfeldFocusLost(evt);
            }
        });
        benutzerfeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benutzerfeldActionPerformed(evt);
            }
        });
        benutzerfeld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                benutzerfeldKeyTyped(evt);
            }
        });

        kennwortsfeld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kennwortsfeld.setText("Kennwort");
        kennwortsfeld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kennwortsfeldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kennwortsfeldFocusLost(evt);
            }
        });
        kennwortsfeld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kennwortsfeldKeyTyped(evt);
            }
        });

        iconA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N

        iconB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password.png"))); // NOI18N

        einloggenButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        einloggenButton.setText("Einloggen");
        einloggenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                einloggenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(einloggenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(iconA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(iconB)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(benutzerfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(kennwortsfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(benutzerfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(iconA)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kennwortsfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(iconB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(einloggenButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void benutzerfeldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_benutzerfeldKeyTyped
        //Hier ermöglicht uns, dass man für einen Benutzernamen maximal 20 Karakter benutzen darf.
        if((benutzerfeld.getText() + evt.getKeyChar()).length() >= 20){
            evt.consume();
        }
    }//GEN-LAST:event_benutzerfeldKeyTyped

    private void kennwortsfeldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kennwortsfeldKeyTyped
        //Hier ermöglicht uns, dass man für Kennwort maximal 20 Karakter benutzen darf.
        if((String.valueOf(kennwortsfeld.getPassword())+ evt.getKeyChar()).length() >= 20){
            evt.consume();
        }
    }//GEN-LAST:event_kennwortsfeldKeyTyped

    private void benutzerfeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benutzerfeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_benutzerfeldActionPerformed

    private void benutzerfeldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_benutzerfeldFocusGained
        if(benutzerfeld.getText().toLowerCase().equals("benutzername")){
            benutzerfeld.setText("");
            benutzerfeld.setForeground(Color.black);
        }
        //Einfach um dem User zu zeigen, dass der Fokus auf hier liegt.
            Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
                iconA.setBorder(border);
    }//GEN-LAST:event_benutzerfeldFocusGained

    private void benutzerfeldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_benutzerfeldFocusLost
        //damit das Feld in seine älteren Eigenschaften umgewandelt wird.
        if(benutzerfeld.getText().equals("") || benutzerfeld.getText().toLowerCase().equals("benutzername")){
            benutzerfeld.setText("Benutzername");
            benutzerfeld.setForeground(new Color(204,204,204));
        }
        iconA.setBorder(null);
    }//GEN-LAST:event_benutzerfeldFocusLost

    private void kennwortsfeldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kennwortsfeldFocusGained
        if(String.valueOf(kennwortsfeld.getPassword()).toLowerCase().equals("kennwort")){
            kennwortsfeld.setText("");
            kennwortsfeld.setForeground(Color.black);
        }
        //Einfach um dem User zu zeigen, dass der Fokus auf hier liegt.
            Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
                iconB.setBorder(border);
    }//GEN-LAST:event_kennwortsfeldFocusGained

    private void kennwortsfeldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kennwortsfeldFocusLost
        //damit das Feld in seine älteren Eigenschaften umgewandelt wird.
        String kennwortA = String.valueOf(kennwortsfeld.getPassword());
        if(kennwortA.equals("") || kennwortA.equals("kennwort")){
            kennwortsfeld.setText("Kennwort");
            kennwortsfeld.setForeground(new Color(204,204,204));
        }
        iconB.setBorder(null);
    }//GEN-LAST:event_kennwortsfeldFocusLost

    private void einloggenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_einloggenButtonActionPerformed
        
        if(benutzerfeld.getText().equals("") || benutzerfeld.getText().equals("Benutzername") || 
                String.valueOf(kennwortsfeld.getPassword()).equals("") || String.valueOf(kennwortsfeld.getPassword()).equals("kennwort"))
        {
            JOptionPane.showMessageDialog(null, "Felder sind leer!","Leeres Feld",2);
            
        }else{
            PreparedStatement st;
            ResultSet rs;
            
            String SQLAnfrage = "SELECT adminID,nickname,kennwort FROM admin WHERE nickname=? AND kennwort=?";
            
            try {
                
                String nickname = benutzerfeld.getText();
                String kennwort = String.valueOf(kennwortsfeld.getPassword());
                
                st=dBVerbindung.getConnection().prepareStatement(SQLAnfrage);
                
                st.setString(1, nickname);
                st.setString(2, kennwort);
                
                rs = st.executeQuery();
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Einloggen ist erfolgreich!");
                    dispose();
                    new Weiterleitungsfenster().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Solcher User befindet sich im System nicht!","Fehler",2);
                    benutzerfeld.setText("");
                    kennwortsfeld.setText("");
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Etwas ist schiefgelaufen!","Fehlerhafte Transaktion",2);
                benutzerfeld.setText("");
                kennwortsfeld.setText("");
            }
        }
    }//GEN-LAST:event_einloggenButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EingangsFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EingangsFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EingangsFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EingangsFenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EingangsFenster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField benutzerfeld;
    private javax.swing.JButton einloggenButton;
    private javax.swing.JLabel iconA;
    private javax.swing.JLabel iconB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField kennwortsfeld;
    // End of variables declaration//GEN-END:variables
}