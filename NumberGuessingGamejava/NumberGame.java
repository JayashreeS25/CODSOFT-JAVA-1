import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int RandomNum = rand.nextInt(100) + 1;
        int score = 0;
        int attempt = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess & Enter  a number between 1 and 100:");
            int GuessNum = scanner.nextInt();
            attempt++;

            if (GuessNum < RandomNum) {
                System.out.println("OOPs!!! The Number is too low, try again");
            } else if (GuessNum > RandomNum) {
                System.out.println("NOPE!! The Number is Higher!!, try again");
            } else {
                System.out.println("Hurrah! CORRECT !!! YOU GUESSED THE NUMBER !!!YOU WIN!!!");
                score = 100 - attempt;
                break;
            }
        }

        System.out.println("Scored : " + score);
        System.out.println("Attempts tried:" + attempt + " times");
    }
}