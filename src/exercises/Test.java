package exercises;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int countChance = 0;
        int rand = 0;
        int input;

        while (countChance < 5) {
            rand = new Random().nextInt(2);
            System.out.println("Informe número de 0 a 100");
            input = scann.nextInt();
            countChance++;
            if (input > rand) {
                System.out.println("Número informado é maior");
            } else if (input < rand) {
                System.out.println("Número informado é menor");
            } else {
                System.out.println("Número encontrado = " + rand);
                break;
            }
        }

        if (countChance ==4 ){
            System.out.println("Tentativas esgotadas !");
        }

        }
    }

