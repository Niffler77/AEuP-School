package WeitereUbungen.Arrays;

public class DatenOptimierer {
    public static void main(String[] args) {
        double[] array = {5.6,6.2,6.0,5.5,5.7,6.1,7.4,5.5,5.5,6.3,6.4,4.0,6.9};

        float durchschnitt1 = 0;
        float durchschnitt2 = 0;

        for (int i = 0; i < array.length; i++) {
            durchschnitt1 += array[i];
        }
        durchschnitt1 = durchschnitt1 / array.length;

        double maxDifferenz = Double.MIN_VALUE;
        double wertAmWeitsten = 0;
        int indexAmWeitesten = 0;

        for (int i = 0; i < array.length; i++) {
            double differenz = Math.abs(array[i] - durchschnitt1);
            if (differenz > maxDifferenz) {
                maxDifferenz = differenz;
                wertAmWeitsten = array[i];
                indexAmWeitesten = i;
            }
        }
        array[indexAmWeitesten] = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                durchschnitt2 += array[i];
            }
        }
        durchschnitt2 = durchschnitt2 / (array.length -1);
        System.out.println("Durschschnitt: " + durchschnitt1);
        System.out.println("entferntester Wert: " + wertAmWeitsten);
        System.out.println("neuer Durchschnitt: " + durchschnitt2);
    }
}
