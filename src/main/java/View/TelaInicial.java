/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.TelaInicialController;

/**
 *
 * @author lym
 */
public class TelaInicial extends javax.swing.JFrame {
    
    private final TelaInicialController controller;
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        this.controller = new TelaInicialController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_BackGround = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Cadastro = new javax.swing.JMenu();
        jMenuItem_Cliente = new javax.swing.JMenuItem();
        jMenuItem_Serviço = new javax.swing.JMenuItem();
        jMenu_Operação = new javax.swing.JMenu();
        jMenuItem_Agenda = new javax.swing.JMenuItem();
        jMenu_Relatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagem colada.png"))); // NOI18N
        getContentPane().add(jLabel_BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu_Cadastro.setText("Cadastro");

        jMenuItem_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jMenuItem_Cliente.setText("Cliente");
        jMenuItem_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ClienteActionPerformed(evt);
            }
        });
        jMenu_Cadastro.add(jMenuItem_Cliente);

        jMenuItem_Serviço.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scissor.png"))); // NOI18N
        jMenuItem_Serviço.setText("Serviço");
        jMenu_Cadastro.add(jMenuItem_Serviço);

        jMenuBar1.add(jMenu_Cadastro);

        jMenu_Operação.setText("Operação");

        jMenuItem_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar_833593.png"))); // NOI18N
        jMenuItem_Agenda.setText("Agenda");
        jMenuItem_Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AgendaActionPerformed(evt);
            }
        });
        jMenu_Operação.add(jMenuItem_Agenda);

        jMenuBar1.add(jMenu_Operação);

        jMenu_Relatorio.setText("Relatório");
        jMenuBar1.add(jMenu_Relatorio);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_ClienteActionPerformed

    private void jMenuItem_AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AgendaActionPerformed
        controller.moverAbaAgenda();
    }//GEN-LAST:event_jMenuItem_AgendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_BackGround;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Agenda;
    private javax.swing.JMenuItem jMenuItem_Cliente;
    private javax.swing.JMenuItem jMenuItem_Serviço;
    private javax.swing.JMenu jMenu_Cadastro;
    private javax.swing.JMenu jMenu_Operação;
    private javax.swing.JMenu jMenu_Relatorio;
    // End of variables declaration//GEN-END:variables
}
