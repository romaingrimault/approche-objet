package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    float tauxRemuneration;
    public  CompteTaux(){}
    public  CompteTaux(float newTauxRemuneration,int newNumCompte,double soldeCompte){
        super(newNumCompte,soldeCompte);
        this.tauxRemuneration=newTauxRemuneration;
    }
    public String toString(){
        return super.toString()+", taux de remuneration: "+this.tauxRemuneration;
    }
}
