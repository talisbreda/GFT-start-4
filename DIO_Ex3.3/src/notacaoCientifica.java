import java.util.Scanner;

public class notacaoCientifica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = 1;

        while (number != 0) {
            number = scan.nextDouble();
            int expoente = 0;

            if (number != 0) {
                while ((number < 1 && number > -1) || number >= 10 || number <= -10) {
                    if (number >= 10 || number <= -10) {
                        number /= 10;
                        expoente ++;
                    } else {
                        number *= 10;
                        expoente --;
                    }
                }
            }

            if (number > 0) {
                if (expoente >= 0) {
                    System.out.printf("+%.4fE+%02d", number, expoente);
                } else {
                    System.out.printf("+%.4fE%03d", number, expoente);
                }
            } else if (expoente >= 0) {
                System.out.printf("%.4fE+%02d", number, expoente);
            } else {
                System.out.printf("%.4fE%03d", number, expoente);
            }
        }

    }
}
