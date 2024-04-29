package Workbooks.Arrays;

public class Switch {
    public static void main(String[] args) {
        var array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
