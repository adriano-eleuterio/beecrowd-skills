package exercises.beginner;

import java.util.Locale;
import java.util.Scanner;

public class Media01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        String a = scan.nextLine();
        String b = scan.nextLine();

        double somaPesos = 3.5 + 7.5;

        double media = (((Double.parseDouble(a) * 3.5) + (Double.parseDouble(b) * 7.5)) / somaPesos);

        System.out.printf("MEDIA = %.5f%n", media);
    }

}
