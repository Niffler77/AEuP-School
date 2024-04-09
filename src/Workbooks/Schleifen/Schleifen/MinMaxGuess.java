package Workbooks.Schleifen.Schleifen;

import java.util.Scanner;

public class MinMaxGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int minNumber = 1;
        System.out.print("Gebe die maximale Zahl an: ");
        int maxNumber = scanner.nextInt();

        while (maxNumber < 3) {
            System.out.print("Die Zahl muss größer als 2 sein:");
            maxNumber = scanner.nextInt();
        }

        final int range = maxNumber - minNumber + 1;
        int attempts;
        int maxAttempts = (int) Math.floor((double) range / 10) * 3;

        maxAttempts = Math.min(Math.max(maxAttempts, 3), 10);

        boolean playAgain;

        do {
            int randomNumber = (int) (Math.random() * range) + minNumber;
            attempts = 0;
            System.out.println("Du hast " + maxAttempts + " Versuche die Zahl zwischen " + minNumber + " und " + maxNumber + " zu erraten.");

            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Versuch " + attempts + ": Rate eine Zahl: ");
                var guess = scanner.nextInt();

                if (guess < minNumber || guess > maxNumber) {
                    System.out.println("Die Zahl muss zwischen " + minNumber + " und " + maxNumber + " sein.");
                    attempts--;
                    continue;
                }

                if (guess == randomNumber) {
                    System.out.println("Glückwunsch! Du hast die Zahl in " + attempts + " Versuchen erraten.");
                    break;
                } else if (attempts == maxAttempts) {
                    System.out.println("Du hast alle Versuche verbraucht. Die richtige Zahl war " + randomNumber + ".");
                } else {
                    System.out.println("Falsch! Die Zahl ist " + ((guess < randomNumber) ? "größer." : "kleiner."));
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.next().equalsIgnoreCase("y");
        } while (playAgain);
        System.out.println("Goodbye!");
    }
}
