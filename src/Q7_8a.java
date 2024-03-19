import java.util.Scanner;

public class Q7_8a {

    public static void main(String[] args) {

        String exitWord = "";
        Scanner input = new Scanner(System.in);
        int index = 0;
        int[] f = new int[100];

        while (true) {

            System.out.print("\nEnter exit if you want to stop : ");
            exitWord = input.next();

            if ("exit".equals(exitWord)) {
                if (index == 0) {
                    return;
                }
                break;
            }

            System.out.printf("Enter integer for element %d in array: ", index);
            f[index] = input.nextInt();
            index ++;

        }

        System.out.printf("\nThe value of element 6 of array = %d", f[5]);

    }

}