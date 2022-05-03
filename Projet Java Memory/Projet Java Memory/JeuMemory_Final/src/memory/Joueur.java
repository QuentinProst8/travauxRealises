
package memory;

import java.awt.*;
import javax.swing.*;


public class Joueur {
    private String pseudo;
    private String famillePref;
    private LesPersonnages paquet;
    private ImageIcon photo;

    public void initPaquetTest1(){
        ajoutePersoPaquet(new Personnage("communs", "assault-trooper", 10));
        ajoutePersoPaquet(new Personnage("communs", "commando", 20));
        ajoutePersoPaquet(new Personnage("rares", "absolute-zero", 10));
    } 
    
    public void initPaquetTest2(){
        ajoutePersoPaquet(new Personnage("epiques", "burnout", 20));
        ajoutePersoPaquet(new Personnage("epiques", "funk-ops", 30));
        ajoutePersoPaquet(new Personnage("alpins-femmes", "mogul-master", 10));  
    } 
            
    public String getFamillePref() {
        return famillePref;
    }  
    
    public String getPseudo() { 
        return this.pseudo;  
    }
    public int getNbCartes() { 
        return this.paquet.getTaille();  
    }
    public LesPersonnages getPaquet() {  
        return paquet;   
    }
    public ImageIcon getPhoto() { return this.photo;
    }   
    public void setPseudo(String p) { 
        this.pseudo=p; 
    }
    public void setPhoto(ImageIcon p) { 
        this.photo = p; 
    }
    public void ajoutePersoPaquet(Personnage p) {
        this.paquet.ajoutePerso(p);
    }
    
    public void setPaquet(LesPersonnages paquet) {
        this.paquet = paquet;
    }
   
   public Joueur(String p, String f) {
        this.pseudo = p;
        this.famillePref = f;
        this.paquet= new LesPersonnages();
        this.photo = new ImageIcon(getClass().getResource("/memory/img/joueurDefaut.png"));
    }
   
   public int getScore(){
       return paquet.getScore();
   }

    public boolean equals(Joueur j){  
        return this.getPseudo().equals(j.getPseudo()); 
    }
    
    public String toString() {
        String res= "Joueur " + this.pseudo +
                "\nfamille préférée : "+ famillePref +
                "\nen possession des personnages :\n" + paquet
                + "score : "+this.getScore();
        return res;
    }
}
