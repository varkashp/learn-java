import java.util.Scanner;

public class Q7_8e {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] w = new float[99];
        String exitWord = "";
        int counter = 0;
        float maxVal;
        float minVal;

        // Initialize the array

        while (counter < 99){

            System.out.print("\nEnter exit if you want to stop : ");
            exitWord = input.next();

            if ("exit".equals(exitWord)) {
                if (counter == 0) {
                    return;
                }
                break;
            }

            System.out.printf("Enter number for element %d in array f : ", counter);
            w[counter] = input.nextFloat();
            counter ++;

        }

        // Find max value

        maxVal = w[0];

        for (int t = 0; t < 98; t ++) {
            maxVal = Math.max(maxVal, w[t + 1]);
        }

        // Find max value

        minVal = w[0];

        for (int t = 0; t < 98; t ++) {
            minVal = Math.min(maxVal, w[t + 1]);
        }

        System.out.printf("\nThe smallest value is %.2f", minVal);
        System.out.printf("\nThe largest value is %.2f\n", maxVal);

    }

}