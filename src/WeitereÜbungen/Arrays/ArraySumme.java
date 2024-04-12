package WeitereÜbungen.Arrays;

public class ArraySumme {

    public static void main(String[] args) {

        int[] array = {10,11,12,13};
        int summe = 0;

        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }

        System.out.println(summe);
    }
}
