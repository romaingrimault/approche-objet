package fr.diginamic.banque.entites;

public class Debit extends Operation {
    public Debit(){}
    public Debit(String newDate,double newMontant){
        super(newDate,newMontant);
    }
    public  String afficheType(){
        return "Débit";
    }

}
