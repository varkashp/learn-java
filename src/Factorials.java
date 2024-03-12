import java.io.PrintStream;

public class Factorials {

    public static void main(String[] args) {

        long factorial = 1;

        System.out.println("n      n!");
        for (int counter = 1 ; counter <= 20 ; counter ++ ) {

            System.out.printf("%-7d", counter);
            System.out.printf("%-25d\n", factorial);

            factorial *= (counter + 1);

        }
    }
}
