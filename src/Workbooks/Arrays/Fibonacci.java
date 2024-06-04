package Workbooks.Arrays;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Create a Fibonacci-Sequence with a array");

        long[] fibonacci = new long[50];
        fibonacci [0] = 0;
        fibonacci [1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci [i - 1] + fibonacci [i - 2];
        }

        for (long l : fibonacci) {
            System.out.println(l);
        }

        //BigInteger Kann nicht overflow
        System.out.println("BigInteger: Fibonacci");
        for (int i = 0; i < 125; i++) {
            System.out.println(fibonacci3(i));
        }
    }

    private static Map<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger fibonacci3(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        BigInteger v = fibonacci3(n - 2).add(fibonacci3(n - 1));
        memo.put(n, v);
        return v;
    }
}
