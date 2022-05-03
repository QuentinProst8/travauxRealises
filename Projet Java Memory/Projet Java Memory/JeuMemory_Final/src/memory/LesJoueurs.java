package memory;

import java.util.ArrayList;
import javax.swing.*;

public class LesJoueurs {
    private ArrayList<Joueur> lstJ;

    public LesJoueurs(){
        lstJ=new ArrayList<Joueur>();
    }

    public ArrayList<Joueur> getJoueurs() {  return lstJ;    }

    public Joueur getJoueur(int i) {  return lstJ.get(i);    }

    public int getIndiceJoueur(Joueur j) { return lstJ.indexOf(j); }

    public int getNbJoueurs(){ return lstJ.size();}

    public void ajouteJoueur(Joueur j) { lstJ.add(j);}

    public Joueur rechJoueur(String p){
      Joueur j=null;
      for(int i=0; i<this.getNbJoueurs(); i++)
          if (lstJ.get(i).getPseudo().equals(p))
              j=lstJ.get(i);
       return j;
    }

    public void supprimeJoueur(Joueur j){
        for(int i=0; i<this.getNbJoueurs(); i++)
          if (lstJ.get(i).equals(j))
             lstJ.remove(i);
    }
    
    public void clearJoueur(){
        lstJ.clear();
    }

    // renvoie la iste des joueurs qui ont obtenu le score mamimum
    public LesJoueurs getGagnants(){   
        // recherche du score maximum
        int max=this.getJoueur(0).getScore();
        for(int i=1; i<this.getNbJoueurs();i++)
            if (this.getJoueur(i).getScore()>max)
                max=this.getJoueur(i).getScore();
        // recherhe des joueurs ayant ce maximum
        LesJoueurs lst=new LesJoueurs();
        for(int i=0; i<this.getNbJoueurs();i++)
            if (this.getJoueur(i).getScore()==max)
                lst.ajouteJoueur(this.getJoueur(i));
        return lst;
    }

    public String toString(){
        String res="";
        for(int i=0; i<this.getNbJoueurs();i++)
            res+=(i+1)+" "+this.getJoueur(i)+"\n";
        return res;
    }
}

