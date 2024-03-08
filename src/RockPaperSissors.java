import java.util.Scanner;

public class RockPaperSissors {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        System.out.println("[1] Stein");
        System.out.println("[2] Papier");
        System.out.println("[3] Schere");
        System.out.println("[4] Echse");
        System.out.println("[5] Spock");

        String[] options = {"Stein", "Papier", "Schere", "Echse", "Spock"};

        System.out.println("Mögliche Optionen:");
        for (int i = 0; i < options.length; i++) {
            System.out.println("[" + (i + 1) + "] " + options[i]);
        }

        System.out.print("Bitte Zahl eingeben: ");
        int userChoice = input.nextInt();

        System.out.println("---".repeat(20));
        var computerChoice = (int) (Math.random() * 5) ;

        System.out.println("Computer hat " + computerChoice + " gewählt");

        if (userChoice == computerChoice) {
            System.out.println("Unentschieden");
        } else if ((userChoice == 0 && computerChoice == 2) || // Stein beatss Schere
                (userChoice == 0 && computerChoice == 3) || // Stein beats Echse
                (userChoice == 1 && computerChoice == 0) || // Papier beats Stein
                (userChoice == 1 && computerChoice == 4) || // Papier beats Spock
                (userChoice == 2 && computerChoice == 1) || // Schere beats Papier
                (userChoice == 2 && computerChoice == 3) || // Schere beats Echse
                (userChoice == 3 && computerChoice == 4) || // Eches beats Papier
                (userChoice == 3 && computerChoice == 1) || // Eches beats Spock
                (userChoice == 4 && computerChoice == 2) || // Spock beats Stein
                (userChoice == 4 && computerChoice == 1)) { // Spock beats Schere
            System.out.println("-> Gewonnen!");
        } else {
            System.out.println("-> Verloren!");
        }

        System.out.println("Nochmal spielen? y/n");
        var playAgain = input.next();
        if (playAgain.equals("y")) {
            //clear console

            System.out.print("\n".repeat(50));
            main(args);
        }

    }

}
