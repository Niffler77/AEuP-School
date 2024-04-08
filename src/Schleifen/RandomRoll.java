package Schleifen;

import java.util.Scanner;

public class RandomRoll {

    public static void main(String[] args) {

        System.out.println("Anzahl an Würfen");
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextInt();
        var roll1 = ((int) Math.random() * 6) + 1;
        var roll2 = ((int) Math.random() * 6) + 1;


        switch (input) {
            case 1:
                System.out.println("Wurf 1: " + roll1);
                if (roll1 == 6 ) {
                    System.out.println("Gewonnen");
                } else {
                    System.out.println("Verloren");
                }
                break;
            case 2:
                System.out.println("Wurf 1: " + roll1
                        + "\nWurf 2: " + roll2);
                if (roll1 == roll2 ) {
                    System.out.println("Gewonnen");
                } else {
                    System.out.println("Verloren");
                }
                break;
            default:
                System.out.println("you are a idot sandwitch");
                break;
        }

        for (int i = 0; i < 6; i++) {

        }

        System.out.println("Nochmal");
        var stringinput = scanner.next();
        if (stringinput.toLowerCase().equals("j")
                || stringinput.toLowerCase().equals("y"))
        {
            RandomRoll.main(args);
        }
    }
}
