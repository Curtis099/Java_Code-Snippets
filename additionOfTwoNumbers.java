import java.util.Scanner;

public class additionOfTwoNumbers
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter the First number: ");
        double firstNumber = userInput.nextDouble();
        
        System.out.print("Enter the Second number: ");
        double secondNumber = userInput.nextDouble();

        double addition = firstNumber + secondNumber;

        System.out.println("Total: " + addition);
    }
}