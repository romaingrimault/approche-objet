package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException, ReflectionException {
        Pays pays =new Pays("France");
        ReflectionUtils reflectionUtils=new ReflectionUtils();
        ReflectionUtils.afficherAttributs(pays);
    }
}
