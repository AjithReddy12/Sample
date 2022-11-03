import java.util.Scanner;

public class Demeo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (n = 2; n <= 5; n++) {

            if (n % 2 != 0) {
                System.out.println("Wierd");
            } else {
                System.out.println("not wierd");
            }
        }
    }

}