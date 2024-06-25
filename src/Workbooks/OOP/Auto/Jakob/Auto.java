package Workbooks.OOP.Auto.Jakob;

public class Auto {
    public String farbe = "";
    public String marke = "";
    public String type = "";
    public int number;

    public Auto ()
    {
        // Empty constructor
    }

    public Auto(String marke)
    {
        this.marke = marke;
    }

    public Auto(String marke, String type)
    {
        this.marke = marke;
        this.type = type;
    }

    public Auto(String marke, String typ, String farbe)
    {
        this.marke = marke;
        this.type = typ;
        this.farbe = farbe;
    }

    public void ausgabe()
    {
        System.out.println("Die Marke ist: " + marke);
        System.out.println("Der Typ ist: " + type);
    }

}
