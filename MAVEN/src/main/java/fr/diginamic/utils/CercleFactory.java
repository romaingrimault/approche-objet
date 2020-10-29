package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

    public Cercle createCercle(double rayon){
        Cercle cercle=new Cercle(rayon);
        return cercle;
    }
}
