package WeitereUbungen.Arrays;

import java.util.Arrays;

public class DasGroesste {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 7, 4, 12, -3, 8, -2};

        int[] biggest = {0,0};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int[] sorted = Arrays.stream(array).sorted().toArray();
        biggest[0] = sorted[sorted.length - 1];
        biggest[1] = sorted[sorted.length - 2];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = max1;
                max1 = array[i];
            } else if (array[i] > max2 && array[i] != max1) {
                max2 = array[i];
            }
        }

        System.out.println(biggest[0] + "\n" + biggest[1]  + "\n" + max1 + "\n" + max2);
    }
}
