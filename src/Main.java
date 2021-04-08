
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner keyboard = new Scanner(System.in);
        int guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player1,enter your name: ");
        String player1 = scanner.nextLine();
        System.out.println("Player2,enter your name: ");
        String player2 = scanner.nextLine();
        boolean player1Turn = true;

        do {
            String name;
            if (player1Turn) {// check the whose tur it is
                name = player1;
                player1Turn = false; //flip
            }
            else {name = player2;
                player1Turn = true; //flip
            }

            System.out.println(name + ",guess your number: ");
            guess = keyboard.nextInt();
            if (guess == randomNumber) {

                System.out.println("Your guess is correct.");
            } else if (guess < randomNumber) {

                System.out.println("Your guess is smaller than the random number.");
            } else {

                System.out.println("Your guess is greater than the random number.");
            }


        }
        while (guess != randomNumber) ;
    }
}

