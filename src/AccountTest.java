import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Cool Kid", 300.00);
        Account account2 = new Account("Nobody white", 530.00);

        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        // Testing deposit for Account

        System.out.print("Enter deposit amount for account1 :");
        double depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account1 \n\n", depositAmount);
        account1.deposits(depositAmount);

        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2 :");
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account2 \n\n", depositAmount);
        account2.deposits(depositAmount);

        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());

        // Testing withdrawal from Account

        System.out.print("Enter withdrawal amount for account1 :");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("withdrawing %.2f to account1 \n\n", withdrawalAmount);
        account1.withdraw(withdrawalAmount);

        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account2 :");
        withdrawalAmount = input.nextDouble();
        System.out.printf("withdrawing %.2f to account2 \n\n", withdrawalAmount);
        account2.deposits(withdrawalAmount);

        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());

    }

}
