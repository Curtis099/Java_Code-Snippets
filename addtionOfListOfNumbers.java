import java.util.Scanner;

public class addtionOfListOfNumbers 
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        double Total = 0;

        while (true)
        {
            System.out.print("Enter the number or type '0000' to total: ");
            int number = userInput.nextInt();

            if (number == 0000) { break;}
            else
            {
                Total = Total + number;
            }
        }
        System.out.println(Total);
    }

}
