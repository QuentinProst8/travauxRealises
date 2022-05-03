package memory;

public class Bataille extends Action{
    private Joueur adversaire;

    public Joueur getAdversaire() {
        return adversaire;
    }

    public void setAdversaire(Joueur adversaire) {
        this.adversaire = adversaire;
    }
    
    public Bataille(Joueur sc, Joueur a){
        super(sc, "Bataille");
        this.adversaire = a;
    }
    
    public int execute(){
        int res = -1;
        if(adversaire.getPaquet().getTaille() > 0 && getJ().getPaquet().getTaille() > 0){
           Personnage c1 = getJ().getPaquet().getPerso(0);  //référence le perso d'indice 0 dans une nouvelle instance
           Personnage c2 = adversaire.getPaquet().getPerso(0);  //pareil avec le paquet de l'adversaire
           getJ().getPaquet().retirePerso(c1);      //retire ce perso
           adversaire.getPaquet().retirePerso(c2);  //retire le perso
           if(c1.getValeur() == c2.getValeur()){    //égalité
               res = 0;
               getJ().getPaquet().ajoutePerso(c1);              //réajoute le perso 
               adversaire.getPaquet().ajoutePerso(c2);          //réajoute le perso
           }
           else{
                if(c1.getValeur() > c2.getValeur()) {       //jc gagne
                    res = 1;
                    getJ().getPaquet().ajoutePerso(c1); //ajoute les deux persos à jc
                    getJ().getPaquet().ajoutePerso(c2);
                }
                else {  //adversaire gagne
                    res = 2;
                    adversaire.getPaquet().ajoutePerso(c1); //ajoute les deux persos à l'adversaire
                    adversaire.getPaquet().ajoutePerso(c2);
                }
           }
        }
        if(adversaire.getPaquet().getTaille() == 0 || getJ().getPaquet().getTaille() == 0){ //quand un joueur n'a plus de carte
            if(adversaire.getPaquet().getTaille() == 0 && getJ().getPaquet().getTaille() > 0)   
                this.setDeroulement("Bataille : "+getJ().getPseudo()+" a gagné contre "+adversaire.getPseudo());    //jc gagne
            else
                this.setDeroulement("Bataille : "+getJ().getPseudo()+" a perdu contre "+adversaire.getPseudo());    //adversaire gagne
        }
        return res;
    } 
}
