package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Gcd;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        String command = scanner.next();
        System.out.println("Your choice: " + command);
        switchGame(command);
    }

    public static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Every");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

    public static void switchGame(String command) {
        switch (command) {
            case "1":
                Greet.gameGreet();
                break;
            case "2":
                Even.gameEven();
                break;
            case "3":
                Calc.gameCalc();
                break;
            case "4":
                Gcd.gameGcd();
                break;
            case "5":
                Progression.gameProgression();
                break;
            case "6":
                Prime.gamePrime();
                break;
            case "0":
                System.out.println("Exit");
                break;
            default:
                System.out.println("Sorry, command not found");
                break;
        }
    }
}
