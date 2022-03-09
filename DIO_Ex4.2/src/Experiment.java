import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int experimentos = scan.nextInt();
        float coelhos = 0, ratos = 0, sapos = 0, totalCobaias = 0;

        for (int i = 0; i < experimentos; i++) {
            int cobaias = scan.nextInt();
            char tipo = scan.next().charAt(0);
            switch (tipo) {
                case 'C':
                    coelhos += cobaias;
                    break;
                case 'R':
                    ratos += cobaias;
                    break;
                case 'S':
                    sapos += cobaias;
                    break;
            }
            totalCobaias += cobaias;
        }

        System.out.printf("Total: %.0f cobaias %n", totalCobaias);
        System.out.printf("Total de coelhos: %.0f %n", coelhos);
        System.out.printf("Total de ratos: %.0f %n", ratos);
        System.out.printf("Total de sapos: %.0f %n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %% %n", (coelhos / totalCobaias) * 100);
        System.out.printf("Percentual de ratos: %.2f %% %n", (ratos / totalCobaias) * 100);
        System.out.printf("Percentual de sapos: %.2f %% %n", (sapos / totalCobaias) * 100);
    }
}
