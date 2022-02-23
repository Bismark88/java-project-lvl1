package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Even even = new Even();

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Every");
        System.out.println("0 - Exit");

        int command = scanner.nextInt();
        System.out.println("Your choice: " + command);

        switch (command) {
            case 1:
                constructHello();
                break;
            case 2:
                even.menu();
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Sorry, command not found");
                break;
        }
    }

    public static void constructHello() {
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
