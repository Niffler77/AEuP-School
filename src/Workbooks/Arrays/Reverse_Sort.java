package Workbooks.Arrays;

public class Reverse_Sort {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
