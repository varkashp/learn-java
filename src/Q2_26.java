import java.util.Scanner;

public class Q2_26 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter integer 1: ");
        int number1 = input.nextInt();


        System.out.println("Enter integer 2: ");
        int number2 = input.nextInt();


        int remainder = number1 % number2;


        if (remainder == 0) {
            System.out.print("Yes, the first number is a multiple of the second number");
        }


        if (remainder != 0) {
            System.out.print("No, the first number is not a multiple of the second number");
        }


    }
}

