package Workbooks.OOP.Sparbuch.Lasse;

import java.util.Scanner;

public class Sparbuch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Konto neuesKonto = new Konto();
        System.out.println("Name: ");
        neuesKonto.name = new String(scanner.next());
        System.out.println("Kontostand: ");
        neuesKonto.kontostand = new Double(scanner.nextDouble());

        neuesKonto.buchen(284);
        double zinsen = neuesKonto.zinsenBerechnen();
        System.out.println(zinsen);
    }
}
