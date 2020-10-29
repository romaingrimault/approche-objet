package fr.diginamic.entites;

public class Cercle {
    private double rayon;

    public Cercle() {
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    public double calculPerimetre(){
        double perimetre=2*3.14159265359*this.rayon;
        return perimetre;
    }
    public double calculSurface(){
        double surface= (this.rayon*this.rayon)*3.14159265359;
        return surface;
    }
}
