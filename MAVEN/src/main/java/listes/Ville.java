package listes;

public class Ville {
    private String nom;
    private int nbHabitant;

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public Ville() {
    }

    public Ville(String nom, int nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    public String toString(){
        return "Ville: "+this.getNom()+ " nombre d'habitant:"+getNbHabitant();
    }
}
