import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter firstname of employee 1 : ");
        String firstName1 = input.nextLine();
        System.out.print("Enter lastname of employee 1 : ");
        String lastName1 = input.nextLine();
        System.out.print("Enter monthly salary amount : ");
        double monthlySalary1 = input.nextDouble();

        Employee employee1 = new Employee(firstName1,lastName1, monthlySalary1);
        System.out.printf("\nFirstname : %s \nLastname : %s \nYearly Salary : $%.2f%n\n", employee1.getFirstName(), employee1.getLastName(), 12 * employee1.getMonthlySalary());

        Scanner value = new Scanner(System.in);

        System.out.print("Enter firstname of employee 2 : ");
        String firstName2 = value.nextLine();
        System.out.print("Enter lastname of employee 2 : ");
        String lastName2 = value.nextLine();
        System.out.print("Enter monthly salary amount : ");
        double monthlySalary2 = value.nextDouble();

        Employee employee2 = new Employee(firstName2,lastName2, monthlySalary2);
        System.out.printf("\nFirstname : %s \nLastname : %s \nYearly Salary : $%.2f%n\n", employee2.getFirstName(), employee2.getLastName(), 12 * employee2.getMonthlySalary());

        monthlySalary1 = monthlySalary1 * 1.1;
        monthlySalary2 = monthlySalary2 * 1.1;

        System.out.printf("Firstname : %s \nLastname : %s \nYearly Salary : $%.2f%n \n", employee1.getFirstName(), employee1.getLastName(), 12 * employee1.getMonthlySalary());
        System.out.printf("Firstname : %s \nLastname : %s \nYearly Salary : $%.2f%n", employee2.getFirstName(), employee2.getLastName(), 12 * employee2.getMonthlySalary());

    }
}
