package WorkbookOOP.Kinoticket;

public class Kinoticket {

    String tilte;

    int ticketnr;

    float price;

    boolean is3d;

    public void printTicket() {
        System.out.println("Title: " + tilte + " Ticketnr: " + ticketnr + " Price: " + price + " Is3d: " + is3d);
    }
}
