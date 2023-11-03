package Lecture2;


import java.util.Scanner;

/*Write a program that generates a random number between 1 and 100 (you
can use the Random () method from the Math class).
In the next step checks (thanks to modulo) whether it is an even or an odd
number.
Each of the above actions should be written to the consoles, adding a text
explaining what has been done. */
public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease provide number: ");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("Is Even Number.");
        }

        else {

            System.out.println("Is Odd number.");

        }


    }


}
