import java.util.Random;

public class Atividade16 {

    public static void main(String[] args) {
        Random random = new Random();

        int [] vetor1 = new int[10];
        for(int i = 0; i < 10; i++) {
            vetor1[i] = random.nextInt(100) + 1;
        }

        int [] vetor2 = new int[5];
        for(int i = 0; i < 5; i++) {
            vetor2[i] = random.nextInt(100) + 1;
        }

        int somaVetor2 = vetor2[0] + vetor2[1] + vetor2[2] + vetor2[3] + vetor2[4];
        int [] vetorResultante1 = new int[10];
        int [] vetorResultante2 = new int[10];

        for(int i = 0; i < 10; i++) {
            if(vetor1[i] % 2 == 0) {
                vetorResultante1[i] = vetor1[i] + somaVetor2;
            }
        }

        for(int i = 0; i < 10; i++) {
            if(vetor1[i] % 2 == 1) {
                vetorResultante2[i] = vetor1[i] + somaVetor2;
            }
        }

        System.out.println("Primeiro vetor resultante: ");
        for(int i = 0; i < 10; i++) {
            System.out.printf(vetorResultante1[i] + " - ");
        }

        System.out.println("");
        System.out.println("Segundo vetor resultante: ");
        for(int i = 0; i < 10; i++) {
            System.out.printf(vetorResultante2[i] + " - ");
        }

    }


}
