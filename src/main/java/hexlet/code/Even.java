package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    private static final int COUNT_VICTORY = 3;
    private static final int RANGE = 100;

    public static void menu() {

        String template = "'%s' is wrong answer ;(. Correct answer was '%s'.";
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int counter = 0;
        while (counter < COUNT_VICTORY) {
            int number = random.nextInt(RANGE);
            System.out.println("Question: " + number);
            String answer = input.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(parityCheck(number))) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println(String.format(template, answer, parityCheck(number)));
                System.out.println("Let's try again, " +  name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " +  name + "!");
    }

    public static String parityCheck(int number) {
        String correctAnsver = "no";
        if (number % 2 == 0) {
            correctAnsver = "yes";
        }
        return correctAnsver;
    }

}
