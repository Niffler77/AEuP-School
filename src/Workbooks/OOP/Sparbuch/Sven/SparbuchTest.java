package Workbooks.OOP.Sparbuch.Sven;

import java.util.Scanner;

public class SparbuchTest {

    public static void main(String[] args) {
        Scanner berta = new Scanner(System.in);
        Sparbuch sparbuch = new Sparbuch();
        double betrag = berta.nextDouble();
        sparbuch.buchen(betrag);
    }

}
