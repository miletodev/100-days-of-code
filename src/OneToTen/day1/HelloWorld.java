package OneToTen.day1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name + "!\nHello, World!");
    }
}