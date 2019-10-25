import javafx.scene.transform.Scale;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Calculator cal = new Calculator();
        System.out.println("Which operation you want to do:\n" +
                "1- Divide 3 by a number.\n" +
                "2- Calculate the square root of a number.\n" +
                "3- Sum 5 to a number.");
        System.out.println("please enter the number:");

        int input = 0;

        try{
            input = cal.getUserInput();
            System.out.println(cal.userChosenNumber(input));

        } catch (NumberFormatException e) {
            System.out.println("Invalid number Format");
        }

    }
}
