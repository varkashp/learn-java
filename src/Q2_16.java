import java.util.Scanner;

public class Q2_16 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter integer 1: ");
        int number1 = input.nextInt();


        System.out.println("Enter integer 2: ");
        int number2 = input.nextInt();


        if (number1 > number2) {
            System.out.printf("%d", number1);
            System.out.print(" is larger\n");
        }


        if (number2 > number1) {
            System.out.printf("%d", number2);
            System.out.print(" is larger\n");
        }


        if (number1 == number2) {
            System.out.print("These numbers are equal");
        }


    }
}

