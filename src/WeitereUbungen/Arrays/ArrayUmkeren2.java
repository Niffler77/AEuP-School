package WeitereUbungen.Arrays;

public class ArrayUmkeren2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] ziel = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            ziel[i] = array[array.length - 1 - i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(ziel[i]);
        }
    }
}
