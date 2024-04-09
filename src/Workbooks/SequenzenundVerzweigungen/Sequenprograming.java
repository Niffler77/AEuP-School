package Workbooks.SequenzenundVerzweigungen;

import java.util.Scanner;

public class Sequenprograming {

    public static void main(String[] args) {
        Tresor();
    }

    public static void Tresor() {
        System.out.println("Please input pin");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 615243) {
            System.out.println("Tresor opend");
        }
        else
        {
            System.out.println("Tresor pin wrong");
        }
    }

    public static void Schoolnumber() {
        Scanner input = new Scanner(System.in);

        String[] grades = {"Sehr Gut", "Gut", "Befriedigend", "Ausreichend", "Mangelhaft", "Ungenügend"};

        System.out.print("Bitte Note eingeben: ");
        var usergrade = input.nextInt();

        if (usergrade < 6) {
            System.out.println(grades[usergrade-1]);
        } else {
            System.out.println("Nur 1-6 wird akzeptiert!");
            throw new RuntimeException("Invalide Input!");
        }
    }
}
