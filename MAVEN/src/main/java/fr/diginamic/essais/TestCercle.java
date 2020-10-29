package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        Cercle premierCercle= new Cercle(5);
        Cercle secondCercle= new Cercle(10);
        System.out.println("perimètre cercle 1 = "+premierCercle.calculPerimetre());
        System.out.println("perimètre cercle 2 = "+secondCercle.calculPerimetre());
        System.out.println("surface premier cercle = "+premierCercle.calculSurface());
        System.out.println("surface second cercle = "+secondCercle.calculSurface());
        CercleFactory factory = new CercleFactory();
        factory.createCercle(5);
    }
}
