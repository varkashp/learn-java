import java.util.Scanner;

public class BarChartPrinting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int RepetitionNumber = 0;

        int integerOne = 0;
        int integerTwo = 0;
        int integerThree = 0;
        int integerFour = 0;
        int integerFive = 0;

        for (int counter = 1; counter <= 5; counter++) {

            System.out.print("Enter number : ");
            int number = input.nextInt();
            if (number < 0) {
                System.out.print("The bar chart can't display a value less than zero");
                return;
            }

            switch (counter) {
                case 1:
                    integerOne = number;
                case 2:
                    integerTwo = number;
                case 3:
                    integerThree = number;
                case 4:
                    integerFour = number;
                case 5:
                    integerFive = number;
                }

            }

        for (int i = 1; i <= 5; i++) {

            if (i == 1) {
                RepetitionNumber = integerOne;
            } else if (i == 2) {
                RepetitionNumber = integerTwo;
            } else if (i == 3) {
                RepetitionNumber = integerThree;
            } else if (i == 4) {
                RepetitionNumber = integerFour;
            } else {
                RepetitionNumber = integerFive;
            }
            for (int n = 1; n <= RepetitionNumber; n++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}
