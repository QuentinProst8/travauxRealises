package memory;

import java.awt.event.*;
import javax.swing.*;

public class JeuMemory extends javax.swing.JFrame {

    private LesJoueurs joueurs;
    private LesPersonnages persos;
    private int indJ; // pour mémoriser le nombre de joueur après la création de joueurs
    private Jeu monJeu;
    private int l1, c1, l2, c2;
    private int nbPersosRestant;
 
    public JeuMemory() {
        initComponents();
        setTitle("Memory");
        this.joueurs = new LesJoueurs();
        this.persos = new LesPersonnages(4);
        this.indJ=0;
        l1 = -1;
        c1 = -1;
        l2 = -1;
        c2 = -1;
        JC.setText("Paramétrez pour jouer");
    }
    
    public PlateauJeu getPlateau(){
        return monJeu.getMonP();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneau = new javax.swing.JPanel();
        Infos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NbPersosT = new javax.swing.JLabel();
        NbPersosR = new javax.swing.JLabel();
        JC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Demarrer = new javax.swing.JButton();
        Recommencer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Settings = new javax.swing.JMenu();
        Options = new javax.swing.JMenuItem();
        AjoutJ = new javax.swing.JMenuItem();
        Visualiser = new javax.swing.JMenu();
        VisuJoueurs = new javax.swing.JMenuItem();
        VisuCartes = new javax.swing.JMenuItem();
        Test = new javax.swing.JMenu();
        testBataille = new javax.swing.JMenuItem();
        testTransfert = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanneauLayout = new javax.swing.GroupLayout(Panneau);
        Panneau.setLayout(PanneauLayout);
        PanneauLayout.setHorizontalGroup(
            PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanneauLayout.setVerticalGroup(
            PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);

        Infos.setPreferredSize(new java.awt.Dimension(400, 124));
        Infos.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));
        jPanel2.add(NbPersosT);
        jPanel2.add(NbPersosR);

        JC.setBackground(new java.awt.Color(228, 198, 173));
        JC.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jPanel2.add(JC);

