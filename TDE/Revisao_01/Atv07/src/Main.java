;import java.util.Random;

public class Main {
    /*
         Escreva uma classe Estatística em Java que faça a leitura de uma Matriz 5x5, a classe deve ao final mostrar:
        A moda dos elementos no	array (elemento	mais freqüente).
        A mediana dos elementos no array (elemento central).
        A média.

     */
    public static void main(String[] args) {
        Random random = new Random();
        int [][] matriz = new int [5][5];
        int l,c;
        int media, total=0;
        int [] vetor = new int[25];

        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                matriz[l][c] = random.nextInt(15);
            }
        }

        int i = 0;
        for(l = 0; l < 5; l++) {
            for(c = 0; c < 5; c++) {
                vetor[i] = matriz[l][c];
                i++;
            }
        }
        for(i = 0; i < 25; i++) {
            for(int j = i+1; j < 25; j++) {
                if(vetor[i] > vetor[j]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }
        }
        for(i = 0; i < 25; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Mediana: " + vetor[24/2]);

    }
}
