import java.util.Scanner;
import operations.calculator.*;

public class main {

    public static void main(String[] args){

        System.out.println("Which operation would you like to perform?");

        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();

        if(operation.equals("+")){
            PromptUserInput.promptOperationInput();
            int number1 = scanner.nextInt();
            PromptUserInput.promptOperationInput();
            int number2 = scanner.nextInt();

            AdditionOperation.addition(number1, number2);
        }
        else if(operation.equals("-")){
            PromptUserInput.promptOperationInput();
            int number1 = scanner.nextInt();
            PromptUserInput.promptOperationInput();
            int number2 = scanner.nextInt();

            SubtractionOperation.subtraction(number1, number2);
        }

        else if(operation.equals("/")){
            PromptUserInput.promptOperationInput();
            int number1 = scanner.nextInt();
            PromptUserInput.promptOperationInput();
            int number2 = scanner.nextInt();

            DivisionOperation.division(number1, number2);
        }
        else{
            PromptUserInput.promptOperationInput();
            int number1 = scanner.nextInt();
            PromptUserInput.promptOperationInput();
            int number2 = scanner.nextInt();

            MultiplicationOperation.multiplication(number1, number2);
        }
        scanner.close();


    }
}
