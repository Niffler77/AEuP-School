package Workbooks.OOP.Sparbuch.David;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your balance: ");
        double kontostand = scanner.nextInt();
        System.out.println("Please enter the amount you want to add to your balance: ");
        double buchen = scanner.nextInt();

        Sparbuch sb = new Sparbuch();
        sb.kontostand = kontostand;
        sb.Name = name;
        sb.buchen(buchen);


    }
}
