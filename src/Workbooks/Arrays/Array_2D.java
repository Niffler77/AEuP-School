package Workbooks.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        int [][] array = new int [5][7];
        int number = 10;
        System.out.println(array[0].length);

        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                array [i][a] = number;
                number ++;
                System.out.println(array [i][a]);
            }
        }
    }
}
