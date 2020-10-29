package fr.diginamic.banque.entites;

public class Compte {
    private int numeroCompte;
    private double soldeCompte;

    public Compte(int newNumeroCompte,int newSolde) {
        this.numeroCompte=newNumeroCompte;
        this.soldeCompte=newSolde;
    }
    public String toString(){
        return "Numéro de compte: "+this.numeroCompte+", Solde du compte: "+this.soldeCompte;
    }
}
