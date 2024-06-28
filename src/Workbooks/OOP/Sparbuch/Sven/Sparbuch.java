package Workbooks.OOP.Sparbuch.Sven;

public class Sparbuch {

    public double kontostand = 0.0;

    public String name = null;

    public double zinssatz = 0.55;

    public void buchen(double betrag) {
        kontostand += betrag;
    }

    public double zinsenBerechnen() {
      return kontostand * zinssatz;
    }
}
