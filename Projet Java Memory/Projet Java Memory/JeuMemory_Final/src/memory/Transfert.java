package memory;

public class Transfert extends Action{
    private Joueur cible;
    private String fp;
    private LesPersonnages cartesTrans;
    
    public Joueur getCible(){
        return this.cible;
    }
    
    public LesPersonnages getCartesTrans(){
        return this.cartesTrans;
    }
    
    
    public Transfert(Joueur jc, Joueur c, String fc){
        super(jc, "Transfert");
        this.cible = c;
        this.fp = fc;
        cartesTrans = new LesPersonnages();
    }
    
    public int execute(){
        if(this.fp != null){
            cartesTrans = cible.getPaquet().getPersosFamille(fp);   //on récupère les cartes du joueur cible correpondant à la famille fp
            cible.getPaquet().retirePersosFamille(fp);      //on retire ces cartes du paquet du joueur cible
            getJ().getPaquet().ajoutePersos(cartesTrans);   //on ajoute ces mêmes cartes au paquet du joueur courant
            this.setDeroulement(getJ().getPseudo()+" a prit les cartes "+fp+" du joueur "+cible.getPseudo());   //puis on défini le déroulement
        }
        return cartesTrans.getTaille(); //on retourne le nombre de cartes transférées
    }
}
