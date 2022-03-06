import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double N;
        int quociente, resto, nota = 0, moeda = 0;

        N = scan.nextDouble();

        resto = (int) (N * 100.0 + 0.5);

        System.out.println("NOTAS:");

        nota = 100;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 50;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 20;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 10;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 5;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        nota = 2;
        quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);

        /*for (int i = 1; i <= 6; i++) {
            switch (i) {
                case 1: nota = 100; break;
                case 2: nota = 50; break;
                case 3: nota = 20; break;
                case 4: nota = 10; break;
                case 5: nota = 5; break;
                case 6: nota = 2; break;
            };
            quociente = resto / (nota * 100);
            System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
            resto = resto % (nota * 100);
        }*/

        System.out.println("MOEDAS:");
        String valorMoeda = "";

        moeda = 100;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 1.00");
        resto = resto % moeda;

        moeda = 50;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.50");
        resto = resto % moeda;

        moeda = 25;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.25");
        resto = resto % moeda;

        moeda = 10;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.10");
        resto = resto % moeda;

        moeda = 5;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ 0.05");
        resto = resto % moeda;

        System.out.println(resto + " moeda(s) de R$ 0.01");

        /*for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    valorMoeda = "1.00";
                    moeda = 100;
                    break;
                case 2:
                    valorMoeda = "0.50";
                    moeda = 50;
                    break;
                case 3:
                    valorMoeda = "0.25";
                    moeda = 25;
                    break;
                case 4:
                    valorMoeda = "0.10";
                    moeda = 10;
                    break;
                case 5:
                    valorMoeda = "0.05";
                    moeda = 5;
                    break;
            };
            quociente = resto / moeda;
            System.out.println(quociente + " moeda(s) de " + valorMoeda);
            resto = resto % moeda;
        }*/

        scan.close();
    }
}
