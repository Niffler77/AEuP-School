package Workbooks.Arrays;

import java.util.Scanner;

public class ChaosLager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][][] chaosLager = {
                {
                        {"Laptop", "Printer", "Computer", "Tablet"},
                        {"Mp3 Player", "Phone", "2 Phones", null},
                        {"TV", "Router", null, null}
                },
                {
                        {"Laptop2", "Printer2", "Computer2", "Tablet2"},
                        {"Mp3 Player2", "Phone2", "2 Phones2", null},
                        {"TV2", "Router2", null, null}
                }
        };

        AskUserWhatToDo(scanner, chaosLager);
    }
    
    private static void AskUserWhatToDo(Scanner scanner, String[][][] chaosLager) {
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

    private static void AddDevice(String[][][] chaosLager, Scanner scanner) {
        System.out.println("In welchem Regal soll das Gerät hinzugefügt werden?");
        int shelf = scanner.nextInt();
        System.out.println("In welcher Reihe soll das Gerät hinzugefügt werden?");
        int row = scanner.nextInt();
        System.out.println("An welcher Stelle soll das Gerät hinzugefügt werden?");
        int position = scanner.nextInt();

        if (shelf >= chaosLager.length || row >= chaosLager[shelf].length || position >= chaosLager[shelf][row].length) {
            System.out.println("Ungültige Eingabe.");
            AddDevice(chaosLager, scanner);
            return;
        }

        System.out.println("Welches Gerät soll hinzugefügt werden?");
        var device = scanner.next();

        chaosLager[shelf][row][position] = device;

        AskUserWhatToDo(scanner, chaosLager);
    }

    private static void RemoveDevice(String[][][] chaosLager, Scanner scanner) {
        System.out.println("In welchem Regal soll das Gerät entfernt werden?");
        int shelf = scanner.nextInt();
        System.out.println("In welcher Reihe soll das Gerät entfernt werden?");
        int row = scanner.nextInt();
        System.out.println("An welcher Stelle soll das Gerät entfernt werden?");
        int position = scanner.nextInt();

        if (shelf >= chaosLager.length || row >= chaosLager[shelf].length || position >= chaosLager[shelf][row].length) {
            System.out.println("Ungültige Eingabe.");
            RemoveDevice(chaosLager, scanner);
            return;
        }

        chaosLager[shelf][row][position] = null;

        AskUserWhatToDo(scanner, chaosLager);
    }

    private static void ShowDevices(String[][][] chaosLager) {
        for (int i = 0; i < chaosLager.length; i++) {
            for (int j = 0; j < chaosLager[i].length; j++) {
                for (int k = 0; k < chaosLager[i][j].length; k++) {
                    if (chaosLager[i][j][k] != null) {
                        System.out.println("Regal " + i + ", Reihe " + j + ", Position " + k + ": " + chaosLager[i][j][k]);
                    }
                }
            }
        }
        AskUserWhatToDo(new Scanner(System.in), chaosLager);
    }
}
