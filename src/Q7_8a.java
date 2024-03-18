import java.util.Scanner;

public class Q7_8a {

    public static void main(String[] args) {

        String exitWord = "";
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int[] f = new int[100];

        while (true) {

            System.out.print("\nEnter exit if you want to stop : ");
            exitWord = input.next();

            if ("exit".equals(exitWord)) {
                if (counter == 0) {
                    return;
                }
                break;
            }

            System.out.printf("Enter integer for element %d in array f : ", counter);
            f[counter] += input.nextInt();

            counter ++;

        }

        System.out.printf("\nThe value of element 6 of array f is %d", f[6]);

    }

}