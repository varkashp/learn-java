import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int MilesDriven = 0;
        int Gallons = 0;
        double MilesPerGallon = 0.00;

        int TotalMilesDriven = 0;
        int TotalGallons = 0;
        double TotalMilesPerGallon = 0.00;

        int TripCounter = 0;

        while (true) {

            TripCounter += 1;

            System.out.printf("Enter miles driven for trip %d : ", TripCounter);
            MilesDriven = input.nextInt();
            if (MilesDriven < 0) {
                return;
            }
            System.out.printf("Enter gallons used for trip %d : ", TripCounter);
            Gallons = input.nextInt();
            if (Gallons < 0) {
                return;
            }

            MilesPerGallon = (double) MilesDriven / Gallons;

            TotalMilesDriven = TotalMilesDriven + MilesDriven;
            TotalGallons = TotalGallons + Gallons;

            TotalMilesPerGallon = (double) TotalMilesDriven /TotalGallons;

            System.out.printf("\nMiles per gallon for this trip is : %.2f%n", MilesPerGallon);
            System.out.printf("Average miles per gallons for all trips is : %.2f%n\n", TotalMilesPerGallon);

        }
    }
}
