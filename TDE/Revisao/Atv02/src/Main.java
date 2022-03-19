import java.util.Scanner;

public class Main {
    /*
       Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário.
       Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada.
       Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).Utilize vetores
     */

    public static void main(String[] args) {
        double media, soma=0;
        int quantidade;

        Scanner tc = new Scanner(System.in);
        System.out.println("Qual a quantidade de notas? ");
        quantidade = tc.nextInt();

        double [] nota = new double[quantidade];

        for(int i = 0; i < nota.length; i++) {
            System.out.println("Nota do aluno " + (i+1) + ":");
            nota[i] = tc.nextDouble();
            soma += nota[i];
        }

        media = soma / nota.length;
        for(int i = 0; i < nota.length; i++) {
            if (nota[i] >= media) {
                System.out.println("Aluno " + (i+1) + ": " + ConsoleColors.GREEN_BOLD_BRIGHT + nota[i] + ConsoleColors.RESET );
            }
        }

        for(int i = 0; i < nota.length; i++) {
            if (nota[i] < media) {
                System.out.println("Aluno " + (i+1) + ": " + ConsoleColors.RED_BOLD_BRIGHT + nota[i] + ConsoleColors.RESET);
            }
        }

    }
}
