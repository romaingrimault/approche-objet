package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse_1 =new AdressePostale(13,"rue Frédéric Chopin","53200","Château-Gontier-Sur-Mayenne");
        AdressePostale adresse_2 =new AdressePostale(28,"rue Pierre et Marie Curie","53400","Craon");

        Personne personne_1=new Personne("Grimault","Romain",adresse_1);
        Personne personne_2=new Personne("Girard","Claire",adresse_2);


    }
}
