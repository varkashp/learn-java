import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 0;

        while (studentCounter < 10)  {

            studentCounter = studentCounter + 1;

            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes += 1;
            }
            else if (result == 2) {
                failures += 1;
            }
            else {
                System.out.println("Invalid entry");
                studentCounter = studentCounter - 1;
            }

        }

        System.out.printf("Passed: %d\n", passes);
        System.out.printf("Failed: %d\n", failures);

    }
}
