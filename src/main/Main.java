package main;

import main.beans.CupBean;
import main.beans.PartyBean;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PartyBean pb = new PartyBean("Toto", "Tata");

        pb.getJ1().roll();
        if(pb.getJ1().getCupBean().getScoreDices() >= 7) {
            pb.getJ1().add1point();
        }
    }


    public static void crepe(int nbCrepe) {
        int nbOeuf = nbCrepe / 5;
        int nbFarine = 20 * nbCrepe;

        System.out.println("Pour " + nbCrepe + "crêpes il faut :");
        System.out.println("-" + nbFarine + "g de farine");
        System.out.println("-" + nbOeuf + " oeufs");
    }


    public static int minuteToSecond(int nbMinute) {
        return nbMinute * 60;
    }

    public static int hourToMinute(int nbHeur) {
        return nbHeur * 60;
    }

    public static int hourAndMinuteToSecond(int nbHeure, int nbMinute) {
        return nbHeure * 3600 + nbMinute * 60;
    }


    public static void exo1() {
        int i = 7;
        int j = 3;

        int divEnt = i / j;
        System.out.println("divEnt=" + divEnt);

        int reste = i % j;
        System.out.println("reste=" + reste);

        double divClassique = i / (double) j;
        System.out.println("divClassique=" + divClassique);

        System.out.println("somme=" + (divClassique + divEnt + reste));
    }
}