package memory;

import javax.swing.*;

public class TransfertDlg extends javax.swing.JDialog {

    private LesJoueurs lj;  //collection des joueurs, pour initialiser la liste déroulante avec les pseudos des joueurs 
    private int indj;       //indice joueur courant
    private Transfert tc;   // cette classe sera étudiée ultérieurement – laisser l’attribut en commentaire
    private boolean ok;     // indicateur pour savoir le transfert a bien été effectué.
    private int indjs;      //indice du joueur sélectionné dans la liste déroulante
    private String fs;      //famille du personnage sélectionné en cliquant sur un des personnages du joueur sélectionné

    public boolean isOk() {
        return ok;
    }

    public Transfert getTransfert(){
        return this.tc;
    }
    
    public TransfertDlg(java.awt.Frame parent, boolean modal, LesJoueurs lj, int indj) {    //TD7 2.2
        super(parent, modal);
        initComponents();
        this.lj = lj;
        this.indj = indj;
        this.tc = null;
        this.ok = false;
        this.fs = null;
        indjs = 0;
        Message.setText("Le joueur "+lj.getJoueur(indj).getPseudo()+" a obtenu une famille complète");
        initCombo();
        Infos.setText("Personnages de "+lj.getJoueur(indj).getPseudo()+" : \n"+lj.getJoueur(indj).getPaquet().toString()+"\n");
    }
    
    public void initCombo() {
        for(int i = 0; i < lj.getNbJoueurs(); i++){
            ComboJoueurs.addItem(lj.getJoueur(i).getPseudo());
        }
    }
    
    public void initPanneau(){
        PanneauG.removeAll();   //on vide le JPanel
        this.repaint();         //on actualise la fenêtre
        LesPersonnages lcs = lj.getJoueur(indjs).getPaquet();                   //récupère le paquet du joueur
        int t = lcs.getTaille();                                                //récupère la taille de ce paquet   
        int n = 1+(t-1)/4;                                                      //calcule du nombre de colonne
        PanneauG.setLayout(new java.awt.GridLayout(4, n));                      //définit le mode d'organisation du JPanel
        for(int i = 0; i < t; i++){                                             //pour tout les personnages 
            JButton bt = new JButton();                                         //création d'un nouveau JButton          
            bt.setName(lcs.getPerso(i).getFamille());                           //définit le nom du bouton par la famille du personnage
            bt.addActionListener(new java.awt.event.ActionListener() {          //ajout d'un écouteur d'événement sur le JButton créé
                public void actionPerformed(java.awt.event.ActionEvent evt) {   //événement lorsqu'on clique sur bt
                    boutonActionPerformed(evt);                                 //action à réaliser
                }
            });
            PanneauG.add(bt);                                                   //ajout du bouton au panneau
        }   
        this.pack();                                                            //réorganisation du panneau
    }
    
