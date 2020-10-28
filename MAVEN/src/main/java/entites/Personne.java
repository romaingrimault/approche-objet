package entites;

public class Personne {
    static String nom;
    static String prenom;
    static AdressePostale adresse;
    public Personne(String newNom,String newPrenom,AdressePostale newAdresse){
        nom = newNom;
        prenom = newPrenom;
        adresse = newAdresse;
    }
}
