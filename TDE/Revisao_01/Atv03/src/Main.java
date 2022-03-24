import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    /*
        Leia um conjunto de alunos, cada uma com o nome e a nota.
        Em seguida exiba o nome dos alunos que possuem a nota maior do que a média da turma
     */

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);

        Scanner tc = new Scanner(System.in);
        System.out.println("Qual a quantidade de alunos que deseja conferir? ");
        int n = tc.nextInt();

        Scanner tc2 = new Scanner(System.in);
        double soma =0, media;
        String [] aluno = new String[n];
        double [] nota = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Qual o nome do aluno? ");
            aluno[i] = tc2.nextLine();
            System.out.println("Qual a nota de " + aluno[i] + "? ");
            nota[i] =  tc.nextDouble();
            soma += nota[i];
        }

        media = soma / n;

        System.out.println("Média: " + ConsoleColors.WHITE_BOLD_BRIGHT + decimalFormat.format(media) + ConsoleColors.RESET);
        System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT + "Alunos acima da média: " +ConsoleColors.RESET);
        for(int i = 0; i< n; i++) {
            if(nota[i] > media) {
                System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + aluno[i] + ConsoleColors.RESET);
            }
        }
    }
}
