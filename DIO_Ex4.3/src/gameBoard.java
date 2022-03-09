import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class gameBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt();
        int tabuleiro[][] = new int[tamanho][tamanho];
        int operacoes = scan.nextInt();
        int valor = 0;

        for (int i = 0; i < operacoes; i++) {
            int comando = scan.nextInt();
            switch (comando) {
                case 1:
                    int linha = scan.nextInt();
                    valor = scan.nextInt();
                    for (int j = 0; j < tamanho; j++) {
                        tabuleiro[linha][j] = valor;
                    }
                    break;
                case 2:
                    int coluna = scan.nextInt();
                    valor = scan.nextInt();
                    for (int j = 0; j < tamanho; j++) {
                        tabuleiro[j][coluna] = valor;
                    }
                    break;
                case 3:
                    linha = scan.nextInt();
                    for (int j = 0; j < tamanho; j++) {
                        tabuleiro[linha][j] = valor;
                    }
            }
        }
    }
}
