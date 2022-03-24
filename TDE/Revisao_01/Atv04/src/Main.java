import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
        Leia um conjunto de valores inteiros e em seguida os
        exiba-os na ordem inversa do que foram digitados.
     */

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        Random random = new Random();
        int quantidade = random.nextInt(10) + 1;
        int [] valores = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o valor: ");
            valores[i] = tc.nextInt();
        }

        for (int i = quantidade-1; i >= 0; i--) {
            System.out.print(valores[i] + " - ");
        }
    }
}
