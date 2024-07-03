package Workbooks.OOP.Sparbuch.Lasse;

<<<<<<< HEAD
public class Sparbuch {
=======
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
>>>>>>> b0ca1818a983a68c35f132597c823fdb18174279
}
