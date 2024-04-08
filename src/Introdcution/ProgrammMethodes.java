package Introdcution;

import javax.swing.*;
import java.util.Scanner;

public class ProgrammMethodes {

    public static void FlaschenRechener() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib zu Anzahl an Flaschen ein");
        int anzahl = scanner.nextInt();

        System.out.println("Bitte gib den Teiler ein");
        int anzahlprokiste = scanner.nextInt();

        int leftover = anzahl % anzahlprokiste;
        int amount =  (anzahl - leftover) / anzahlprokiste;

        System.out.println("Rest Flaschen: " + leftover  +  "\n Anzahl and Kästen: " + amount);
    }

    public static void JOptions() {
        JOptionPane.showMessageDialog(null,
                "Die Summe ist \n" +
                        (
                                Integer.parseInt(JOptionPane.showInputDialog(null, "Please help me"))
                                        + Integer.parseInt(JOptionPane.showInputDialog(null, "Please help me"))
                        )
        );
    }

    public static void PrüfsummenrechnerRichtig()  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your kredit carnumber");
        String kreditcard = scanner.nextLine();


    }

    public static void PreufZiffer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Ziffer 1 eingeben");
        int ziffer1 = scanner.nextInt();

        System.out.print("Bitte Ziffer 2 eingeben");
        int ziffer2 = scanner.nextInt();

        System.out.print("Bitte Ziffer 3 eingeben");
        int ziffer3 = scanner.nextInt();

        System.out.print("Bitte Ziffer 4 eingeben");
        int ziffer4 = scanner.nextInt();

        int summeziff = ziffer1 + ziffer2 + ziffer3 + ziffer4;

        System.out.println("Ihre Prüfziffer ist: " + (summeziff % 3));
    }

    public static void Bruttorechner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Geben sie ihr gehalt ein:");
        double bruttogehalt = scanner.nextDouble();

        double lohnsteuer = bruttogehalt * 0.14;
        double pflegeversicherung = bruttogehalt * 0.01275;
        double rentenversicherung = bruttogehalt * 0.0935;
        double arbeitslosenversicherung = bruttogehalt * 0.03;
        double krankenversicherung = bruttogehalt * 0.073;

        double solidaritätszuschlag = lohnsteuer * 0.055;
        double kirchensteuer = lohnsteuer * 0.09;

        double nettogehalt = bruttogehalt - lohnsteuer - pflegeversicherung
                - solidaritätszuschlag - kirchensteuer - rentenversicherung
                - arbeitslosenversicherung - krankenversicherung;


        System.out.println(nettogehalt + " €");
    }
}
