public class Main {

    /*
        Crie um vetor capaz de armazenar 50 números inteiros.
        Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja,
        na posição número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente.
     */

    public static void main(String[] args) {

        int [] vetor = new int[50];
        int preenchimento = 101;

        for (int i = 0; i < 50; i++) {
            vetor [i] = preenchimento;
            preenchimento++;
            System.out.print(vetor[i] + " - ");
        }
    }
}
