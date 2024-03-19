import java.util.Scanner;

public class Q7_8c {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] c = new float[100];
        String exitWord = "";
        float sum = 0;

        // Initialize array c with 100 floats
        // The array by default is initialized with all zeros, elements not set by input defaults
        // to 0
        for(int i = 0; i < 100; i ++) {
            System.out.print("\nEnter exit if you want to stop : ");
            exitWord = input.next();

            if ("exit".equals(exitWord)) {
                break;
            }

            System.out.printf("Enter number for element %d in array f : ", i);
            c[i] = input.nextFloat();
        }

        // Sum all 100 elements of the array c
        for(int idx = 0; idx < 100; idx++) {
            sum += c[idx];
        }
        System.out.printf("\nThe total of all the elements of array c is %.2f", sum);

    }

}