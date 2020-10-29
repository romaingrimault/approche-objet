package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte unCompte = new Compte(5589647,100_000);
        System.out.println(unCompte.toString()); // affiche le package + l'id du compte?
    }
}
