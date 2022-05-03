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
class PlateauJeu {
    private int tab[][];
    private int nbp;
    private int nblig;
    private int nbcol;
    
    public PlateauJeu(int n){
        this.nbp = n;
        this.nblig = (int)(Math.sqrt(nbp*2));
        this.nbcol = (nbp*2)/nblig;
        this.tab = new int[this.nblig][this.nbcol]; 
        System.out.println("nb ligne : "+nblig);
        System.out.println("nb colonne :"+nbcol);
        initPlateauJeu();
        for(int i=0; i < nblig;i++){
            for(int j=0; j < nbcol; j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public PlateauJeu() { this(4); }
    
    public int getNblig() { return this.nblig; } 
    
    public int getNbcol() { return this.nbcol; } 
    
    public int getNbp() { return this.nbp; }
    
    public int getCase(int l, int c) { 
        return tab[l][c]; 
    } 
    
    public int getNbc() { 
        return this.nblig*this.nbcol/2; 
    }
    
    public void initPlateauJeu(){
        int k=0;
        for(int i=0; i<this.nblig; i++)
            for(int j=0; j<this.nbcol; j++) 
                tab[i][j]=(k++)%this.nbp;
        melange(); 
    }
    
    public void invalide(int l1, int c1, int l2, int c2) {
        tab[l1][c1]=-1; 
        tab[l2][c2]=-1; 
        nbp--;
    }
    
    public void melange(){
       int l1, c1, l2, c2;
       for(int i = 0; i < 1000; i++){
           l1 = (int)(Math.random()*nblig);
           l2 = (int)(Math.random()*nblig);
           c1 = (int)(Math.random()*nbcol);
           c2 = (int)(Math.random()*nbcol);
           int temp = tab[l1][c1];
           tab[l1][c1] = tab[l2][c2];
           tab[l2][c2] = temp;
       }
    }
    
    public boolean estValide(int l, int c){
        return tab[l][c] != -1;
    }
    
    public boolean jeuVide(){
        return nbp <= 0;
    }
    
    public void termineJeu(){
        for(int i = 0; i < this.nblig; i++)
            for(int j =0; j < this.nbcol; j++)
                tab[i][j] = -1;
        nbp = 0;
    }
}
