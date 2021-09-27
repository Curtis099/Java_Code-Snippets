import java.util.Scanner;

public class seriesOfNumbersToString {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the range. From '0' to ");
        int n = userInput.nextInt();

        int k = n;
        String numberToString = "";

        while (k<=n && k != (-1))
        {
            int number = n-k;
            numberToString = numberToString + " " + Integer.toString(number);
            k--;
        }
        System.out.println(numberToString);
    }
}