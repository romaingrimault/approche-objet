package fr.diginamic.banque.entites;

public class Credit extends Operation {
    public Credit(){}
    public Credit(String newDate,double newMontant){
        super(newDate,newMontant);
    }
    public  String afficheType(){
        return "Crédit";
    }
}
