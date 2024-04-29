package WeitereUbungen.Arrays;

import java.util.Arrays;

public class DasGroesste {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 7, 4, 12, -3, 8, -2};

        int[] biggest = {0,0};

        int[] sorted = Arrays.stream(array).sorted().toArray();
        biggest[0] = sorted[sorted.length - 1];
        biggest[1] = sorted[sorted.length - 2];


        System.out.println(biggest[0] + "\n" + biggest[1]);
    }
}
