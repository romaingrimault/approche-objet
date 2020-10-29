package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class TestSetPays {
    public static void main(String[] args) {
        HashSet<Pays> setPays =new HashSet<Pays>();
        setPays.add(new Pays("USA",52058,89948948945895945562.5));
        setPays.add(new Pays("France",2841449,78456.3));
        setPays.add(new Pays("Allemagne",3549461,984651.5));
        setPays.add(new Pays("UK",17561856,465.8));
        setPays.add(new Pays("Italie",48512,946512.21856));
        setPays.add(new Pays("Japon",98465123,98456123.0));
        setPays.add(new Pays("Chine",6451,784562.2));
        setPays.add(new Pays("Rusiie",9745,984562.3));
        setPays.add(new Pays("Inden",89456,9845622.0));
        Iterator itr =setPays.iterator();
        Pays save=null;
        while (itr.hasNext()){
            Pays elem = (Pays) itr.next();
            if(save==null)save=elem;
            else if (save.getPibHabitant()< elem.getPibHabitant())save=elem;
        }
        System.out.println("Pays avec le pib par hab le plus important: ");
        System.out.println(save.getNom()+" avec un pib de "+save.getPibHabitant());
         itr =setPays.iterator();
         save=null;
        while (itr.hasNext()){
            Pays elem = (Pays) itr.next();
            if(save==null)save=elem;
            else if (save.calculPib()< elem.calculPib())save=elem;
        }
        System.out.println("Pays avec le pib  le plus important: ");
        System.out.println(save.getNom()+" avec un pib de "+save.calculPib());

        itr =setPays.iterator();
        save=null;
        while (itr.hasNext()){
            Pays elem = (Pays) itr.next();
            if(save==null)save=elem;
            else if (save.calculPib()> elem.calculPib())save=elem;
        }
        save.setNom(save.getNom().toUpperCase());
        System.out.println(setPays.toString());
        System.out.println("Suppression du pays :"+ save.getNom());
        setPays.remove(save);
        System.out.println("Liste des pays:");
        System.out.println(setPays.toString());
    }
}
