import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        boolean replay = true;
        while (replay) {
            int wurf = 0;
            int anzahlwurf = 0;
            do {
                var random = new Random();
                wurf = random.nextInt() * 6 +1 ;
                System.out.println("Du hast " + wurf + " gewürfelt");
                anzahlwurf++;
            } while (wurf == 6);

            System.out.println(" Du hast " + anzahlwurf + "mal gewürfelt ");
        }

    }
}
