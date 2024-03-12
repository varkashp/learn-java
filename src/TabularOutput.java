public class TabularOutput {
    public static void main(String[] args) {

        int Counter = 0;
        System.out.println("N    10*N  100*N  1000*N");

        while (Counter < 5) {
            Counter += 1;
            System.out.printf("%d    %d    %d    %d\n", Counter, (Counter*10), (Counter*100), (Counter*1000));
        }
    }
}
