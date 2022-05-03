package memory;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BatailleDlg extends javax.swing.JDialog {
    private LesJoueurs lj; //contient les joueurs de la partie
    private int indjc;   //indice joueur courant
    private Joueur adversaire; 
    private boolean ok; 
    private Bataille b;

    public boolean isOk() { 
        return ok; 
    }
    
    public Joueur getAdversaire() { 
        return adversaire; 
    } 
    
    public Bataille getBataille(){ 
        return b;
    }
    
    public BatailleDlg(java.awt.Frame parent, boolean modal, LesJoueurs lj, int jc) {
        super(parent, modal);
        initComponents();
        this.lj = lj;
        this.indjc = jc;                 
        this.ok = false;            
        this.b = null;                  //pour l'instant il n'y a pas de bataille de créée 
        Annuler.setText("Annuler");
        Annuler.setEnabled(false); //aucune bataille existe
        initListeJ();
        MessageJ.setText(lj.getJoueur(indjc).getPseudo()+" va effectuer une bataille contre : ");
    }

    public void initListeJ(){
        ListeJ.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        DefaultListModel mod = new DefaultListModel();
        ListeJ.setModel(mod);
        for(int i = 0; i < lj.getNbJoueurs(); i++){
                mod.addElement(lj.getJoueur(i).getPseudo());
        }
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        MessageJ = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListeJ = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Joueur = new javax.swing.JLabel();
        Adversaire = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfosCarte1 = new javax.swing.JTextArea();
        Carte1 = new javax.swing.JButton();
        Carte2 = new javax.swing.JButton();
        Ic2 = new javax.swing.JScrollPane();
        InfosCarte2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Vainqueur = new javax.swing.JLabel();
        Annuler = new javax.swing.JButton();
        Demarrer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));
        jPanel5.add(MessageJ);

        ListeJ.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListeJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListeJMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListeJ);

        jPanel5.add(jScrollPane2);

        getContentPane().add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));
        jPanel2.add(Joueur);
        jPanel2.add(Adversaire);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.GridLayout(1, 4));

        InfosCarte1.setColumns(20);
        InfosCarte1.setRows(5);
        jScrollPane1.setViewportView(InfosCarte1);

        jPanel3.add(jScrollPane1);

        Carte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1ActionPerformed(evt);
            }
        });
        jPanel3.add(Carte1);
        jPanel3.add(Carte2);

        InfosCarte2.setColumns(20);
        InfosCarte2.setRows(5);
        Ic2.setViewportView(InfosCarte2);

        jPanel3.add(Ic2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));
        jPanel4.add(Vainqueur);

        Annuler.setText("Annuler/Fermer");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        jPanel4.add(Annuler);

        Demarrer.setText("Demarrer");
        Demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemarrerActionPerformed(evt);
            }
        });
        jPanel4.add(Demarrer);

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Carte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Carte1ActionPerformed

    private void ListeJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListeJMouseClicked
        adversaire = lj.getJoueur(ListeJ.getSelectedIndex());
        if(lj.getJoueur(indjc) == adversaire){
            MessageJ.setText("Il faut séléctionner un joueur autre que toi...");
            Demarrer.setEnabled(false);
        }
        else{
            Demarrer.setEnabled(true);
            Annuler.setEnabled(true);
            b = new Bataille(lj.getJoueur(indjc), adversaire);
            Annuler.setVisible(true);
            Joueur.setText(lj.getJoueur(indjc).getPseudo());
            Adversaire.setText(adversaire.getPseudo());
            InfosCarte1.setText(lj.getJoueur(indjc).getPaquet().toString()+"\n");
            InfosCarte2.setText(adversaire.getPaquet().toString()+"\n");
        }
    }//GEN-LAST:event_ListeJMouseClicked

    private void DemarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemarrerActionPerformed
        Joueur jc = lj.getJoueur(indjc);
        InfosCarte1.append(jc.getPseudo()+" joue "+jc.getPaquet().getPerso(0).toString()+"\n");
        InfosCarte2.append(adversaire.getPseudo()+" joue "+adversaire.getPaquet().getPerso(0).toString()+"\n");
        int bexe = b.execute();
        if(bexe >= 0 && bexe <= 2){
            if(adversaire.getPaquet().getTaille() > 0 && jc.getPaquet().getTaille() > 0){
                if(bexe == 0){
                    Vainqueur.setText("");
                    InfosCarte1.append("Égalité\n\n");
                    InfosCarte2.append("Égalité\n\n");
                }
                if(bexe == 1){
                    Vainqueur.setText(jc.getPseudo());
                    InfosCarte1.append(jc.getPseudo()+" gagne\n"+jc.getPaquet().toString()+"\n");
                    InfosCarte2.append(adversaire.getPseudo()+" perd\n"+adversaire.getPaquet().toString()+"\n");
                }
                if(bexe == 2){
                    Vainqueur.setText(adversaire.getPseudo());
                    InfosCarte1.append(jc.getPseudo()+" perd\n"+jc.getPaquet().toString()+"\n");
                    InfosCarte2.append(adversaire.getPseudo()+" gagne\n"+adversaire.getPaquet().toString()+"\n");
                }
                this.ok = true;
                majCarte(jc);
            }
            else {
                InfosCarte1.append("Bataille terminée");
                InfosCarte2.append("Bataille terminée");
                Demarrer.setVisible(false);
                Annuler.setText("Fermer");
            }
        }
        
    }//GEN-LAST:event_DemarrerActionPerformed

    private void majCarte(Joueur jc){
        if(jc.getPaquet().getTaille() > 1)
            Carte1.setIcon(new ImageIcon(jc.getPaquet().getPerso(1).getPhoto()));
        else
            Carte1.setIcon(null);
        if(adversaire.getPaquet().getTaille() > 1)
            Carte2.setIcon(new ImageIcon(adversaire.getPaquet().getPerso(1).getPhoto()));
        else
            Carte2.setIcon(null);
    }
    
    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        this.ok=false;
        if (Annuler.getText().equals("Annuler"))
            this.b.setDeroulement("Bataille interrompue en cours de partie"); 
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

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
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatailleDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BatailleDlg dialog = new BatailleDlg(new javax.swing.JFrame(), true, null, 1);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adversaire;
    private javax.swing.JButton Annuler;
    private javax.swing.JButton Carte1;
    private javax.swing.JButton Carte2;
    private javax.swing.JButton Demarrer;
    private javax.swing.JScrollPane Ic2;
    private javax.swing.JTextArea InfosCarte1;
    private javax.swing.JTextArea InfosCarte2;
    private javax.swing.JLabel Joueur;
    private javax.swing.JList<String> ListeJ;
    private javax.swing.JLabel MessageJ;
    private javax.swing.JLabel Vainqueur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
