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
    public void PrintUpper(){
        System.out.println("le nom");
        System.out.println(nom.toUpperCase());
        System.out.println("le prenom");
        System.out.println(prenom.toUpperCase());
    }
    public void setNom(String newNom){
        nom =newNom;
    }

    public void setPrenom(String newPrenom){
        prenom =newPrenom;
    }
    public void setAdresse(AdressePostale newAdresse){
        adresse =newAdresse;
    }

    public static AdressePostale getAdresse() {
        return adresse;
    }

    public static String getNom() {
        return nom;
    }

    public static String getPrenom() {
        return prenom;
    }

}
