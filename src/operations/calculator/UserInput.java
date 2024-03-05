package operations.calculator;
import java.util.Scanner;

public class UserInput {

    public static int userOperationInput(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();

        return number;
        }
    }