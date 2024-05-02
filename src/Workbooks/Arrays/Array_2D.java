package Workbooks.Arrays;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] array = new int [5][7];
        int number = 10;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                array [i][a] = number;
                number ++;
                System.out.print(array [i][a] + " | ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " | ");
            }
            System.out.println();
        }

        while (true) {
            try {
                System.out.println("Welche Zeile soll verwendet werden? ");
                int row = scanner.nextInt();
                for (int i = 0; i < array[row].length; i++) {
                    sum += array[row][i];
                }
                System.out.println("Ergebnis: " + sum);
            }
            catch (Exception e) {
                System.out.println("Ungültige Eingabe.");
                break;
            }
        }
    }
}