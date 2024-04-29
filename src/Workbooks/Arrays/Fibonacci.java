package Workbooks.Arrays;
public class Fibonacci {
    public static void main(String[] args) {
        long[] fibonacci = new long[50];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (long l : fibonacci) {
            System.out.println(l);
        }
    }
}
