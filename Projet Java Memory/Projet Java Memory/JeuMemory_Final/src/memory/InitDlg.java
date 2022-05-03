package memory;

import java.awt.*;
import javax.swing.*;

public class InitDlg extends javax.swing.JDialog {
    private int nc; // taille choisie
    private LesJoueurs lj; // joueurs choisis
    private boolean ok;

    public int getNc() {
        return nc;
    }

    public LesJoueurs getLj() {
        return lj;
    }

    public boolean isOk() {
        return ok;
    }
    
    public InitDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nc = 4;     //par défaut on le défini sur 4
        lj = new LesJoueurs();  //créé une nouvelle instance de joueur
        ok = false;
        this.setSize(900,600);
        this.setTitle("Paramètres");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Valider = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        RadioEnfant = new javax.swing.JRadioButton();
        RadioDebutant = new javax.swing.JRadioButton();
        RadioAvance = new javax.swing.JRadioButton();
        RadioExpert = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Joueurs = new javax.swing.JPanel();
        CaseLara = new javax.swing.JCheckBox();
        CaseJack = new javax.swing.JCheckBox();
        CaseJean = new javax.swing.JCheckBox();
        caseAmadeus = new javax.swing.JCheckBox();
        InfosJoueur = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        Photo = new javax.swing.JPanel();
        BPhoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        jPanel2.add(Annuler);

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        jPanel2.add(Valider);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(4, 1));

        buttonGroup1.add(RadioEnfant);
        RadioEnfant.setSelected(true);
        RadioEnfant.setText("enfant (4 personnages, 2 familles)");
        RadioEnfant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioEnfantActionPerformed(evt);
            }
        });
        jPanel1.add(RadioEnfant);

        buttonGroup1.add(RadioDebutant);
        RadioDebutant.setText("débutant (10 personnages, 4 familles)");
        RadioDebutant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioDebutantActionPerformed(evt);
            }
        });
        jPanel1.add(RadioDebutant);

        buttonGroup1.add(RadioAvance);
        RadioAvance.setText("avancé  (18 personnages, 6 familles)");
        RadioAvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAvanceActionPerformed(evt);
            }
        });
        jPanel1.add(RadioAvance);

        buttonGroup1.add(RadioExpert);
        RadioExpert.setText("expert  (32 personnages, 6 familles)");
        RadioExpert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioExpertActionPerformed(evt);
            }
        });
        jPanel1.add(RadioExpert);

        jPanel4.add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choisissez la taille du jeu");
        jPanel4.add(jLabel1, java.awt.BorderLayout.NORTH);
        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel3.add(jPanel4);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choisissez les joueurs créés par défaut");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel2, java.awt.BorderLayout.NORTH);

        Joueurs.setLayout(new java.awt.GridLayout(4, 1));

        CaseLara.setText("Lara");
        CaseLara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaseLaraActionPerformed(evt);
            }
        });
        Joueurs.add(CaseLara);

        CaseJack.setText("Jack");
        CaseJack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaseJackActionPerformed(evt);
            }
        });
        Joueurs.add(CaseJack);

        CaseJean.setText("Jean-Sébastien");
        CaseJean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaseJeanActionPerformed(evt);
            }
        });
        Joueurs.add(CaseJean);

        caseAmadeus.setText("Amadeus");
        caseAmadeus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseAmadeusActionPerformed(evt);
            }
        });
        Joueurs.add(caseAmadeus);

        jPanel5.add(Joueurs, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        InfosJoueur.setLayout(new java.awt.GridLayout(2, 0));

        Edition.setColumns(20);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        InfosJoueur.add(jScrollPane1);

        Photo.setLayout(new java.awt.GridLayout(1, 0, 1, 0));
        Photo.add(BPhoto);

        InfosJoueur.add(Photo);

        getContentPane().add(InfosJoueur, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioDebutantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDebutantActionPerformed
        nc = 10;
    }//GEN-LAST:event_RadioDebutantActionPerformed

    private void RadioAvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAvanceActionPerformed
        nc = 18;
    }//GEN-LAST:event_RadioAvanceActionPerformed

    private void RadioExpertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioExpertActionPerformed
        nc = 32;
    }//GEN-LAST:event_RadioExpertActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        if (CaseLara.isSelected()){ //si le radio button a été coché
            Joueur j=new Joueur("Lara", "epiques"); //Nouvelle instance de joueur 
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/lara.jpg"))); //défini la photo du joueur
            lj.ajouteJoueur(j); //ajoute le joueur à la liste
        }
        if (CaseJack.isSelected()){
            Joueur j=new Joueur("Jack", "rares");
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/jack.png"))); 
            lj.ajouteJoueur(j);
        }
        if (CaseJean.isSelected()){
            Joueur j=new Joueur("Jean-Sébastien", "alpins-femmes");
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/bach.jpg"))); 
            lj.ajouteJoueur(j);
        }
         if (caseAmadeus.isSelected()){
            Joueur j=new Joueur("Amadeus", "communs");
            j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/mozart.jpg"))); 
            lj.ajouteJoueur(j);
        }   
        ok = true;
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ValiderActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void RadioEnfantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioEnfantActionPerformed
        nc = 4;
    }//GEN-LAST:event_RadioEnfantActionPerformed

    private void CaseLaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaseLaraActionPerformed
        Joueur j=new Joueur("Lara", "épiques");  //nouvelle instance de joueur
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/lara.jpg")));  //défini la photo du joueur
        Edition.setText(j.toString());  //affiche ses infos dans la JTextArea
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH); //récupère l'image du joueur
        BPhoto.setIcon(new ImageIcon(img)); //affiche l'image du joueur
    }//GEN-LAST:event_CaseLaraActionPerformed

    private void CaseJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaseJackActionPerformed
        Joueur j=new Joueur("Jack", "rares");
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/jack.png"))); 
        Edition.setText(j.toString());
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH);
        BPhoto.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_CaseJackActionPerformed

    private void CaseJeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaseJeanActionPerformed
         Joueur j=new Joueur("Jean-Sébastien", "alpins-femmes");
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/bach.jpg"))); 
        Edition.setText(j.toString());
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH);
        BPhoto.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_CaseJeanActionPerformed

    private void caseAmadeusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseAmadeusActionPerformed
        Joueur j=new Joueur("Amadeus", "communs");
        j.setPhoto(new ImageIcon(getClass().getResource("/memory/img/mozart.jpg"))); 
        Edition.setText(j.toString());
        Image img = j.getPhoto().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH);
        BPhoto.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_caseAmadeusActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JButton BPhoto;
    private javax.swing.JCheckBox CaseJack;
    private javax.swing.JCheckBox CaseJean;
    private javax.swing.JCheckBox CaseLara;
    private javax.swing.JTextArea Edition;
    private javax.swing.JPanel InfosJoueur;
    private javax.swing.JPanel Joueurs;
    private javax.swing.JPanel Photo;
    private javax.swing.JRadioButton RadioAvance;
    private javax.swing.JRadioButton RadioDebutant;
    private javax.swing.JRadioButton RadioEnfant;
    private javax.swing.JRadioButton RadioExpert;
    private javax.swing.JButton Valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox caseAmadeus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
