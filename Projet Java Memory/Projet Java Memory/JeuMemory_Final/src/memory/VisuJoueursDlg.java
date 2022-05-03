package memory;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VisuJoueursDlg extends javax.swing.JDialog {

    private LesJoueurs lj; //liste des joueurs à afficher

    public VisuJoueursDlg(java.awt.Frame parent, boolean modal, LesJoueurs lj) {
        super(parent, modal);
        initComponents();
        this.lj=lj;
        initTrombi();
    }

private void initTrombi()
{
    int nb = this.lj.getNbJoueurs();    //recupère le nb de joueurs
    Panneau.setLayout(new GridLayout(1, nb));   //défini la disposition
    for (int i = 0; i < nb; i++){ 
        JButton jb = new JButton();   //créé un nouveau JButton
        Joueur j = lj.getJoueur(i);  //récupère le joueur i
        jb.setName(""+i);       //nomme le JB par un le nombre i
        jb.addActionListener(new java.awt.event.ActionListener() {  //ajoute un écouteur au bouton
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //de type actionPerformed
                AfficheInfosJoueur(evt);
            }
        });
        Panneau.add(jb);    //ajoute le composant au JPanel
    }
    this.pack();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneau = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Afficher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panneau.setLayout(new java.awt.GridLayout(1, 2));
        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choisissez un joueur pour voir ses caractéristiques");
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        Edition.setColumns(20);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.EAST);

        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        Afficher.setText("Afficher");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });
        jPanel1.add(Afficher);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        for (int i = 0; i < this.lj.getNbJoueurs(); i++){ 
            JButton jb = (JButton) Panneau.getComponent(i);  //récupère le bouton i
            Joueur j = lj.getJoueur(i);  //récupère le joueur i
            Image img = j.getPhoto().getImage().getScaledInstance(jb.getWidth(), jb.getHeight(),Image.SCALE_DEFAULT); //récupère son image
            jb.setIcon(new ImageIcon(img)); //l'affiche en Icon sur le JButton
        }
    }//GEN-LAST:event_AfficherActionPerformed

   private void AfficheInfosJoueur(java.awt.event.ActionEvent evt){
        JButton bt = (JButton)evt.getSource();  //récupère le bouton pressé
        int ind = Integer.parseInt(bt.getName()); //récupère un indice via son nom
        Joueur j = this.lj.getJoueur(ind);  //récupère le joueur correspondant
        Edition.setText(j.toString());  //affiche les infos
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afficher;
    private javax.swing.JTextArea Edition;
    private javax.swing.JPanel Panneau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
