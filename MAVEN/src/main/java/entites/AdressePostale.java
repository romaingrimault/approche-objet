package entites;

public class AdressePostale {
    static int numeroDeRue;
    static String libelle;
    static String codePostal;
    static String ville;
    public AdressePostale(int newNumero,String newLibelle,String newCode,String newVille){
        numeroDeRue = newNumero;
        libelle = newLibelle;
        codePostal = newCode;
        ville = newVille;
    }
}
