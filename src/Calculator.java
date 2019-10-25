import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Calculator {


    Calculator() {
    }

    public String userChosenNumber(int choosenNumber) {

        String result = "";
        double userInput =0.0;
        switch (choosenNumber) {

            case 1:
                System.out.println("Enter a valid number :");
                  userInput = getUserInput();

                double result2 = division(userInput);
                if (!Double.isInfinite(result2)) {

                    result = "the result is " + result2;
                } else {
                    System.out.println("Number can not be divided by ZERO!");
                }

                break;

            case 2:
                System.out.println("Enter a valid number :");
                 userInput = getUserInput();

                Double returnedValue = squareRoot(userInput);
                if (Double.isNaN(returnedValue)) {
                    result = "Can not calculate the square root of the entered value";
                } else {
                    result = "the result is: " + returnedValue;
                }
                break;


            case 3:
                System.out.println("Enter a valid number :");
                 userInput = getUserInput();

                try {
                    result = "the result is: " + summation(getUserInput());
                } catch (
                        NumberFormatException e) {
                    System.out.println("Cannot calculate the summation of the entered value!");

                } finally {
                    break;
                }

            default:
                result = "Invalid Number !";
                break;


        }
        return result;
    }

    public int getUserInput() {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            input = Integer.parseInt("Invalid number format");

        }


        return input;
    }

    public double division(double userNumber) {
        return 3 / userNumber;


    }

    //square root of user number
    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        return result;
    }

    //Sum 5 to a number entered by the user(5+x).
    public double summation(double number) {

        double result = number + 5;
        return result;
    }


}

