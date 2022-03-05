import java.util.Scanner;

public class somaPimentoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int amarelos = scan.nextInt();
        int vermelhos = scan.nextInt();
        int soma = amarelos + vermelhos;

        System.out.printf("X = %s", soma);
    }
}