    public void boutonActionPerformed(java.awt.event.ActionEvent evt){          
        LesPersonnages lp = lj.getJoueur(indjs).getPaquet();                    //récupération du paquet du joueur courant
        int t = lp.getTaille();                                                 //récupération de la taille du paquet
        JButton bt = (JButton)evt.getSource();                                  //récupération du bouton cliqué avec getSource();
        fs = bt.getName();                                                      //la proprité Name, contient ici le nom du personnage affiché sur le bouton 
        for(int i = 0; i < t; i++) {                                            //pour tout les personnages du paquet
            JButton b = (JButton)(PanneauG.getComponent(i));                    //on récupère les boutons
            if(b.getName().equals(fs))                                          //si le bouton récupéré à le même nom que celui cliqué
                b.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(255, 0, 0))); //ajout des bordures au bouton de taille 10 et couleur rouge 
            else                                                                //sinon
                b.setBorder(null);                                              //on définit les bordures sur null pour qu'il n'y en ait pas
        }
        LesPersonnages lps = lp.getPersosFamille(fs);                                       //récupération des personnages de la famille séléctionnée
        Infos.setText("Vous pouvez récupérer "+lps.getTaille()+" personnages : \n"+lps);    //Indique le nb de persos récupérable avec la liste des persos
    }

    public void affichePanneau(){
        LesPersonnages lcs = lj.getJoueur(indjs).getPaquet();                   //récupère les cartes du joueur d'indice indjs
        int t = lcs.getTaille();                                                //on récupère le nombre de cartes
        for(int i = 0; i < t; i++){             
            JButton bt = (JButton)PanneauG.getComponent(i);                     //on récupère le JButton i
            Personnage p = lcs.getPerso(i);                                     //on récupère le perso i
            p.setImgBouton(bt);                                                 //puis on affiche la photo du perso i sur le button i
        }
    }
    
    public void creePanneau(JPanel jp, LesPersonnages lc){
        jp.removeAll();         //suppression de tout composants sur le JPanel
        this.repaint();         //repaint
        int t = lc.getTaille(); //récupération du nombre de persos
        int n = 1+(t-1)/4;      //calcul du nombre de colonnes
        jp.setLayout(new java.awt.GridLayout(4, n));    //défini le mode de disposition du JPanel
        for(int i = 0; i < t; i++){
            JButton bt = new JButton();                 //on créé un nouveau JButton
            bt.setName(lc.getPerso(i).getFamille());    //on défini son nom par la famille du persos
            jp.add(bt);                                 //puis on ajoute le JB au panel
        }
        this.pack();                                    //réorganisation
    }
    
    public void dessinePanneau(JPanel jp, LesPersonnages lc){
        int t = lc.getTaille();             //récupération du nombre de persos
        for(int i = 0; i < t; i++){
            JButton bt = (JButton)jp.getComponent(i);   //récupère le panneau i
            Personnage p = lc.getPerso(i);              //et le persos i
            p.setImgBouton(bt);                         //puis défini l'image du persos i sur le panneau i
        }   
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauG = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Message = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboJoueurs = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        Infos = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Transfert = new javax.swing.JButton();
        Fermer = new javax.swing.JButton();
        PanneauD = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 3));

        PanneauG.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(PanneauG);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.GridLayout(2, 0));

        jPanel1.setLayout(new java.awt.GridLayout(4, 1));
        jPanel1.add(Message);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);

        ComboJoueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboJoueursActionPerformed(evt);
            }
        });
        jPanel1.add(ComboJoueurs);

        jPanel5.add(jPanel1);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        Infos.setColumns(20);
        Infos.setRows(5);
        jPanel3.add(Infos);

        jPanel5.add(jPanel3);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        Transfert.setText("Transfert");
        Transfert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransfertActionPerformed(evt);
            }
        });
        jPanel4.add(Transfert);

        Fermer.setText("Fermer");
        Fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FermerActionPerformed(evt);
            }
        });
        jPanel4.add(Fermer);

        jPanel2.add(jPanel4, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel2);

        PanneauD.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(PanneauD);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboJoueursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboJoueursActionPerformed
        this.indjs = ComboJoueurs.getSelectedIndex();   //récupère choix fait dans la liste
        if (indjs != -1){           
            if (this.indjs == this.indj) {
                Infos.setText("Sélectionnez un joueur différent du joueur courant !");  //ajoute du text dans la zone de texte
                PanneauG.removeAll();       //on enlève (si il y a) tout les composants du panel
                PanneauG.repaint();         //repaint
            }
            else {
                Infos.setText(lj.getJoueur(indjs).toString()); //on affiche info joueur
                initPanneau();         //initialisation panneau
                affichePanneau();       //affichage
            } 
        }
    }//GEN-LAST:event_ComboJoueursActionPerformed

    private void FermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FermerActionPerformed
        this.setVisible(false); //rend invisible la fenêtre
        this.dispose(); //libère la mémoire
    }//GEN-LAST:event_FermerActionPerformed

    private void TransfertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransfertActionPerformed
        if(indjs != -1 && fs != null){
            tc = new Transfert(lj.getJoueur(indj), lj.getJoueur(indjs), fs);    //nouvelle instance de transfert    
            int temp = tc.execute();            //récupération de l'entier retourné par la méthode  
            if(temp > 0){
                LesPersonnages lp = tc.getCartesTrans();    //récupère les cartes transf
                creePanneau(PanneauD, lp);                  //créé le panneau droit
                dessinePanneau(PanneauD, lp);               //le dessine
                LesPersonnages lpJ = lj.getJoueur(indjs).getPaquet();   //récupère cartes joueur courant
                creePanneau(PanneauG, lpJ);                 //créé panneau gauche
                dessinePanneau(PanneauG, lpJ);              //le dessine
                ok = true;
                Transfert.setEnabled(false);                //on désactive le bouton
            }  
        }
        else{
                Infos.setText("Séléctionnez une famille ou séléctionnez un joueur ayant au moins une carte !");
            }
    }//GEN-LAST:event_TransfertActionPerformed

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
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TransfertDlg dialog = new TransfertDlg(new javax.swing.JFrame(), true, null, 0);
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
    private javax.swing.JComboBox<String> ComboJoueurs;
    private javax.swing.JButton Fermer;
    private javax.swing.JTextArea Infos;
    private javax.swing.JLabel Message;
    private javax.swing.JPanel PanneauD;
    private javax.swing.JPanel PanneauG;
    private javax.swing.JButton Transfert;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables


}
