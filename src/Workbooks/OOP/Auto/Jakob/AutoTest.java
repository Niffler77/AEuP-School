package Workbooks.OOP.Auto.Jakob;

public class AutoTest {
    public static void main(String[] args) {
        Auto meinBmw = new Auto(); // uses empty constructor
        meinBmw.marke = "BMW";
        meinBmw.type = "320d";
        meinBmw.farbe = "schwarz";
        meinBmw.ausgabe();

        Auto meinVW = new Auto("VW", "Golf", "blau");
    }
}
