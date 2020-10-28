package fr.diginamic.banque.entites;

public class Compte {
    private int numeroCompte;
    private double soldeCompte;

    public Compte(int newNumeroCompte,int newSolde) {
        this.numeroCompte=newNumeroCompte;
        this.soldeCompte=newSolde;
    }
}
