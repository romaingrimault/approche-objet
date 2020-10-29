package fr.diginamic.operations;

public class  Opertions {
    public Opertions() {
    }

    public static double calcul(double a, double b, char operateur){
        double ret=0;
        switch (operateur){
            case '+':
                ret=a+b;
                break;
            case '-':
                ret=a-b;
                break;
            case '*':
                ret=a*b;
                break;
            case '/':
                ret=a/b;
                break;
        }
        return ret;
    }
}