        Infos.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        Demarrer.setText("Demarrer");
        Demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemarrerActionPerformed(evt);
            }
        });
        jPanel1.add(Demarrer);

        Recommencer.setText("Recommencer");
        Recommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecommencerActionPerformed(evt);
            }
        });
        jPanel1.add(Recommencer);

        Infos.add(jPanel1, java.awt.BorderLayout.SOUTH);

        Edition.setEditable(false);
        Edition.setColumns(20);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        Infos.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Infos, java.awt.BorderLayout.WEST);

        Settings.setText("Paramètres");

        Options.setText("Options");
        Options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsActionPerformed(evt);
            }
        });
        Settings.add(Options);

        AjoutJ.setText("Ajouter un joueur");
        AjoutJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutJActionPerformed(evt);
            }
        });
        Settings.add(AjoutJ);

        jMenuBar1.add(Settings);

        Visualiser.setText("Visualiser");

        VisuJoueurs.setText("Joueurs");
        VisuJoueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisuJoueursActionPerformed(evt);
            }
        });
        Visualiser.add(VisuJoueurs);

        VisuCartes.setText("Cartes");
        VisuCartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisuCartesActionPerformed(evt);
            }
        });
        Visualiser.add(VisuCartes);

        jMenuBar1.add(Visualiser);

        Test.setText("Test");

        testBataille.setText("Bataille_test");
        testBataille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBatailleActionPerformed(evt);
            }
        });
        Test.add(testBataille);

        testTransfert.setText("Transfert_test");
        testTransfert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTransfertActionPerformed(evt);
            }
        });
        Test.add(testTransfert);

        jMenuBar1.add(Test);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void OptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsActionPerformed
        InitDlg choix = new InitDlg(this,true);
        choix.setSize(900,600);
        choix.setVisible(true);
        if(choix.isOk()){
              // ajoute les joueurs sélectionnés aux joueurs existants
            LesJoueurs mesJ = choix.getLj();    //récupère l'instance de LesJoueurs contenant les joueurs selectionnés
            for(int i = 0; i < mesJ.getNbJoueurs(); i++)
                this.joueurs.ajouteJoueur(mesJ.getJoueur(i));   //ajoute les joueurs 
            // initialise les personnages et le niveau de jeu
            this.persos = new LesPersonnages(choix.getNc());    //nouvelle instance avec le bon nombre de persos
            // pour vérification
            Edition.setText(this.joueurs.toString()+"\n");
            monJeu = new Jeu(persos, joueurs, choix.getNc());   //nouvelle isntance de jeu avec les persos, les joueurs et le nombre de persos
        }
    }//GEN-LAST:event_OptionsActionPerformed

    private void AjoutJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutJActionPerformed
        SaisieJoueurDlg choix = new SaisieJoueurDlg(this, true, this.persos);
        choix.setSize(600, 400);
        choix.setVisible(true);
        if (choix.isOk()) {
            this.indJ = this.joueurs.getNbJoueurs();    //récupère le nombre de joueur  
            Joueur j = choix.getJoueur();       //récupère le joueur créé
            // ajout du joueur
            this.joueurs.ajouteJoueur(j);   //l'ajoute à l'instance de Lesjoueurs
            // pour vérification
            Edition.setText(this.joueurs.toString());   //affiche ses infos
        }
    }//GEN-LAST:event_AjoutJActionPerformed

    private void VisuJoueursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisuJoueursActionPerformed
        VisuJoueursDlg choix = new VisuJoueursDlg(this, true, this.joueurs);
        choix.setSize(1024, 720);
        choix.setVisible(true);
    }//GEN-LAST:event_VisuJoueursActionPerformed

    private void VisuCartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisuCartesActionPerformed
        VisuPersonnagesDlg diag = new VisuPersonnagesDlg(this, true, this.joueurs.getJoueur(indJ));
        diag.setSize(1024, 720);
        diag.setVisible(true);
    }//GEN-LAST:event_VisuCartesActionPerformed

    private void DemarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemarrerActionPerformed
        nbPersosRestant = persos.getTaille();
        if(joueurs.getNbJoueurs() < 2)
            Edition.setText("Pour jouer, vous devez être au minimum deux !");
        else{
            Demarrer.setEnabled(false);
            Options.setEnabled(false);
            AjoutJ.setEnabled(false);
            NbPersosT.setText("Nb de personnages trouvés : "+0);
            NbPersosR.setText("Nb de personnages restant : "+nbPersosRestant);
            JC.setText("C'est à "+monJeu.getJoueurCourant().getPseudo()+" de jouer");
            
            Panneau.removeAll();   //on vide le JPanel        
            int t = (persos.getTaille()*2);                                                //récupère la taille de ce paquet   
            Panneau.setLayout(new java.awt.GridLayout(getPlateau().getNblig(), getPlateau().getNbcol())); //définit le mode d'organisation du JPanel
            for(int i = 0; i < t; i++){                                             //pour tout les personnages 
                JButton bt = new JButton();                                         //création d'un nouveau JButton          
                bt.setName(""+i);                                                   //définit le nom du bouton
                bt.addActionListener(new java.awt.event.ActionListener() {          //ajout d'un écouteur d'événement sur le JButton créé
                    public void actionPerformed(java.awt.event.ActionEvent evt) {   //événement lorsqu'on clique sur bt
                        boutonActionPerformed(evt);                                 //action à réaliser
                    }
                });
                Panneau.add(bt);                                                   //ajout du bouton au panneau
            }   
        this.pack();   
        this.repaint();
        this.setSize(1024, 720);
        }
    }//GEN-LAST:event_DemarrerActionPerformed

    private void testBatailleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBatailleActionPerformed
        //prérequis pour test
        Joueur j1 = new Joueur("JoueurTest0", "commun");
        j1.initPaquetTest1();
        Joueur j2 = new Joueur("JoueurTest1", "commun");
        j2.initPaquetTest2();
        this.joueurs.ajouteJoueur(j1);
        this.joueurs.ajouteJoueur(j2);
        
        bataille(true); //gestion de la bataille
    }//GEN-LAST:event_testBatailleActionPerformed

    private void testTransfertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTransfertActionPerformed
        //prérequis pour test
        Joueur j1 = new Joueur("JoueurTest0", "commun");
        j1.initPaquetTest1();
        Joueur j2 = new Joueur("JoueurTest1", "commun");
        j2.initPaquetTest2();
        this.joueurs.ajouteJoueur(j1);
        this.joueurs.ajouteJoueur(j2);
        
        transfert(true);    //gestion du transfert
    }//GEN-LAST:event_testTransfertActionPerformed

    private void RecommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecommencerActionPerformed
        NbPersosT.setText("Nb de personnages trouvés : "+0);    //réinitialise les compteurs
        NbPersosR.setText("Nb de personnages restant : "+0);    //réinitialise les compteurs
        JC.setText("Paramétrez pour rejouer");                  
        for(int i = 0; i < persos.getTaille()*2; i++){  
            JButton j = (JButton)Panneau.getComponent(i);   //récupère le composant i du panneau
            j.setEnabled(false);            //le désactive
            j.setIcon(null);                //efface l'image
        }
        this.joueurs = new LesJoueurs();    //nouvelle instance de LesJoueurs -> reinitialise ceux ci
        this.persos = new LesPersonnages(4);    //nouvelle instance de LesPersonnages -> reinitialise ceux ci
        this.indJ = 0;  //réinitialise l'indice du JC
        l1 = -1;
        c1 = -1;        //}réinitialise les positions
        l2 = -1;
        c2 = -1;
        Options.setEnabled(true);   
        AjoutJ.setEnabled(true);
        Edition.setText("");
        Demarrer.setEnabled(true);
    }//GEN-LAST:event_RecommencerActionPerformed

    private void boutonActionPerformed(java.awt.event.ActionEvent evt){
        JButton jb = (JButton)evt.getSource();  //récupération du bouton pressé 
        int nb = (Integer.parseInt(jb.getName()));  //converti le nom du bouton en numéro
        int c = nb%getPlateau().getNbcol(); //calcul le numéro de colonne
        int l = (int)(nb/getPlateau().getNbcol());  //calcule le numéro de ligne
        Personnage p = persos.getPerso(getPlateau().getCase(l, c)); //OK
        p.setImgBouton(jb);
        
        if(l1 == -1 && c1 == -1){
            l1 = l;
            c1 = c;
        }
        else 
            if(l2 == -1 && c2 == -1){
                l2 = l;
                c2 = c;
                startTimer();
        }    
    }
    
    public void startTimer(){
        Timer t = new Timer(500, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                verifPersos();
            }
        });
        t.setRepeats(false);
        t.start();
    }
    
    public void verifPersos(){
        Personnage p1 = persos.getPerso(getPlateau().getCase(l1, c1));
        Personnage p2 = persos.getPerso(getPlateau().getCase(l2, c2));
        if(p1.equals(p2)){
            nbPersosRestant --;
            String fam = p1.getFamille();
            int bonus = monJeu.traiteTour(monJeu.getJoueurCourant(), getPlateau().getCase(l1, c1));
            if(bonus >= 0){
                Edition.append("Bravo !\n"+monJeu.getJoueurCourant().getPseudo()+" a gagné tous les personnages de la famille "+fam+" !\n");
                switch(bonus) {
                    case 0: { classique(); }break;      //le joueur récupère tout les personnages de sa fam pref
                    case 1: { transfert(false); }break; //declenche la gestion transfert 
                    case 2: { bataille(false); }break;  //declenche la gestion bataille
                }
                bonus = -1; //réini le bonus
                monJeu.joueurSuivant(); //passe au joueur suivant 
                majAffTour();   //affiche le tour 
            }
            else{
                getPlateau().invalide(l1, c1, l2, c2);  //invalide les attributs de position
                isPlateauVide();    //vérifie si le plateau est vide
            }
            desactiveBt(l1, c1, l2, c2);    //désactive les boutons à ces positions
        }
        else{
            effaceImg(l1, c1, l2, c2);  //efface les images à ces positions
            monJeu.joueurSuivant(); //passe au joueur suviant
            majAffTour();   
        }
        l1 = -1;
        c1 = -1;
        l2 = -1;
        c2 = -1;
    }
    
    private void isPlateauVide(){
        if(getPlateau().jeuVide()){ 
            String res = "";    
            LesJoueurs jGagnants = joueurs.getGagnants();   //récupère le ou les joueur(s) gagant(s)
            if(jGagnants.getNbJoueurs() > 1){   
                res += "\nLes gagnants sont :"; 
                for(int i = 0; i < jGagnants.getNbJoueurs(); i++){
                    res += "\n"+jGagnants.getJoueur(i).getPseudo(); //ajoute à res le pseudo du gagnant 
                }
                res += "\nBien joué !"; 
                Edition.append(res);    //affiche res
            }
            else 
                Edition.append("\nLe gagnant est "+joueurs.getGagnants().getJoueur(0).getPseudo()+" !");    //affiche les gangants
        }
        else
            majAffTour();   
    }
    
    //si le joueur remporte toutes les cartes de sa famille préférée
    private void classique(){
        Edition.append("\n"+monJeu.getJoueurCourant().getPseudo()+" a gagné la partie !");  //affiche le gangant
        for(int i = 0; i < persos.getTaille()*2; i++){  //désactive tout les boutons du plateau de jeu
            JButton bt = (JButton)Panneau.getComponent(i);  //récupération du JButton i
            bt.setEnabled(false);   //désactivation du button i
        }
    }
    
    //gestion du transfert
    private void transfert(boolean test){
        TransfertDlg transf;        //déclare un attribut 
        if(!test)   //si on est en test, aucun jeu n'est défini -> erreur
            transf = new TransfertDlg(this, true, joueurs, monJeu.getIndC());   //créé une nouvelle instance avec JC
        else 
            transf = new TransfertDlg(this, true, joueurs, 0);  //créé une nouvelle instance sans JC
        transf.setSize(1200, 720);  //défini la taille de la fenetre    
        transf.setVisible(true);    //la rend visible
        if(transf.isOk()){
            Edition.append("\n"+transf.getTransfert().getDeroulement()+"\n");   //récupère le déroulement pour l'afficher
            //suite à
            Edition.append("-> mise à jour suite au transfert :\n"+joueurs.toString()); //montre les changements liés au transfert
            if(!test)   //si on est en test, aucun plateau n'est défini -> erreur
                isPlateauVide();    //on vérifie que le plateau est vide ou non à la suite du transfert
        }
        else
            Edition.append("\nAucun transfert n'a été effectué\n");
    }
    
    //gestion du transfert
    private void bataille(boolean test){
        BatailleDlg bat;    //déclare un attribut
        if(!test)
            bat = new BatailleDlg(this, true, this.joueurs, monJeu.getIndC());      //nouvelle instance avec JC
        else
            bat = new BatailleDlg(this, true, this.joueurs, 0); //nouvelle instance sans JC
        bat.setSize(1024, 768); //défini la taille de la boite de dial
        bat.setVisible(true);   //la rend visible   
        Edition.append("\n"+bat.getBataille().getDeroulement()+"\n");   //récupère le déroulement pour l'affihcer
        //suite à
        Edition.append("-> mise à jour suite à la bataille :\n"+joueurs.toString());    //montre changements liés bataille
        if(!test)   //si on est en test, aucun plateau n'est défini -> erreur
            isPlateauVide();    //on vérifie que le plateau est vide ou non à la suite du transfert
    }
    
    private void desactiveBt(int l1, int c1, int l2, int c2){
        JButton nc1 = (JButton)Panneau.getComponent((l1*getPlateau().getNbcol())+c1);
        JButton nc2 = (JButton)Panneau.getComponent((l2*getPlateau().getNbcol())+c2);
        nc1.setEnabled(false);
        nc2.setEnabled(false);
    }
    
    private void majAffTour(){
        JC.setText("C'est à "+monJeu.getJoueurCourant().getPseudo()+" de jouer !");
        NbPersosT.setText("Nb de personnages trouvés : "+monJeu.getJoueurCourant().getNbCartes());
        NbPersosR.setText("Nb de personnages restant : "+nbPersosRestant);
    }
    
    private void effaceImg(int l1, int c1, int l2, int c2){
        JButton nc1 = (JButton)Panneau.getComponent((l1*getPlateau().getNbcol())+c1);
        nc1.setIcon(null);
        JButton nc2 = (JButton)Panneau.getComponent((l2*getPlateau().getNbcol())+c2);
        nc2.setIcon(null);
    }
    
    
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
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JeuMemory jm = new JeuMemory();
                jm.setSize(1000,800);
                jm.setLocation(200, 0); // ordonnée et abscisse
                jm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AjoutJ;
    private javax.swing.JButton Demarrer;
    private javax.swing.JTextArea Edition;
    private javax.swing.JPanel Infos;
    private javax.swing.JLabel JC;
    private javax.swing.JLabel NbPersosR;
    private javax.swing.JLabel NbPersosT;
    private javax.swing.JMenuItem Options;
    private javax.swing.JPanel Panneau;
    private javax.swing.JButton Recommencer;
    private javax.swing.JMenu Settings;
    private javax.swing.JMenu Test;
    private javax.swing.JMenuItem VisuCartes;
    private javax.swing.JMenuItem VisuJoueurs;
    private javax.swing.JMenu Visualiser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem testBataille;
    private javax.swing.JMenuItem testTransfert;
    // End of variables declaration//GEN-END:variables
}
