package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Every");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        char command = scanner.next().charAt(0);
        System.out.println("Your choice: " + command);

        switch (command) {
            case '1':
                Greet.greet();
                break;
            case '2':
                Even.menu();
                break;
            case '3':
                Calc.calc();
                break;
            case '0':
                System.out.println("Exit");
                break;
            default:
                System.out.println("Sorry, command not found");
                break;
        }
    }
}
