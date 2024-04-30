package WeitereUbungen.Arrays;

public class Glaetten {
    public static void main(String[] args) {
        int[] signal = {1,5,4,5,7,6,8,6, 5,4,5,4};
        int[] geglaettet = new int[signal.length];

        geglaettet[0] = (signal[0] + signal[1])/2;
        geglaettet[signal.length - 1] = (signal[signal.length - 2] + signal[signal.length - 1])/2;

        for (int i = 1; i < geglaettet.length - 1; i++) {
            geglaettet[i] = (signal[i-1] + signal[i+1])/3;
        }

        System.out.println("Geglättet");
        for (int i = 0; i < geglaettet.length; i++) {
            System.out.println(geglaettet[i]);
        }
    }
}
