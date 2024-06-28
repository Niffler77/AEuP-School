package Workbooks.OOP.Sparbuch.Lasse;

public class Konto {
    public String name = "";
    public double kontostand = 0.0;
    private double zinssatz = 0.55;

    public void buchen (double betrag) {
        kontostand += betrag;
    }

    public double zinsenBerechnen () {
        return kontostand * zinssatz;
    }
}
