package WeitereUbungen.Arrays;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 7, 9, 12, 97, 24, 54};

        int evenSum = 0;
        int oddSum = 0;
        int allSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            allSum += number;
        }

        System.out.println("Summe aller geraden Zahlen: " + evenSum);
        System.out.println("Summe aller ungeraden Zahlen: " + oddSum);
        System.out.println("Summe aller Zahlen: " + allSum);

        // unnecessary code

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        double average = (double) allSum / numbers.length;
        System.out.println("Durchschnitt aller Zahlen: " + average);

        Arrays.sort(numbers);
        System.out.println("Sortierte Zahlen: " + Arrays.toString(numbers));

        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Umgekehrte Zahlen: " + Arrays.toString(reversedNumbers));

        int searchNumber = 12;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            index ++;
            System.out.println("Die Nummer " + searchNumber + " wurde an der Stelle " + index + " gefunden.");
        } else {
            System.out.println("Die Nummer " + searchNumber + " wurde nicht gefunden.");
        }
    }
}
