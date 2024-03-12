import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        double GrossPay = 0.00;
        int counter = 0;

        // Employee 1

        while (counter < 3) {

            counter += 1;

            Scanner input = new Scanner(System.in);

            System.out.printf("Enter name of employee %d : ", counter);
            String EmployeeName = input.nextLine();
            System.out.print("Enter amount of hours worked last week : ");
            int HoursWorked = input.nextInt();
            System.out.print("Enter hourly rate in dollars per hour : ");
            double HourlyRate = input.nextDouble();

            if (HoursWorked > 40) {
                GrossPay = (HoursWorked - 40) * (HourlyRate * 1.5);
                GrossPay = GrossPay + (40 * HourlyRate);
                System.out.printf("\nGross pay of %s is : %.2f%n\n", EmployeeName, GrossPay);
            } else if (HoursWorked >= 0) {
                GrossPay = HoursWorked * HourlyRate;
                System.out.printf("\nGross pay of %s is : %.2f%n\n", EmployeeName, GrossPay);
            }

        }

    }
}
