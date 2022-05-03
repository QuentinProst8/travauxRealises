package memory;

import java.util.ArrayList;

public class LesPersonnages {
    
    private ArrayList<Personnage> persos;

    public ArrayList<Personnage> getPersos() {
        return persos;
    }
    
    public LesPersonnages() { this.persos = new ArrayList<Personnage>(); }
         
    public int getTaille() { return this.persos.size();  }
    
    public void clearPersonnages(){ persos.clear(); }
    
    public int getScore()
    { 
        int sc = 0;
        for(int i=0; i<getTaille(); i++)
           sc+=getPerso(i).getValeur();
        return sc;
    }
          
    public Personnage getPerso(int i){
        if (i>=0 && i<getTaille())
             return this.persos.get(i);
        return null;
    }
    
    public void ajoutePerso(Personnage c){  persos.add(c);    }

    //ajoute à la collection toutes les persos de la collection lc
    public void ajoutePersos(LesPersonnages lc)
    { 
        for(int i=0; i<lc.getTaille(); i++)
          persos.add(lc.getPerso(i));
    }

   public void retirePerso(Personnage p)
    { 
        int i=0; 
        boolean trouve = false;
        while(i<getTaille() && !trouve){
          if (getPerso(i).getNom().equals(p.getNom())){
              this.persos.remove(i);  
              trouve = true;
          }
          else i++;
        }      
    }

    //supprime de la collection toutes les persos de la famille f
    // et renvoie la colection de persos retirées
    public LesPersonnages retirePersosFamille(String f)
    { 
        LesPersonnages lcr = new LesPersonnages();
        int i = 0;
        while(i<getTaille()){
            if (getPerso(i).getFamille().equals(f)) {
                lcr.ajoutePerso(getPerso(i));
                this.persos.remove(i);  
            }
            else i++;
        }
        return lcr;
    }

    // renvoie tous les personnages d'une famille donnée en paramètre
    public LesPersonnages getPersosFamille(String f)
    { 
        LesPersonnages lp = new LesPersonnages();
        for(int i=0; i<getTaille(); i++)
            if(getPerso(i).getFamille().equals(f))
                lp.ajoutePerso(getPerso(i));
        return lp;
    }

    public void retirePersos()
    { 
           persos.clear();
    }
    
    @Override
    public String toString() {
        String s = "";
        for(int i=0; i<getTaille(); i++)
            s+=i+"- "+getPerso(i)+"\n";
       return s;
    }

    public ArrayList<String> getFamilles()
    { ArrayList<String> lst = new ArrayList<String>();
        for (int j=0; j<this.persos.size(); j++)
        { Personnage p = this.persos.get(j);
            boolean trouve = false;
            for (int i=0; i< lst.size(); i++)
                if (lst.get(i).equals(p.getFamille()))
                    trouve = true;
            if (!trouve) lst.add(p.getFamille());     
        }
        return lst;
    }
  
    public LesPersonnages(int nc) {
        this.persos = new ArrayList<Personnage>();
        if (nc >= 4){ // 2 familles
            ajoutePerso(new Personnage("communs", "assault-trooper", 10));
            ajoutePerso(new Personnage("communs", "commando", 20));
            ajoutePerso(new Personnage("rares", "absolute-zero", 10));
            ajoutePerso(new Personnage("rares", "arctice-assassin", 20));
        }
        if (nc >= 10){ // 4 familles
            ajoutePerso(new Personnage("epiques", "burnout", 20));
            ajoutePerso(new Personnage("epiques", "funk-ops", 30));
            
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-can", 20));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace", 10));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-can", 20));
        }
        if (nc >= 18){ // 6 familles

            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-chn", 30));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-chn", 30));
            ajoutePerso(new Personnage("legendaires", "power-chord", 10));
            ajoutePerso(new Personnage("legendaires", "raptor", 20));
            ajoutePerso(new Personnage("legendaires", "raven", 30));
            ajoutePerso(new Personnage("communs", "devestrator", 30));
            ajoutePerso(new Personnage("rares", "brawler", 30));
            ajoutePerso(new Personnage("epiques", "rex", 30));
        }
        if (nc == 32){ // 6 familles
            ajoutePerso(new Personnage("communs", "dominator", 40));
            ajoutePerso(new Personnage("communs", "highrise-assault-trooper", 50));
            ajoutePerso(new Personnage("communs", "jungle-scout", 60));
            ajoutePerso(new Personnage("communs", "pathfinder", 70));
            ajoutePerso(new Personnage("rares", "brilliant-striker", 40));
            ajoutePerso(new Personnage("rares", "brite-bomber", 50));
            ajoutePerso(new Personnage("rares", "circuit-breaker", 60));
            ajoutePerso(new Personnage("rares", "dazzle", 70));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-fra", 40));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-gbr", 50));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-fra", 40));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-gbr", 50));
            ajoutePerso(new Personnage("legendaires", "red-knight", 40));
            ajoutePerso(new Personnage("epiques", "shadow-ops", 40));
        }
    }
     


}
