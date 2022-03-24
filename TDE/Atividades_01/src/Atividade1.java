import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Atividade1 {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        int count = 0;
        double average, total=0;
        double [] temp = new double[7];

        Random random = new Random();

        for(int i = 0; i < temp.length; i++) {
            temp[i] = random.nextDouble(40)+1;
        }

        for(int i = 0; i < temp.length; i++) {
            total += temp[i];
        }

        average = total / 7;

        for(int i = 0; i < 7; i++) {
            if(temp[i] - average > 0) {
                count++;
            }
        }

        System.out.println(count + " temperaturas ficaram acima da média de " + decimalFormat.format(average)+"°");
    }
}
