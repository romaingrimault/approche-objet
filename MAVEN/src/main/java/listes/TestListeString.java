package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("Nice");
        list.add("Carcassonne");
        list.add("Narbonne");
        list.add("Lyon");
        list.add("Foix");
        list.add("Pau");
        list.add("Marseille");
        list.add("Tarbes");
        System.out.println("ville avec le plus grand nombre de lettre: ");
        Iterator itr= list.iterator();
        String save = null;
        while (itr.hasNext()){
            Object elem=itr.next();
            if(save==null)save =elem.toString();
            else if (elem.toString().length()>save.length())save=elem.toString();

        }
        System.out.println(save);

        itr= list.iterator();
        while (itr.hasNext()){
            Object elem=itr.next();
            if(elem.toString().charAt(0)=='N') itr.remove();
        }
        System.out.println("Nouvelle liste: ");
        System.out.println(list);
    }
}
