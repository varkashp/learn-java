public class DiamondPrinting {

    public static void main(String[] args) {

        int asterisk = 1;
        int space = 4;

        int incrementSign = 1;

        for (int counter = 1 ; counter < 10 ; counter++) {

            if (counter > 4) {
                incrementSign = -1;
            }
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            space -= incrementSign;
            for (int n = 1; n <= asterisk ; n++) {
                System.out.print("*");
            }
            asterisk += 2 * incrementSign;
            System.out.print("\n");

        }

    }

}