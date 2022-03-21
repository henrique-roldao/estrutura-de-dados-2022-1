import java.util.Random;

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

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(9)+1;
            }
        }

        System.out.println(matriz[0][0] + "|" + matriz[0][1] + "|" + matriz[0][2] + "|" + matriz[0][3] + "|" + matriz[0][4]);
        System.out.println(matriz[1][0] + "|" + matriz[1][1] + "|" + matriz[1][2] + "|" + matriz[1][3] + "|" + matriz[1][4]);
        System.out.println(matriz[2][0] + "|" + matriz[2][1] + "|" + matriz[2][2] + "|" + matriz[2][3] + "|" + matriz[2][4]);
        System.out.println(matriz[3][0] + "|" + matriz[3][1] + "|" + matriz[3][2] + "|" + matriz[3][3] + "|" + matriz[3][4]);
        System.out.println(matriz[4][0] + "|" + matriz[4][1] + "|" + matriz[4][2] + "|" + matriz[4][3] + "|" + matriz[4][4]);

    }
}
