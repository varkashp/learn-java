import java.util.Scanner;

public class Q7_8d {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] a = new int[11];
        int[] b = new int[34];

        for(int h = 0; h < 34; h ++) {

            System.out.printf("Enter integer for element %d in array b : ", h);
            b[h] += input.nextInt();

        }

        System.out.print("\n");

        for(int i = 0; i < 11; i ++) {

            System.out.printf("Enter integer for element %d in array a : ", i);
            a[i] += input.nextInt();
            b[i] = a[i];

        }

        for(int t = 0; t < 11; t ++) {
            b[t] = a[t];
        }

        // We could also use System.arraycopy method for copying the array values
        // System.arraycopy(a, 0, b, 0, 11);

        for(int f = 0; f < 34; f ++) {

            System.out.printf("\nd[%d] = %d", f, b[f]);

        }

    }

}