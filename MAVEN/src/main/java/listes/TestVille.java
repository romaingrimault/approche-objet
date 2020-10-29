package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> list =new ArrayList<Ville>();
        list.add(new Ville("Nice",343_000));
        list.add(new Ville("Carcassonne,",47_800));
        list.add(new Ville("Narbonne,",53_400));
        list.add(new Ville("Lyon,",484_000));
        list.add(new Ville("Foix",9_700));
        list.add(new Ville("Pau,",77_200));
        list.add(new Ville("Marseille,",850_700));
        list.add(new Ville("Tarbes,",40_600));
        Iterator itr =list.iterator();
        Ville save=null;
        while (itr.hasNext()) {
            Ville elem= (Ville) itr.next();
            if(save==null)save=elem;
            else if(save.getNbHabitant()< elem.getNbHabitant())save=elem;
        }
        System.out.println("Ville avec le plus d'habitant: "+save.toString());
        itr = list.iterator();
        save=null;
        while (itr.hasNext()){
            Ville elem = (Ville) itr.next();
            if(save==null)save=elem;
            else if(save.getNbHabitant()> elem.getNbHabitant())save=elem;
        }
        list.remove(save);
        System.out.println("Nouvelle liste: ");
        System.out.println(list);
        itr = list.iterator();
        while (itr.hasNext()){
            Ville elem = (Ville) itr.next();
           if(elem.getNbHabitant()>100_000)elem.setNom(elem.getNom().toUpperCase());
        }
        System.out.println("Nouvelle liste: ");
        System.out.println(list);
    }
}
