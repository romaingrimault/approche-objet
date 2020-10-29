package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("USA");
        set.add("France");
        set.add("Allemage");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Rusiie");
        set.add("Inde");
        Iterator itr = set.iterator();
        String save=null;
        while (itr.hasNext()){
            String elem = (String) itr.next();
            if (save==null) save=elem;
            else if (elem.length()>save.length()) save=elem;
        }
        System.out.println("Pays avec plus de lettre");
        System.out.println(save);
        System.out.println("On retire le pays "+save);
        set.remove(save);
        System.out.println(set);

    }
}
