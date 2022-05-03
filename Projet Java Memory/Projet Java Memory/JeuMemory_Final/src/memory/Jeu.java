/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author quentinprost
 */
class Jeu {
    private LesPersonnages lesPers;
    private PlateauJeu monP; 
    private LesJoueurs lesJ; 
    private int indC;
    
    public Jeu(LesPersonnages lp, LesJoueurs lj, int nbc) { 
        this.lesPers=lp;
        this.monP = new PlateauJeu(nbc); 
        this.lesJ = lj;
        this.indC = 0;
    }

    public LesPersonnages getLesPers() {
        return lesPers;
    }

    public PlateauJeu getMonP() {
        return monP;
    }

    public LesJoueurs getLesJ() {
        return lesJ;
    }

    public int getIndC() {
        return indC;
    }
    
    public void joueurSuivant(){
        if(indC >= lesJ.getNbJoueurs()-1)
            indC = 0;
        else
            indC++;
    }

    public void setIndC(int indC) {
            this.indC = indC;
    }
    
    public int getIndSuivant(int j){ 
        return (j+1)%lesJ.getNbJoueurs(); 
    }
    
    public Joueur getJoueurCourant(){
        return lesJ.getJoueur(indC);
    }
    
    public Joueur getJoueurSuivant(int j){ 
        return lesJ.getJoueur(getIndSuivant(j)); 
    }

    public boolean finJeu() { 
        return monP.jeuVide();
    }
    
    public int nbPers(){ 
        int n = 0;
        for(int i = 0; i < lesJ.getNbJoueurs(); i++)
            if (i != this.indC) 
                n += lesJ.getJoueur(i).getNbCartes();
        return n; 
    }
    
    public int traiteTour(Joueur jc, int s){
        int bonus = -1;
        Personnage pers = lesPers.getPerso(s);
        jc.ajoutePersoPaquet(pers);
        String f = pers.getFamille();
        int npf = lesPers.getPersosFamille(f).getTaille();
        int nbj = jc.getPaquet().getPersosFamille(f).getTaille();
        if(npf == nbj){
            if(f.equals(jc.getFamillePref())){
                bonus = 0;
                monP.termineJeu();
            }
            else{
                if(nbPers() > 0){
                    if(f.equals("rares") || f.equals("communs"))
                        bonus = 1;
                    else{
                        if(f.equals("legendaires") || f.equals("epiques"))
                            bonus = 2;
                        else
                            bonus = 3;
                    }
                }
            }
        }
        return bonus;
    }
}
