import java.util.Arrays;
import java.util.Scanner;

public class Q7_8b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] g = new int[5];

        for(int idx = 0; idx < 5; idx ++) {
            g[idx] = 8;
            System.out.printf("\nd[%d] = %d", idx, g[idx]);
        }
        System.out.println("Array is set to: " + Arrays.toString(g));

    }

}