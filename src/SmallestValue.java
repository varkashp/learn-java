import java.util.Scanner;
public class SmallestValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of integers : ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.print("The number of integers must be greater than 0");
            return;
        }

        System.out.print("Enter integer : ");
        int firstInteger = input.nextInt();
        int smallestInt = firstInteger;

        for (int counter = number ; counter > 1 ; counter--) {

            System.out.print("Enter integer : ");
            int secondInteger = input.nextInt();
            smallestInt = Math.min(secondInteger, firstInteger);
            firstInteger = smallestInt;

        }

        System.out.printf("Smallest Integer is : %d", smallestInt);

    }
}
