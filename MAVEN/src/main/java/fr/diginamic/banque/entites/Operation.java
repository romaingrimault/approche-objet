package fr.diginamic.banque.entites;


abstract class Operation {
    String dateOpetartion;
    double montant;
    public Operation(){}
    public Operation(String newDate, double newMontant){
        this.dateOpetartion=newDate;
        this.montant=newMontant;
    }
    public String toString(){
        return "le "+this.dateOpetartion+", d'un montant de: "+this.montant;
    }
    public  String afficheType(){
        return "";
    }

    public double getMontant() {
        return montant;
    }
}
