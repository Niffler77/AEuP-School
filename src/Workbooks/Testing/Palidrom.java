package Workbooks.Testing;

public class Palidrom {
    public static void main(String[] args)
    {
        String[] words = {"radar", "level", "world", "deified", "civic", "example"};
        int palindromeCount = 0;

        for (String word : words) {
            String reversed = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            if (word.equalsIgnoreCase(reversed)) {
                palindromeCount++;
            }
        }

        System.out.println("Anzahl der Palindrome: " + palindromeCount);
    }
}
