package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] arrayOperation=new Operation[4];
        Debit premierDebit=new Debit("29/10/2020",20);
        Debit secondDebit=new Debit("28/10/2020",40);
        Credit premierCredit=new Credit("30/10/2020",100);
        Credit secondCredit=new Credit("09/10/2020",20);
        arrayOperation[0]=premierDebit;
        arrayOperation[1]=secondCredit;
        arrayOperation[2]=premierCredit;
        arrayOperation[3]=secondDebit;
        double montantGlobal=0;

        for (Operation operation :
                arrayOperation) {
            String string="";
            if (operation instanceof Credit){
                 string="Vous avez fait un "+operation.afficheType();
                 montantGlobal+= operation.getMontant();
            }
                else if (operation instanceof Debit){
                     string="Vous avez fait un "+operation.afficheType();
                montantGlobal-= operation.getMontant();

            }
                System.out.println(string+operation.toString());
        }
        System.out.println("Le montant global est de : "+ montantGlobal);

    }
}
