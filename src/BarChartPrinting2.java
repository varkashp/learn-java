import java.util.Scanner;

public class BarChartPrinting2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[5];

        for (int counter = 0; counter < 5; counter++) {

            System.out.print("Enter number : ");
            number[counter] = input.nextInt();
            if (number[counter] < 0) {
                System.out.print("The bar chart can't display a value less than zero");
                return;
            }
        }

        for (int i = 0; i < 5; i++) {

            for (int n = 1; n <= number[i]; n++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}
