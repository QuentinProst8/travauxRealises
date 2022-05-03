package memory;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;

 public class Personnage {
    private String famille;
    private String nom;
    private int valeur;
    private Image photo;

    public Image getPhoto() { return this.photo;}
      
    public void setPhoto(Image p) { this.photo = p; }

    public Personnage() {
        this.famille = "anonyme";
        this.nom = "anonyme";
        this.valeur= 0;
        this.photo = new ImageIcon(getClass().getResource("/memory/img/anonyme.png")).getImage();
    }
    
    public Personnage(String famille, String nom, int v) {
        this.famille = famille;
        this.nom = nom;
        this.valeur= v;
        this.photo = new ImageIcon(getClass().getResource("/memory/img/"+nom+".jpg")).getImage();
    }
    
    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

      public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setImgBouton(JButton jb) {
        Image img = photo.getScaledInstance(jb.getWidth(), jb.getHeight(), Image.SCALE_SMOOTH);  
        jb.setIcon(new ImageIcon(img));
    }
    
    @Override
    public String toString() {
        return nom+ " de la famille " + famille +", valeur : "+valeur;
    }
    
 }