package OtherThings.WeightedRandom;

public class Case {

    public static void main(String[] args) {

        char auswahl = 'c';

        int zahl1 = 2;
        int zahl2 = 4;
        int erg = 0;

        switch (auswahl) {
            case 'a': erg = zahl1 + zahl2 + erg;
            case 'b': erg = zahl1 + zahl2 + erg; break;
            case 'c': erg = zahl1 + zahl2 + erg;
        }
        System.out.println(erg);
    }
}
