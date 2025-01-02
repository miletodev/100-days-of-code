package OneToTen.day4;

import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the option for the operation you want to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int option = keyboard.nextInt();
        System.out.println("You chose option " + option);
        System.out.println("Enter the first number: ");
        int num1 = keyboard.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = keyboard.nextInt();

        switch (option) {
            case 1:
                System.out.println("The sum of the two numbers is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("The difference of the two numbers is: " + (num1 - num2));
                break;
            case 3:
                System.out.println("The product of the two numbers is: " + (num1 * num2));
                break;
            case 4:
                System.out.println("The quotient of the two numbers is: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }


    }
}
