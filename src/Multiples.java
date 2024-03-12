import java.util.Scanner;

public class Multiples {

    private static boolean isMultiple(int integerOne, int integerTwo) throws RuntimeException {
        if (integerOne == 0) {
            throw new RuntimeException("First Integer should not be zero");
        }
        return integerTwo % integerOne == 0;
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        while (true){
            System.out.print("Enter First Integer : ");
            final int  numberOne  = value.nextInt();

            System.out.print("Enter Second Integer : ");
            final int numberTwo = value.nextInt();

            try {
                boolean multiple = isMultiple(numberOne, numberTwo);
                System.out.printf("%d is a multiple of %d - %b\n", numberTwo, numberOne, multiple);
            } catch (Exception e) {
                System.out.printf("Encountered exception: %s\n",e);
            }
            System.out.print("Do you want to continue?: y/n ");
            String string = value.next();
            if (string.compareToIgnoreCase("n") == 0) {
                return;
            }

        }
    }

}
