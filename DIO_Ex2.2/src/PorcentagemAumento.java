import java.io.IOException;
import java.util.Scanner;

public class PorcentagemAumento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double initialValue = leitor.nextDouble();
        double finalValue = leitor.nextDouble();

        double percentage = ((finalValue / initialValue) - 1) * 100;
        System.out.printf("%.2f%%", percentage );

    }
}
