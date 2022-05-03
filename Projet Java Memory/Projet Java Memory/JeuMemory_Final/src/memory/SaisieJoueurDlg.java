package memory;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SaisieJoueurDlg extends javax.swing.JDialog {
    private Joueur jc;
    private boolean ok;
    private ImageIcon photo;
    private LesPersonnages lp;
    
    public SaisieJoueurDlg(java.awt.Frame parent, boolean modal, LesPersonnages lst) {
        super(parent, modal);
        initComponents();
        jc=null;
        ok=false;
        lp=lst;
        setLocation(800,200);
        setSize(600,400);
        initListeFamilles();
    }
    
    public boolean isOk() { return this.ok; }
    public Joueur getJoueur() { return jc; }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pseudo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeFamilles = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Parcourir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Photo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Valider = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Donnez votre pseudo :");
        jPanel3.add(jLabel2, java.awt.BorderLayout.NORTH);
        jPanel3.add(Pseudo, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Quelle est votre famille  préférée de personnages ?");
        jPanel4.add(jLabel3, java.awt.BorderLayout.NORTH);

        ListeFamilles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "communs", "epiques", "legendaires", "alpins-femmes", "as-des-pistes" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListeFamilles);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("Choisissez une photo :");
        jPanel5.add(jLabel4, java.awt.BorderLayout.NORTH);

        Parcourir.setText("Parcourir");
        Parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcourirActionPerformed(evt);
            }
        });
        jPanel5.add(Parcourir, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2);

        jPanel6.setLayout(new java.awt.BorderLayout());
        jPanel6.add(Photo, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        jPanel7.add(Annuler);

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        jPanel7.add(Valider);

        jPanel6.add(jPanel7, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Créez votre joueur !");
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initListeFamilles()
    {
        ArrayList<String> lf=lp.getFamilles();
        DefaultListModel mod= new DefaultListModel();
        ListeFamilles.setModel(mod);
        for(int i=0; i<lf.size(); i++)
            mod.addElement(lf.get(i));
    }
    private void ParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcourirActionPerformed
        JFileChooser jf= new JFileChooser();
        if (jf.showOpenDialog(this)== JFileChooser.APPROVE_OPTION)
        { 
            String path = jf.getSelectedFile().getPath(); 
            Image img=Toolkit.getDefaultToolkit().getImage(path);
            img=img.getScaledInstance(Photo.getWidth()-10, Photo.getHeight()-10, Image.SCALE_DEFAULT);
            photo = new ImageIcon(img);
            Photo.setIcon(photo);
        } 
    }//GEN-LAST:event_ParcourirActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        if (!Pseudo.getText().equals("") && ListeFamilles.getSelectedValue()!=null)
        {   
            ok=true;
            jc = new Joueur(Pseudo.getText(), ListeFamilles.getSelectedValue());
            if (photo!=null) 
                jc.setPhoto(photo);
            setVisible(false);
            dispose();
        }
        else
            Pseudo.setText("Veuillez saisir un pseudo et une famille de personnage");
    }//GEN-LAST:event_ValiderActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JList<String> ListeFamilles;
    private javax.swing.JButton Parcourir;
    private javax.swing.JButton Photo;
    private javax.swing.JTextField Pseudo;
    private javax.swing.JButton Valider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
