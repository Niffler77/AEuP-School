package Workbooks.OOP.Sparbuch.Jakob;

public class Sparbuch {
    public double kontostand = 0.0;
    public String name;
    public double zinssatz = 0.0;

    public void buchen(double betrag) {
        kontostand += betrag;
    }

    public double zinsenBerechnen() {
        return kontostand * zinssatz;
    }
}
