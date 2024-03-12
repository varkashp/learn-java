import java.util.Scanner;

public class TemperatureConversions {

    private static double celsius(double fahrenheit) {
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        return celsius;
    }

    private static double fahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature type of number (Celsius, Fahrenheit) : ");
        String temperatureType = input.next();

        if ("Fahrenheit".equals(temperatureType.intern()) || "Celsius".equals(temperatureType.intern())) {

            System.out.print("Enter number : ");

            if (temperatureType.equals("Fahrenheit")) {
                System.out.printf("%.2f degree celsius", celsius(input.nextDouble()));
            }
            if (temperatureType.equals("Celsius")) {
                System.out.printf("%.2f degree fahrenheit", fahrenheit(input.nextDouble()));
            }

        }

    }

}
