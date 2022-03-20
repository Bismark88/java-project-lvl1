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
            case "1" -> Greet.gameGreet();
            case "2" -> Even.gameEven();
            case "3" -> Calc.gameCalc();
            case "4" -> Gcd.gameGcd();
            case "5" -> Progression.gameProgression();
            case "6" -> Prime.gamePrime();
            case "0" -> System.out.println("Exit");
            default -> System.out.println("Sorry, command not found");
        }
    }
}
