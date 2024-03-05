import java.util.Scanner;
import operations.calculator.*;

public class main {

    public static void main(String[] args){

        System.out.println("Which operation would you like to perform?");

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        int number1 = UserInput.userOperationInput();
        int number2 = UserInput.userOperationInput();

        switch(operation){
            case "+":
                AdditionOperation.addition(number1, number2);
                break;

            case "-":
                SubtractionOperation.subtraction(number1, number2);
                break;

            case "*":
                MultiplicationOperation.multiplication(number1, number2);
                break;

            case "/":
                DivisionOperation.division(number1, number2);
                break;

            default:
                System.out.println("The symbol " + operation + " is not a valid operation.");
        }
        scanner.close();


    }
}
