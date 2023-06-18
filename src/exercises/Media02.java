package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Media02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        double somaPesos = 2 + 3 + 5;

        double media = (((Double.parseDouble(a) * 2) + (Double.parseDouble(b) * 3) + (Double.parseDouble(c) * 5)) / somaPesos);

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
