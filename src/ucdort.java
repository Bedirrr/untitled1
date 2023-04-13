import java.util.Scanner;

public class ucdort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("0-" + n + " arasındaki 3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}