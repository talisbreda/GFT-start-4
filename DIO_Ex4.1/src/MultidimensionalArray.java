import java.io.IOException;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        char O = scan.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if ((j >= 7) && (i <= (j - 1) && i > (11 - j))) {
                    soma += M[i][j];
                }
            }
        }
        if (O == 'M') soma /= 30;
        System.out.println(soma);

    }
}
