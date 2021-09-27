// Importing Scanner to take input from the user
import java.util.Scanner;

public class stringSplosion
{
    // Creating a Scanner Object
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the String: ");

        // String input from the user
        String string = userInput.nextLine();
        System.out.println(manipulation(string));
    }

    // Manipulation method 
    public static String manipulation(String string)
    {
        int a = 1;
        String manipulatedString = "";

        // Implementing nested While loop with the use of Comparison operators and Logical operators.
        while (a < string.length() | a == string.length())
        {
            int b = 1;

            while (b <= a)
            {
                manipulatedString = manipulatedString + string.charAt(b-1);
                b++;
            }
            a++;
        }
        return manipulatedString;
    }
}