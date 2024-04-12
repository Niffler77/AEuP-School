package WeitereUebungen.Extra;

import java.util.Scanner;

public class AdvancedProgrammingFunctions {


    public static void Login() {
        var scanner = new Scanner(System.in);

        String[] users = new String[] {
                "Flöchen",
                "omega"
        };
        String username ;
        String password ;

        System.out.println("Input your Username");
        username = scanner.next();

        System.out.println("Input your Password");
        password = scanner.next();


        if (!username.equals(users[0])) System.out.println("Wrong Usersame");

        if (!username.equals(users[1])) System.out.println("Wrong Password");

        System.out.println("Loged in");
    }
    public static void Bounus() {
        var scanner = new Scanner(System.in);

        int age;
        int lengthofservice;

        System.out.println("Input your age");
        age = scanner.nextInt();

        System.out.println("Input your Length of Service");
        lengthofservice = scanner.nextInt();

        if (age > 35 && lengthofservice > 25)
            System.out.println("Bounus of 550 €");
        else if (age > 35)
            System.out.println("Bounus of 50 €");
        else if (lengthofservice > 25)
            System.out.println("Bounus of 500 €");
        else
            System.out.println("no Bounus");

    }

    public static void Tempretarue() {
        var scanner = new Scanner(System.in);

        System.out.println("Do you want to convert to Fahrenheit ('F') or Celsius ('C')");
        String input = scanner.next();

        System.out.println("Input the Value to Convert");
        double value = scanner.nextInt();
        double output;
        if (input.equals("F") || input.equals("Fahrenheit")) {
            output = (value * 9/5) + 32;
            System.out.println(output + " F");
        } else if (input.equals("C") || input.equals("Celsius")) {
            output = (value - 32) * 5/9;
            System.out.println(output + " C°");
        }
    }
}
