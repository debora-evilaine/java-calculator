import operations.calculator.*;

public class main {

    public static void main(String[] args){

        String operation = UserInput.userOperationInput();

        int number1 = UserInput.userNumberInput();
        int number2 = UserInput.userNumberInput();

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

    }
}
