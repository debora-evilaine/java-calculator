package operations.calculator;
import java.util.Scanner;

public class UserInput {
    public static int userNumberInput(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();

        return number;
        }

    public static String userOperationInput(){
        System.out.println("Which operation would you like to perform?");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        return operation;
    }
    }