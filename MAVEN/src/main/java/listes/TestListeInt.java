package listes;

import java.util.ArrayList;

import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(-1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(8);
        list.add(5);
        System.out.println(list);
        System.out.println("taille: "+list.size());
        System.out.println("chiffre max: "+Collections.max(list));
        System.out.println("suppression de "+Collections.min(list));
        list.remove(list.indexOf(Collections.min(list)));
        System.out.println("Nouvelle liste: ");
        System.out.println(list);

        System.out.println("transformation des éléments negatif en positif");
        for (int i = 0; i < list.size(); i++) {
            int elem=list.get(i);
            if(elem <0) {
                elem=elem*(-1);
                list.set(i, elem);
            };
        }
        System.out.println(list);

    }
}
