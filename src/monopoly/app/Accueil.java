/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Accueil.java
 *
 * Created on 28 mai 2011, 11:58:44
 */

package monopoly.app;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class Accueil extends javax.swing.JFrame {

    /** Creates new form Accueil */
    public static Accueil acc;

    public Accueil() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setMinimumSize(new java.awt.Dimension(500, 559));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/LoadingProgressBar.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 490, 70, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Chargement");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 480, 110, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/images/monopoly_man.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 510, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Définition des autres fonctions :
public void PasserFenetreSuivante1() throws InterruptedException{
    ThreadDemarrage ThDemarrage=new ThreadDemarrage();
    ThDemarrage.start();
    ThDemarrage.indicateur=true;
}

public static void PasserFenetreSuivante2(){
    acc.setVisible(false);
}

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setTitle("Monopoly");
        try {
            PasserFenetreSuivante1();
        } catch (InterruptedException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                acc=new Accueil();
                acc.setVisible(true);

            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}