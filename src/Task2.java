import java.util.Scanner;

public class Task2 {

//    Task 2
//
//    Prevent the program from crashing by putting the code that caused the exception inside a trycatch
//    expression. In the catch you can just print out that something went wrong.
//
//    Now the printout in the end of the program should still work since the program did not crash. It
//    should print out 100 since this was the value assigned to the number from the start. No other
//    number has been assigned since the exception was thrown before anything else was assigned to
//    the variable.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 100;

        System.out.print("Enter a number: ");
        try {
            number = Integer.valueOf(scanner.nextLine());
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(number);

    }
}
