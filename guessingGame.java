// Importing the Scanner from the Java library to take input from the user
import java.util.Scanner;

// Creating a public class named exactly as its file's name
public class guessingGame
{
    // Creating a scanner object from the 'scanner' class and declaring it as 'userInput' with providing the source of input
    static Scanner userInput = new Scanner(System.in);

    // Initializing a global variable
    static int randomNumber;

    public static void main(String[] args) {
        getRandomNumber();
        boolean a = true; int iterator = 3;

        while (a == true && iterator != 0)
        {
            System.out.println("Enter the number: ");
            int n = userInput.nextInt();
            checkGuess(n, a, iterator);
            iterator --;
        }
        System.out.println("The random Number was " + randomNumber);
    }

    public static int getRandomNumber() {
        randomNumber = (int) (Math.random() * 11);
        return randomNumber;
    }

    public static boolean checkGuess(int n, Boolean a, int iterator) {
        if (n == randomNumber)
        {
            a = false;
            System.out.println("Correct!");
            return a;
        }
        else
        {
            System.out.println();
            System.out.println("You've got " + (iterator-1) + " chance/s left!");
            return true;
        }
    }
}