package main;

public class Exo {

    public static void main(String[] args) {
        char c = charAt3("Sa");
        System.out.println("c=" + c);
    }

    public static char charAt3(String p1) {
        if (p1.length() < 3) {
            return '?';
        }
        return p1.charAt(2);
    }
}
