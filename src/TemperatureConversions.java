import java.util.Scanner;

public class TemperatureConversions {

    private static double celsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    private static double fahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature type of number (Celsius, Fahrenheit) : ");
        String temperatureType = input.next();

        if ("Fahrenheit".equals(temperatureType) || "Celsius".equals(temperatureType)) {

            System.out.print("Enter number : ");

            if (temperatureType.equals("Fahrenheit")) {
                System.out.printf("%.2f degree celsius", celsius(input.nextDouble()));
            }
            if (temperatureType.equals("Celsius")) {
                System.out.printf("%.2f degree fahrenheit", fahrenheit(input.nextDouble()));
            }

        }
        else System.out.print("Did not state correct temperature type");

    }

}
