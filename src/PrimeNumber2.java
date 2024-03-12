import java.util.Scanner;

public class PrimeNumber2 {

    private static boolean isPrime(int number) {

        if (number == 1) return false;

        for (int counter = 2; counter <= Math.sqrt(number) ; counter ++) {
            if (0 == number % counter) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to find all prime numbers less than it : ");
        int number = input.nextInt();

        for (int counter = 1; counter <= number; counter++) {
            if (isPrime(counter)) {
                System.out.printf("%d\n", counter);
            }
        }



    }

}
