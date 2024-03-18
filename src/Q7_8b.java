import java.util.Scanner;

public class Q7_8b {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] g = new int[5];

        for(int i = 0; i < 5; i ++) {

            System.out.printf("Enter integer for element %d in array g : ", i);
            g[i] += input.nextInt();

        }

        for(int f = 0; f < 5; f ++) {

            g[f] = 8;
            System.out.printf("\nd[%d] = %d", f, g[f]);

        }

    }

}