import java.util.Scanner;

public class CircleArea {

    private static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        double radius = input.nextDouble();

        double area = circleArea(radius);
        System.out.printf("Area of circle with radius %.2f = %.2f%n", radius, area);

    }

}
