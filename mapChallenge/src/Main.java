import java.util.*;

public class Main {

    /*Faça um programa que simule um lançamento de dados.
    Lance o dado 100 vezes e armazene.
    Depois, mostre quantas vezes cada valor foi inserido.*/

    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Integer> dados = new HashMap<>();
        Map<Integer, Integer> count = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            dados.put(rand.nextInt(100), rand.nextInt(10));
        }
        for (Map.Entry<Integer, Integer> dado : dados.entrySet()) {
            if (count.containsKey(dado.getValue())) {
                count.put(dado.getValue(), count.get(dado.getValue()) + 1);
            } else {
                count.put(dado.getValue(), 0);
            }
        }
        System.out.println(count);
    }
}
