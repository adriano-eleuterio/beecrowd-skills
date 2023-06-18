package exercises;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ProdutoSimples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int v1 = scan.nextInt();
        int v2 = scan.nextInt();

        int prod = v1 * v2;

        System.out.printf("PROD = %d%n", prod);

    }
}