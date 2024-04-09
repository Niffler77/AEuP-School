import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] options = {"\uD83D\uDDFF", "\uD83E\uDDFB", "✂\uFE0F", "\uD83E\uDD8E", "\uD83D\uDD96"};

        System.out.println("Mögliche Optionen:");
        for (int i = 0; i < options.length; i++)
        {
            System.out.println("[" + (i + 1) + "] " + options[i]); // OUR big brain move
        }

        System.out.print("Bitte Zahl eingeben: ");
        int userChoice = input.nextInt() - 1;

        System.out.println("---".repeat(20));
        int computerChoice = (int) (Math.random() * 5);

        System.out.println("Computer hat " + options[computerChoice] + " gewählt");

        if (userChoice == computerChoice)
        {
            System.out.println("Unentschieden");
        }
        else if ((userChoice == 0 && computerChoice == 2) || // Rock beats Scissors
                (userChoice == 0 && computerChoice == 3) || // Rock beats Lizard
                (userChoice == 1 && computerChoice == 0) || // Paper beats Rock
                (userChoice == 1 && computerChoice == 4) || // Paper beats Spock
                (userChoice == 2 && computerChoice == 1) || // Scissors beats Paper
                (userChoice == 2 && computerChoice == 3) || // Scissors beats Lizard
                (userChoice == 3 && computerChoice == 4) || // Lizard beats Spock
                (userChoice == 3 && computerChoice == 1) || // Lizard beats Paper
                (userChoice == 4 && computerChoice == 2) || // Spock beats Rock
                (userChoice == 4 && computerChoice == 1)) // Spock beats Scissors
        {
            System.out.println("-> Gewonnen!");
        }
        else
        {
            System.out.println("-> Verloren!");
        }

        System.out.println("Nochmal spielen? y/n");
        String playAgain = input.next();
        if (playAgain.equals("y"))
        {
            //clear console
            System.out.print("\n".repeat(50));
            main(null);
        }
    }
}
