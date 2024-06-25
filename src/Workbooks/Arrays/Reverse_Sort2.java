package Workbooks.Arrays;

public class Reverse_Sort2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int [] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed [i] = array [array.length - i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" : ");
            System.out.println(reversed[i]);
        }
    }
}
