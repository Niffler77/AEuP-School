package WeitereUbungen.Extra;

import java.util.Scanner;

public class WaysToPay {
    public static void main(String[] args) {
        int[] bills = {200, 100, 50, 20, 10, 5};
        int[] ways = new int[new Scanner(System.in).nextInt() + 1];
        ways[0] = 1;

        for (int bill : bills) {
            for (int i = bill; i < ways.length; i++) {
                ways[i] += ways[i - bill];
            }
        }

        System.out.println("Number of ways to pay " + (ways.length - 1) + "€ : " + ways[ways.length - 1]);
    }
}