package Workbooks.Arrays;

import java.util.Scanner;

public class ChaosLager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] chaosLager = {
                {"Laptop", "Printer", "Computer", "Tablet"},
                {"Mp3 Player", "Phone", "2 Phones", null},
                {"TV", "Router", null, null}
        };

        AskUserWhatToDo(scanner, chaosLager);
    }

    private static void AskUserWhatToDo(Scanner scanner, String[][] chaosLager) {
        System.out.println("Was möchtest du tun?");
        System.out.println("1. Gerät hinzufügen");
        System.out.println("2. Gerät entfernen");
        System.out.println("3. Geräte anzeigen");
        System.out.println("4. Beenden");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                AddDevice(chaosLager, scanner);
                break;
            case 2:
                RemoveDevice(chaosLager, scanner);
                break;
            case 3:
                ShowDevices(chaosLager);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Ungültige Eingabe.");
                AskUserWhatToDo(scanner, chaosLager);
                break;
        }
    }

    private static void AddDevice(String[][] chaosLager, Scanner scanner) {
        System.out.println("In welchem Regal soll das Gerät hinzugefügt werden?");
        int shelf = scanner.nextInt();
        System.out.println("An welcher Stelle soll das Gerät hinzugefügt werden?");
        int position = scanner.nextInt();

        if (shelf >= chaosLager.length || position >= chaosLager[shelf].length) {
            System.out.println("Ungültige Eingabe.");
            AddDevice(chaosLager, scanner);
            return;
        }

        System.out.println("Welches Gerät soll hinzugefügt werden?");
        var device = scanner.next();

        chaosLager[shelf][position] = device;

        AskUserWhatToDo(scanner, chaosLager);
    }

    private static void RemoveDevice(String[][] chaosLager, Scanner scanner) {
        System.out.println("In welchem Regal soll das Gerät entfernt werden?");
        int shelf = scanner.nextInt();
        System.out.println("An welcher Stelle soll das Gerät entfernt werden?");
        int position = scanner.nextInt();

        chaosLager[shelf][position] = null;

        AskUserWhatToDo(scanner, chaosLager);
    }

    private static void ShowDevices(String[][] chaosLager) {
        for (int i = 0; i < chaosLager.length; i++) {
            for (int j = 0; j < chaosLager[i].length; j++) {
                if (chaosLager[i][j] != null) {
                    System.out.println("Regal " + i + ", Position " + j + ": " + chaosLager[i][j]);
                }
            }
        }

        AskUserWhatToDo(new Scanner(System.in), chaosLager);
    }



}
