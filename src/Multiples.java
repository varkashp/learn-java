import java.util.Scanner;

public class Multiples {

    private static boolean isMultiple(int integerOne, int integerTwo) {
        if (integerTwo % integerOne == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        while (true){

            System.out.print("Enter First Integer : ");
            int numberOne = value.nextInt();
            System.out.print("Enter Second Integer : ");
            int numberTwo = value.nextInt();

            boolean multiple = isMultiple(numberOne, numberTwo);
            System.out.printf("%b\n", multiple);

            System.out.print("Enter exit statement : ");
            String string = value.next();
            if (string.equals("exit")) {
                return;
            }

        }
    }

}
