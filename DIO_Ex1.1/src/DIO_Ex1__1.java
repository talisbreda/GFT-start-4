import java.util.Scanner;

public class DIO_Ex1__1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A, B, media;

        A = scan.nextDouble();
        B = scan.nextDouble();

        // Complete os espaços em branco com as respectivas variáveis para o cálculo da média.
        media = (A * 3.5 + B * 7.5)/11;

        // Complete com a variável que representa o resultado da média.
        System.out.printf("MEDIA = %.5f", media);
        System.out.println();
    }
}
