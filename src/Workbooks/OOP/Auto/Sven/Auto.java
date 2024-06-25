package Workbooks.OOP.Auto.Sven;

public class Auto {

    public String farbe = "";
    public String marke = "";
    public String type = "";
    public int number;

    public Auto()
    {
        //this("","","",1);
    }

    public Auto(String farbe, String marke, String type, int number) {
        this.farbe = farbe;
        this.marke = marke;
        this.type = type;
        this.number = number;
    }

    public Auto(String marke, String type, String farbe) {
        this.farbe = farbe;
        this.marke = marke;
        this.type = type;
    }

    public void ausgabe() {
        System.out.println("Die Marke ist: " + marke);
        System.out.println("Der Typ ist: " + type);
    }
}
