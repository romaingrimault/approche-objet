package listes;

import java.util.ArrayList;

public class CreationListes {
    public static void main(String[] args) {
        ArrayList<Integer> nombres=new  ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            nombres.add(i);
        }

        System.out.println("La taille de la list: "+nombres.size());
    }
}
