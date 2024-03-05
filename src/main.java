import java.util.Scanner;
import operations.calculator.*;

public class main {

    public static void main(String[] args){

        System.out.println("Which operation would you like to perform?");

        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();

        if(operation.equals("+")){
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            AdditionOperation.addition(number1, number2);
        }
        else if(operation.equals("-")){
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            SubtractionOperation.subtraction(number1, number2);
        }

        else if(operation.equals("/")){
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            DivisionOperation.division(number1, number2);
        }
        else{
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            MultiplicationOperation.multiplication(number1, number2);
        }



        scanner.close();


    }
}
