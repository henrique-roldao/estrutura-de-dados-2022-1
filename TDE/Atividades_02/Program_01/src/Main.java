import java.util.Scanner;

public class Main {

    /*
    Faça um programa para ler uma matriz 4 por 4, contendo os valores de notas de g1,
    e outro de g2. Ao final, o programa deve mostrar as médias dos alunos,
    mostrando se o aluno está aprovado, em exame ou reprovado.
    Considere média > 7 para aprovação,7 < média >6 para exame; e < 6 como reprovado.
    Importante deve ser validado que as notas aceitas sejam de 0 a 10
     */

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Qual o tamanho da matriz? ");
        int n = tc.nextInt();

        double [][] notas = new double[n][n];

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                notas[l][c] = lerNotasAluno();
            }
        }

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                System.out.println(notas[l][c]);
            }
        }
    }

    public static double lerNotasAluno() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Nota G1: ");
        double g1 = tc.nextDouble();
        System.out.print("Nota G2: ");
        double g2 = tc.nextDouble();
        System.out.println("");
        if (validarNotas(g1, g2) == false) {
            lerNotasAluno();
        }
        return (g1 + g2) / 2;
    }

    public static boolean validarNotas(double g1, double g2) {
        if(g1 >= 0 && g1 <= 10 && g2 >= 0 && g2 <= 10) {
            return true;
        }
        return false;
    }

}
