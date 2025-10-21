package main;

import main.beans.HouseBean;

public class ExoHouse {

    public static void main(String[] args) {
        //Exemple de test
        HouseBean myHouse = new HouseBean();
        myHouse.setWidth(12);
        myHouse.setLength( 25);
        printHouse(myHouse);
        //doubleHouse(myHouse);
        printHouse(myHouse); //Normalement 24*50

        HouseBean myHouse2 = new HouseBean();
        myHouse2.setWidth(14);
        myHouse2.setLength( 25);
        printHouse(bigHouse(myHouse, myHouse2));
    }

    //Affiche la largeur, longueur de la maison ou Null  : Exemple attendu :     12x25
    public static void printHouse(HouseBean m) {
        if (m != null) {
            System.out.println(m.getWidth() + "x" + m.getLength());
        } else {
            System.out.println("null");
        }
    }

    //Double la taille de la maison. (N'affiche rien)
    public static void doubleHouse(HouseBean m) {
        if (m != null) {
            m.setWidth(m.getWidth() * 2);
            m.setLength(m.getLength() * 2);
        }
    }

    //Retourne la maison la plus grande, et null si de la même taille. N'affiche rien
    public static HouseBean bigHouse(HouseBean m1, HouseBean m2) {

        if (m1 != null) {
            return m2;
        } else if (m2 != null) {
            return m1;
        } else if (m1.getArea() > m2.getArea()) {
            return m1;
        } else if (m1.getArea() < m2.getArea()) {
            return m2;
        } else {
            return null;
        }
    }


    public static void exo1() {
        //        Créer une variable m de type HouseBean initialisée avec null
        HouseBean m = null;
        //        Afficher m dans la console
        System.out.println("m=" + m);
        //        Créer une maison et la mettre dans m
        m = new HouseBean();
        //        Afficher m dans la console
        System.out.println("m=" + m);
        //        Définir la largeur  de m à 5
        m.setWidth(5);
        //        Afficher la largeur de m dans la console
        System.out.println("m.width=" + m.getWidth());
//        Créer une variable m2 et lui assigner m
        HouseBean m2 = m;
//        Afficher m2 et la largeur de m2
        System.out.println("m2=" + m2 + " m2.width=" + m2.getWidth());
//        Changer la largeur de m2  à 10
        m2.setWidth(10);
//        Afficher la largeur de m et de m2
        System.out.println("m.width=" + m.getWidth());
        System.out.println("m2.width=" + m2.getWidth());

    }
}
