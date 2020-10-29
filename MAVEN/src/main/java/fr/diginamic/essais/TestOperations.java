package fr.diginamic.essais;

import fr.diginamic.operations.Opertions;

public class TestOperations {
    public static void main(String[] args) {
        Opertions opertions=new Opertions();
        System.out.println(opertions.calcul(5,5,'+'));
        System.out.println(opertions.calcul(5,5,'-'));
        System.out.println(opertions.calcul(5,5,'*'));
        System.out.println(opertions.calcul(5,5,'/'));
    }

}
