package Workbooks.OOP.Sparbuch.Jakob;

import java.util.Scanner;

public class SparbuchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sparbuch sparbuch = new Sparbuch();

        System.out.println("Name: ");
        String name = scanner.nextLine();

        sparbuch.name = name;

        System.out.println("Kontostand: ");
        double kontostand = scanner.nextDouble();

        sparbuch.kontostand = kontostand;

        System.out.println("Zinssatz (in %): ");
        double zinssatz = scanner.nextDouble();

        sparbuch.zinssatz = zinssatz/100;

        System.out.println("Zinsen: ");
        System.out.println(sparbuch.zinsenBerechnen());
    }
}
