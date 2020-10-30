package sets;

public class Pays {
    private String nom;
    private int nbHabitant;
    private double pibHabitant;

    public Pays() {
    }

    public Pays(String nom) {
        this.nom = nom;
    }

    public Pays(String nom, int nbHabitant, double pibHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.pibHabitant = pibHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    public double getPibHabitant() {
        return pibHabitant;
    }

    public void setPibHabitant(double pibHabitant) {
        this.pibHabitant = pibHabitant;
    }
    public double calculPib(){
        double ret=this.nbHabitant*this.pibHabitant;
        return ret;
    }

    @Override
    public String toString() {
        return  "nom='" + nom + '\'' +
                ", nbHabitant=" + nbHabitant +
                ", pibHabitant=" + pibHabitant ;
    }

}
