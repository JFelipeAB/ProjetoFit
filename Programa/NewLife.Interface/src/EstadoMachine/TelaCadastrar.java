/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import Business.UsuarioCrud.CrudUsuario;
import Business.UsuarioCrud.NewUsuario;
import java.awt.Color;

/**
 *
 * @author joao-
 * @author matheus
 */


public class TelaCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrar
     */
    public TelaCadastrar() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEntrar1 = new javax.swing.JButton();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenha1 = new javax.swing.JTextField();
        btnEntrar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEntrar3 = new javax.swing.JButton();

        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        jLabel2.setText("Usuário");

        btnEntrar.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EstadoMachine/login maior.png"))); // NOI18N
        btnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        jLabel5.setText("Senha");

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("NEWLIFE");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EstadoMachine/newlife logo 2.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("LOGIN");

        btnEntrar1.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        btnEntrar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);
        setSize(new java.awt.Dimension(371, 711));

        txtUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        jLabel6.setText("Usuário");

        btnEntrar2.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        btnEntrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EstadoMachine/cadastrar.png"))); // NOI18N
        btnEntrar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        jLabel7.setText("Senha");

        jLabel8.setFont(new java.awt.Font("Haettenschweiler", 0, 64)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("NEWLIFE");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EstadoMachine/newlife logo 2.jpg"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("CADASTRAR");

        btnEntrar3.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        btnEntrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EstadoMachine/entrar.png"))); // NOI18N
        btnEntrar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEntrar2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addComponent(jLabel8))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnEntrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
    

        new TelaMenu().setVisible(true);
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1ActionPerformed
*/
    private void btnEntrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar2ActionPerformed
        if(NewUsuario.NovoUser(txtUsuario1.getText(),txtSenha1.getText())) 
        {
            new TelaMenu().setVisible(true);
            CrudUsuario.setUsuarioLogado(txtUsuario1.getText(),txtSenha1.getText());
            this.hide();
        }// TODO add your handling code here:
        else
        {
        txtUsuario.setText("Usuario ja existente");
        txtSenha.setText("");
        }
    }//GEN-LAST:event_btnEntrar2ActionPerformed

    private void btnEntrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar3ActionPerformed
       new TelaLogin().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnEntrar3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JButton btnEntrar2;
    private javax.swing.JButton btnEntrar3;
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
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSenha1;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
