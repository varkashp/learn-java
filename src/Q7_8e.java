import java.util.Scanner;
import java.util.Arrays;

public class Q7_8e {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] w = new float[99];
        float[] t = new float[99];
        String exitWord = "";
        int counter = 0;

        // Initalize a 99 element floating point array

        // Iterate and find the Min

        // Iterated and find the max



        while (counter < 99){

            System.out.print("\nEnter exit if you want to stop : ");
            exitWord = input.next();

            if ("exit".equals(exitWord)) {
                if (counter == 0) {
                    return;
                }
                t = new float[counter];
                System.arraycopy(w, 0, t, 0, counter );

                break;
            }


            System.out.printf("Enter number for element %d in array w : ", counter);
            w[counter] = input.nextFloat();

            counter ++;

        }

        Arrays.sort(t);

        System.out.printf("\nThe smallest value is %.2f", t[0]);
        System.out.printf("\nThe largest value is %.2f\n", t[(t.length - 1)]);

    }

}