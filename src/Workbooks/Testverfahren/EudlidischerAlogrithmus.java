package Workbooks.Testverfahren;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EudlidischerAlogrithmus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, ergebnis;
        List<Integer> as = new ArrayList<Integer>();
        List<Integer> bs = new ArrayList<Integer>();
        System.out.println("Bitte Zahl a eingeben");
        a = scanner.nextInt();
        System.out.println("Bitte Zahl b eingeben");
        b = scanner.nextInt();

        as.add(a);
        bs.add(b);

        if (a == 0) {
            ergebnis = b;
        } else {
            while (b != 0) {
                if (a > b) {
                    a = a - b;
                    as.add(a);
                } else {
                    b = b - a;
                    bs.add(b);
                }
            }
            ergebnis = a;
        }

        System.out.print("A: ");
        for (int atemp : as) {
            System.out.print(atemp + " ");
        }
        System.out.print("\n");

        System.out.print("B: ");
        for (int btemp : bs) {
            System.out.print(btemp + " ");
        }
        System.out.print("\n");
        System.out.println("Ergebnis: " + ergebnis);
    }

}
