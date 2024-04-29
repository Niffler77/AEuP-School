package WeitereUbungen.Arrays;

public class DreiSummen {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7, 9, 12, 97, 24, 54};

        int sum = 0;
        int sumeven = 0;
        int sumodd = 0;

        for (int i = 0; i < array.length; i++) {

            sum ++;
            if (array[i] % 2 == 0) sumeven += array[i];
            else sumodd += array[i];
        }

        System.out.println(sum + "\n" +  sumeven + "\n" + sumodd);

    }
}
