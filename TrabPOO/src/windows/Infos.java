/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package windows;

import control.Battlefield;
import domain.abstracts.Guerreiro;
import java.util.LinkedList;

/**
 *
 * @author Marco Dornell
 */
public class Infos extends javax.swing.JDialog {

    private LinkedList<Guerreiro>  lado1;
    private LinkedList<Guerreiro>  lado2;
    private Battlefield batalha;
    /**
     * Creates new form Infos
     */
    public Infos(java.awt.Frame parent, boolean modal, Battlefield batalha, LinkedList<Guerreiro>  lado1,LinkedList<Guerreiro>  lado2) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.batalha = batalha;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPeso1 = new javax.swing.JTextField();
        txtPeso2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaisVelho1 = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        txtMaisVelho2 = new javax.swing.JTextField();
        txtMaisVelho3 = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Peso1:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 47, 263, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Peso2:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 182, 263, 25);

        txtPeso1.setEditable(false);
        txtPeso1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPeso1.setBorder(null);
        getContentPane().add(txtPeso1);
        txtPeso1.setBounds(34, 90, 283, 32);

        txtPeso2.setEditable(false);
        txtPeso2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPeso2.setBorder(null);
        getContentPane().add(txtPeso2);
        txtPeso2.setBounds(34, 213, 283, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mais Velho:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 47, 263, 25);

        txtMaisVelho1.setEditable(false);
        txtMaisVelho1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaisVelho1.setBorder(null);
        txtMaisVelho1.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(txtMaisVelho1);
        txtMaisVelho1.setBounds(450, 78, 297, 30);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(34, 360, 76, 27);

        txtMaisVelho2.setEditable(false);
        txtMaisVelho2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaisVelho2.setBorder(null);
        txtMaisVelho2.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(txtMaisVelho2);
        txtMaisVelho2.setBounds(450, 114, 297, 30);

        txtMaisVelho3.setEditable(false);
        txtMaisVelho3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaisVelho3.setBorder(null);
        txtMaisVelho3.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(txtMaisVelho3);
        txtMaisVelho3.setBounds(450, 150, 297, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/infoPage.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 850, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        double[] pesos = this.batalha.somarPeso(lado1, lado2);
        Guerreiro maisVelho = this.batalha.maisVelho(lado1, lado2);
        
        exibe(pesos,maisVelho);
    }//GEN-LAST:event_formWindowActivated

    private void exibe(double[] pesos, Guerreiro maisVelho){
        this.txtPeso1.setText("Terrans e Protoss pesam: " + (int)pesos[0]);
        this.txtPeso2.setText("Zergs e Nagas pesam: " + (int)pesos[1]);
        this.txtMaisVelho1.setText("O Guerreiro mais velho e: " + maisVelho.getNome());
        this.txtMaisVelho2.setText("O Guerreiro tem a idade: " + maisVelho.getIdade() +  " anos");
        this.txtMaisVelho3.setText("O Guerreiro tem a classe: " + maisVelho.toString());
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Infos dialog = new Infos(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextField txtMaisVelho1;
    private javax.swing.JTextField txtMaisVelho2;
    private javax.swing.JTextField txtMaisVelho3;
    private javax.swing.JTextField txtPeso1;
    private javax.swing.JTextField txtPeso2;
    // End of variables declaration//GEN-END:variables
}
