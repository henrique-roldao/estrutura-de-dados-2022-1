public class Atividade1 {

    public static void main(String[] args) {
        int count = 0;
        double average, total;
        double [] temp = new double[7];

        temp [0] = 23.3;
        temp [1] = 23.7;
        temp [2] = 28.2;
        temp [3] = 15.0;
        temp [4] = 13.1;
        temp [5] = 21.9;
        temp [6] = 25.3;

        total = temp[0] + temp[1] + temp[2] + temp[3] + temp[4] + temp[5] + temp[6];
        average = total / 7;

        for(int i = 0; i < 7; i++) {
            if(temp[i] - average > 0) {
                count++;
            }
        }

        System.out.println(count + " temperaturas ficaram acima da média de " + average);
    }
}
