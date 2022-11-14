//        Task 3
//        After the try-catch expression, but before the printout, call another method called validate and
//        send the number as an input argument. The call could look like this:
//        validate(number);

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 100;

        System.out.print("Enter a number: ");

        try {
            number = Integer.valueOf(scanner.nextLine());

        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        try{
            validate(number);

        }catch (Exception e){
            System.out.println("Number is negative");
        }
        System.out.println(number);
    }

    static void validate (int number) throws Exception{
        if (number < 0) {
            throw new Exception();
        }
    }
}
