package fr.diginamic.lesInterfaces.essais;

import fr.diginamic.lesInterfaces.entities.Cercles;
import fr.diginamic.lesInterfaces.entities.ObjetGeometrique;
import fr.diginamic.lesInterfaces.entities.Rectangles;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] array=new ObjetGeometrique[2];
        Cercles cercles= new Cercles();
        Rectangles rectangles = new Rectangles();
        array[0]=cercles;
        array[1]=rectangles;
        for (ObjetGeometrique objet :
                array) {
            System.out.println(objet.perimetre());
            System.out.println(objet.surface());
        }
    }
}
