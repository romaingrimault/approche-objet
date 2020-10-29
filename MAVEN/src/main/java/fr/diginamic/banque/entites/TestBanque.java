package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte unCompte = new Compte(5589647,100_000);
        System.out.println(unCompte.toString()); // affiche le package + l'id mémoire du compte depuis réécriture affiche les infos du compte
        CompteTaux compteTaux = new CompteTaux(564897,10_000,0.5);
        System.out.println( compteTaux.toString());
        Compte[] arrayCompte=new Compte[5];
        arrayCompte[0]=unCompte;
        arrayCompte[1]=compteTaux;
        for (Compte compte :
             arrayCompte) {
           if (compte!=null)System.out.println(compte.toString());
        }
    }
}
