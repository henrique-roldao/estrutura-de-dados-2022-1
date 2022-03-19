import java.util.Random;

public class Main {

    /*
        Crie um vetor capaz de armazenar 50 números inteiros.
        Em seguida faça o seu preenchimento automático de forma randômica.
        Em seguida, exiba os valores deste vetor.
     */
    public static void main(String[] args) {

        Random random = new Random();
        int [] vetor = new int[50];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100)+1;
            System.out.print(vetor[i] + " - ");
        }

    }
}
