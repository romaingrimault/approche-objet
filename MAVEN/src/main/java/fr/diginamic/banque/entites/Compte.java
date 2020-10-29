package fr.diginamic.banque.entites;

public class Compte {
    private int numeroCompte;
    private double soldeCompte;
    public Compte(){}
    public Compte(int newNumeroCompte,double newSolde) {
        this.numeroCompte=newNumeroCompte;
        this.soldeCompte=newSolde;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public String toString(){
        return "Numéro de compte: "+this.numeroCompte+", Solde du compte: "+this.soldeCompte;
    }
}
