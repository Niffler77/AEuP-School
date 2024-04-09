package Workbooks.Arrays;

import java.util.Scanner;

public class Socks {

    Scanner scanner = new Scanner(System.in);

    String [] weekDays = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sontag"};
    String [] sockColors = new String[7];

        if (sockColors[0] == null) {
        System.out.println("Program ist noch nicht eingerichtet. Bitte Sockenfarben festlegen.");
        Setup(weekDays, sockColors, scanner);
    }

    AskUserWhatToDo(weekDays, sockColors, scanner);
}

    public static void Setup(String[] weekDays, String[] sockColors, Scanner scanner) {
        for (int i = 0; i < weekDays.length; i++) {
            System.out.print("Welche Sockenfarbe möchtest du am " + weekDays[i] + " tragen? ");
            sockColors[i] = scanner.nextLine();
        }

        System.out.println("Setup abgeschlossen.");
        AskUserWhatToDo(weekDays, sockColors, scanner);
    }

    public static void AskUserWhatToDo(String[] weekDays, String[] sockColors, Scanner scanner) {

        System.out.println("Was möchtest du tun?");
        System.out.println("1. Sockenfarbe ausgeben");
        System.out.println("2. Sockenfarben ändern");
        System.out.println("3. Sockenfarben für alle Tage ausgeben");
        System.out.println("4. Beenden");

        var userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                GetSockColorForDay(weekDays, sockColors, scanner);
                break;
            case 2:
                Setup(weekDays, sockColors, scanner);
                break;
            case 3:
                GetAllSockColors(weekDays, sockColors, scanner);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Ungültige Eingabe.");
                AskUserWhatToDo(weekDays, sockColors, scanner);
                break;
        }
    }

    public static void GetSockColorForDay(String[] weekDays, String[] sockColors, Scanner scanner) {
        System.out.println("Für welchen Tag möchtest du die Sockenfarbe wissen? ");
        // for each day of the week, print it like this: [1] Montag....
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println("[" + (i + 1) + "] " + weekDays[i]);
        }

        var userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 7) {
            System.out.println("Ungültige Eingabe.");
            GetSockColorForDay(weekDays, sockColors, scanner);
        } else {
            System.out.println("Am " + weekDays[userInput - 1] + " trägst du " + sockColors[userInput - 1] + " Socken.");
        }

        AskUserWhatToDo(weekDays, sockColors, scanner);
    }

    public static void GetAllSockColors(String[] weekDays, String[] sockColors, Scanner scanner) {
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println("Am " + weekDays[i] + " trägst du " + sockColors[i] + " Socken.");
        }

        AskUserWhatToDo(weekDays, sockColors, scanner);
    }
