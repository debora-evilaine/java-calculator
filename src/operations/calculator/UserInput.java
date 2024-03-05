package operations.calculator;
import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);
    /* Assigning the variable 'scanner' as 'final' means that it is now
    a constant, and its value cannot be reassigned */

    public static int userNumberInput(){
        int number;
        System.out.println("Enter the number:");
        number = scanner.nextInt();

        return number;
        }

    public static String userOperationInput(){
        System.out.println("Which operation would you like to perform?");
        String operation = scanner.nextLine();

        return operation;
    }
    }