import java.util.Scanner;

public class Sequenprograming {

    public static void Tresor() {
        System.out.println("Please input pin");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 615243) {
            System.out.println("Tresor opend");
        }
        else
        {
            System.out.println("Tresor pin wrong");
        }
    }

    public static void Schoolnumber() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1: System.out.println("Sehr Gut"); break;
            case 2: System.out.println("Gut"); break;
            case 3: System.out.println("Befriedigend"); break;
            case 4: System.out.println("Ausreichend"); break;
            case 5: System.out.println("Mangelhaft"); break;
            case 6: System.out.println("Ungenügend"); break;
            default:
                throw new RuntimeException("Nur 1 - 6 ");
        }
    }
}
