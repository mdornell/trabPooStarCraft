/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package windows;

import control.Battlefield;
import domain.abstracts.*;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Marco Dornell
 */
public class Game extends javax.swing.JDialog {

    private LinkedList<Guerreiro> lado1;
    private LinkedList<Guerreiro> lado2;
    private DefaultListModel modelo1 = new DefaultListModel();
    private DefaultListModel modelo2 = new DefaultListModel();
    private Battlefield batalha;
    
    /**
     * Creates new form Game
     */
    public Game(java.awt.Frame parent, boolean modal,LinkedList<Guerreiro> lado1,LinkedList<Guerreiro> lado2, Battlefield batalha) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.listLado1.setModel(modelo1);
        this.listLado2.setModel(modelo2);
        this.batalha = batalha;
        listar();
        colocaImgGuerreiros(lado1,lado2);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLutar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listLado2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listLado1 = new javax.swing.JList<>();
        lblImager2 = new javax.swing.JLabel();
        lblImager1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBackgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        btnLutar.setText("Lutar");
        btnLutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLutar);
        btnLutar.setBounds(330, 360, 125, 56);

        listLado2.setToolTipText("");
        jScrollPane2.setViewportView(listLado2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(550, 90, 231, 274);

        listLado1.setToolTipText("");
        jScrollPane3.setViewportView(listLado1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 80, 226, 274);
        getContentPane().add(lblImager2);
        lblImager2.setBounds(430, 150, 100, 100);
        getContentPane().add(lblImager1);
        lblImager1.setBounds(280, 150, 100, 100);
        getContentPane().add(lblName2);
        lblName2.setBounds(430, 280, 100, 29);
        getContentPane().add(lblName1);
        lblName1.setBounds(280, 280, 100, 29);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(20, 390, 76, 27);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Zergs e Nagas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 40, 230, 41);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Terrans e Protross");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 208, 41);

        lblBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gamePage.jpg"))); // NOI18N
        getContentPane().add(lblBackgroud);
        lblBackgroud.setBounds(0, -80, 1110, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listar(){
        for(int i=0;i < lado1.size();i++){
            modelo1.addElement("Vida:["+lado1.get(i).getEnergia()+"]  Nome:  "+lado1.get(i).getNome());
        }
        for(int i=0;i < lado2.size();i++){
            modelo2.addElement("Vida:["+lado2.get(i).getEnergia()+"]  Nome:  "+lado2.get(i).getNome());
        }
    }
    
    private void colocaImgGuerreiros(LinkedList<Guerreiro> lado1,LinkedList<Guerreiro> lado2){
        int index = 0;      
        if((lado1.size() <= 0) || (lado2.size() <= 0)){
            if(lado1.size() <= 0){
                this.lblImager1.setIcon(new ImageIcon(getClass().getResource("/imagens/"+"Vazio"+".jpg")));
                this.lblName1.setText("Vazio");
            }else{
                this.lblImager2.setIcon(new ImageIcon(getClass().getResource("/imagens/"+"Vazio"+".jpg")));
                this.lblName2.setText("Vazio");
            }            
        }else{
            String nome = lado1.get(index).toString();
            this.lblImager1.setIcon(new ImageIcon(getClass().getResource("/imagens/"+nome+".jpg")));
            this.lblName1.setText(lado1.get(index).getNome());
            
            String nome2 = lado2.get(index).toString();
            this.lblImager2.setIcon(new ImageIcon(getClass().getResource("/imagens/"+nome2+".jpg")));
            this.lblName2.setText(lado2.get(index).getNome());
            
        }    
    }
    
    
    private void btnLutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLutarActionPerformed
        this.batalha.battle(lado1, lado2);
        this.modelo1.removeAllElements();
        this.modelo2.removeAllElements();       
        listar();
        colocaImgGuerreiros(lado1, lado2);
    }//GEN-LAST:event_btnLutarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Game dialog = new Game(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLutar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBackgroud;
    private javax.swing.JLabel lblImager1;
    private javax.swing.JLabel lblImager2;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JList<String> listLado1;
    private javax.swing.JList<String> listLado2;
    // End of variables declaration//GEN-END:variables
}
