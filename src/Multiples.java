import java.util.Scanner;

public class Multiples {

    private static boolean isMultiple(int integerOne, int integerTwo) {
        return integerOne % integerTwo == 0;
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        while (true){
            System.out.print("Enter First Integer : ");
            final int  numberOne  = value.nextInt();
            System.out.print("Enter Second Integer : ");
            final int numberTwo = value.nextInt();

            boolean multiple = isMultiple(numberOne, numberTwo);
            System.out.printf("%d is a multiple of %d - %b\n", numberTwo, numberOne, multiple);

            System.out.print("Do you want to continue?: y/n ");
            String string = value.next();
            if (string.compareToIgnoreCase("n") == 0) {
                return;
            }

        }
    }

}
