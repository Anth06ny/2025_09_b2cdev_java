package main;

public class ExoFor {

    public static void main(String[] args) {
        testFor();
    }

    public static void testFor(){
        //Afficher les nombres de 0 à 10
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Afficher les nombres de 5 à 12
        for (int i = 5; i <=12; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Afficher uniquement les nombres paires de 4 à 48
        for (int i = 4; i <=48; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Afficher les nombres de 10 à 0
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Afficher les nombres de 0 à 10 2 fois, exemple 0 0 1 1 2 2 3 3...
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " " + i + " ");
        }
        System.out.println();


        //Afficher les nombres de 0 à 20, 2 fois si impaire 1 fois si pair. Exemple 0 1 1 2 3 3 4 ...
        for (int i = 0; i <= 20; i++) {
            if(i%2 == 0 ) {
                System.out.print(i + " ");
            }
            else {
                System.out.print(i + " " + i + " ");
            }
        }

        System.out.println();

        //Afficher les nombres de 0 à 10 30 fois chacun (boucle for dans une boucle for)
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(i + " ");
            }
        }

    }
}
