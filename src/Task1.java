import java.util.Scanner;

//        Task 1
//
//        Create a program with a variable called number with the type int and assign the value 100 to the
//        variable as a default value.
//
//        Create a Scanner object, ask the user to enter a number and assign the entered number to the
//        variable number (use the nextInt method in the Scanner for this).
//
//        Then print out a message with the number the user entered.
//
//        Try it out and enter an int number and it should work.
//
//        Also try it out entering some other characters that are not numeric and you should see an
//        Exception and the program will crash before anything is printed out.

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 100;

        System.out.print("Enter a number: ");
        number = Integer.valueOf(scanner.nextLine());

        System.out.println(number);

    }
}