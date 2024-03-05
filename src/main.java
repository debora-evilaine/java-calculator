import java.util.Scanner;
import operations.calculator.*;

public class main {

    public static void main(String[] args){

        System.out.println("Which operation would you like to perform?");

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        int number1 = UserInput.userOperationInput();
        int number2 = UserInput.userOperationInput();


        if(operation.equals("+")){
            AdditionOperation.addition(number1, number2);
        }
        else if(operation.equals("-")){
            SubtractionOperation.subtraction(number1, number2);
        }

        else if(operation.equals("/")){
            DivisionOperation.division(number1, number2);
        }
        else{
            MultiplicationOperation.multiplication(number1, number2);
        }
        scanner.close();


    }
}
