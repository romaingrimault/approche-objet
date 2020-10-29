package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set =new HashSet<Double>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);
        System.out.println("Collection: ");
        System.out.println(set);
        Iterator itr = set.iterator();
        double save= 0;
        while (itr.hasNext()){
            double elem = (double) itr.next();
            if(save==0 && elem!=0)save=elem;
            else if(elem>save)save=elem;
        }
        System.out.println("la valeur la plus grande est:");
        System.out.println(save);
         itr = set.iterator();
         save= 0;
        while (itr.hasNext()){
            double elem = (double) itr.next();
            if(save==0 && elem!=0)save=elem;
            else if(elem<save)save=elem;
        }
        System.out.println("suppresion de :");
        System.out.println(save);
        set.remove(save);
        System.out.println(set);
    }

}
