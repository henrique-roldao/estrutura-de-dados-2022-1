import java.util.Random;

public class Atividade13 {
    public static void main(String[] args) {

        int count = 0;
        Random random = new Random();
        int [] numbers = new int[10];

        for(int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        for (int j = 0; j < 10; j++) {
            if(numbers[j] > 50) {
                System.out.println(numbers[j] +" é superior a cinquenta, se encontra na posição: " + (j+1));
                count++;
            }
        }

        if (count < 1 ) {
            System.out.println("Nenhum número foi superior a cinquenta!");
        }
    }
}
