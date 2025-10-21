package main;

public class ExoTab {

    public static void main(String[] args) {
          int i = 5;
          int [] tab = new int[]{5};

          add1(i, tab);

    }

    public static void add1(int i, int[] tab) {
        i++;
        tab[0]++;
    }

    public static void exo1() {
//        Créer un tableau de taille 5 contenant les valeurs (2, 5, 8, 12 et 20)
        int tab[] = new int[]{2, 5, 8, 12, 20};

//        Afficher la 5ᵉ valeur du tableau
        System.out.println("2/ tab[4]=" + tab[4]);

//        Dans sa case numéro 2 mettre la valeur 12
        tab[2] = 12;

//        Afficher la taille du tableau
        System.out.println(tab.length);

//        Pour chaque case, afficher sa position et sa valeur. Ex: 0:3 1:5 3:8
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + ":" + tab[i]);
        }

//        Incrémenter de 1 chaque case {2 ,4, 7} -> { 3, 5, 8}
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }

//        Afficher l'ensemble des valeurs du tableau Ex: 0 15 3 8
        for (int v : tab) {
            System.out.print(v + " ");
        }
        System.out.println();

//        Faire en sorte que chaque case incrémente de 1 par rapport à sa case précédente. Exemple 1er case 7 -> { 7, 8, 9 ,10 ,11 ,12}
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i - 1] + 1;
            //tab[i] = tab[0] + i;
        }
        System.out.println();

//        Afficher la somme des éléments du tableau
        int somme = 0;
        for (int v : tab) {
            somme += v;
        }
        System.out.println("somme =  " + somme);

    }
}
