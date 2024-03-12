import java.util.Scanner;

public class Q2_30 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 digit integer: ");
        int number = input.nextInt();

        if (number >= 100000){
            System.out.println("This is not a 5 digit integer");
            return;
        }
        if (number < 10000){
            System.out.println("This is not a 5 digit integer");
            return;
        }

        int operation1 = number / 10;
        int solution1 = number - (operation1 * 10);

        int operation2 = number / 100;
        int solution2 = (number - (operation2 * 100) - solution1) / 10;

        int operation3 = number / 1000;
        int solution3 = (number - (operation3 * 1000) - (solution2 * 10) - solution1) / 100;

        int operation4 = number / 10000;
        int solution4 = (number - (operation4 * 10000) - (solution3 * 100) - (solution2 * 10) - solution1) / 1000;

        int solution5 = (number - (solution4 * 1000) - (solution3 * 100) - (solution2 * 10) - solution1) / 10000;

        System.out.printf("%d   %d   %d   %d   %d", solution5, solution4, solution3, solution2, solution1);

    }
}

