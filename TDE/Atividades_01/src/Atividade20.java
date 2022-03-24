import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int option;

        double [] numbers = new double[5];
        numbers [0] = 10.3;
        numbers [1] = 20.2;
        numbers [2] = 8.9;
        numbers [3] = 12.4;
        numbers [4] = 50.2;

        do {
            do {
                System.out.println("Digite 1 para ordem direta, 2 para ordem inversa e 0 para encerrar o programa");
                option = tc.nextInt();
            } while(option < 0 || option > 2);

            switch(option){
                case 1:
                    System.out.println(numbers[0] + " - " + numbers[1] + " - " +numbers[2] + " - " +numbers[3] + " - " + numbers[4]);
                    break;
                case 2:
                    System.out.println(numbers[4] + " - " + numbers[3] + " - " +numbers[2] + " - " +numbers[1] + " - " + numbers[0]);

                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
            }
        } while (option != 0);

    }
}
