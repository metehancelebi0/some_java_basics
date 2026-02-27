import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100); // 0–99

        System.out.println("Hi! I'm thinking of a number between 0 and 99.");
        System.out.print("Can you guess it: ");

        int guess = reader.nextInt();
        int attempts = 1;
        while (guess != number && guess != -1) {
            System.out.println("Sorry!");
            if (number > guess){
                System.out.println("Mine is greater than yours");
            }else{
                System.out.println("Mine is less than yours");
            }
            System.out.print("Type -1 to quit or guess another: ");
            guess = reader.nextInt();
            attempts++;
        }

        if (guess == number) {
            System.out.println("Congratulations You won after" +" " +attempts +" attempts");
        }

        reader.close();
    }
}