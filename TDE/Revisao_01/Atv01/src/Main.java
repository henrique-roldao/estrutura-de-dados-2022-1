import java.util.Scanner;

public class Main {
    /*
    Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a média das notas
    da turma e em seguida exibe a relação de nomes cuja nota é superior a esta média.
    Utilize vetores para armazenar as notas.
    */

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        String [] aluno = new String[5];
        double [] nota = new double[5];
        double media, soma=0;

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Qual o nome do aluno? ");
            aluno[i] = tc.nextLine();
            System.out.println("Qual a nota de " + aluno[i] + "? ");
            nota[i] =  tc2.nextDouble();
            soma += nota[i];
        }
        media = soma / nota.length;
        System.out.println( "A média é " +ConsoleColors.GREEN_BOLD_BRIGHT + media + ConsoleColors.RESET);
        for (int i = 0; i < nota.length; i++) {
            if ( nota [i] >= media ) {
                System.out.println(aluno[i] + ConsoleColors.GREEN_BOLD_BRIGHT + " Acima da média" + ConsoleColors.RESET + " nota: " + ConsoleColors.GREEN_BOLD_BRIGHT + nota[i] + ConsoleColors.RESET);
            }
        }
    }
}
