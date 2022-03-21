import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class Main {
    public static void main(String[] args) {
        /*System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};

        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        //precisamos organizar os valores. Logo:
        // Anonymous function
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });
        set.addAll(agenda.entrySet());
        System.out.println("--\tOrdem número telefone\t--");
        print(set);

        // Functional interface
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer,Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));

        set1.addAll(agenda.entrySet());
        System.out.println("--\tOrdem número telefone\t--");
        print(set1);

        // Lambda
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        set2.addAll(agenda.entrySet());
        System.out.println("--\tOrdem número telefone\t--");
        print(set2);

        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));

        set3.addAll(agenda.entrySet());
        System.out.println("--\tOrdem nome contato\t--");
        print(set3);
    }
    public static void print(Set<Map.Entry<Integer, Contato>> set) {
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }*/
        // Crie uma lista com números aleatórios
        Random rand = new Random();
        List<String> randomNumbers = Arrays.asList(
                "1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        /*System.out.println("Imprima todos os elementos dessa lista");
        randomNumbers.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque em um set");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nTransforme a lista em uma lista de números inteiros");*/
        List<Integer> randomNumbers1 = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*System.out.println("\nColoque os números pares maiores que 2 em uma lista");
        randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .toList()
                .forEach(System.out::println);

        System.out.println("Mostre a média dos números");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os números ímpares");
        randomNumbers1.removeIf(i -> i % 2 != 0);
        randomNumbers1.forEach(System.out::println);*/

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");
        randomNumbers1.stream()
                        .skip(3)
                        .forEach(System.out::println);

        System.out.println("Retirando os números repetidos da lista, quantos números ficam?");
        long dinstincts = randomNumbers1.stream()
                .distinct()
                .count();
        System.out.println(dinstincts);

        System.out.println("Mostre o menor valor da lista");
        randomNumbers1.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);


        System.out.println("Mostre o maior valor da lista");
        randomNumbers1.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        System.out.println("Pegue apenas os números ímpares e some");
        int sum = randomNumbers1.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        System.out.println("Mostre a lista na ordem numérica");
        randomNumbers1.stream()
                .sorted(Comparator.naturalOrder())
                .toList()
                .forEach(System.out::println);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 e de 5");
        Map<Boolean, List<Integer>> mult3e5 = randomNumbers1.stream().
                collect(Collectors.groupingBy(i -> i % 3 == 0 || i % 5 == 0));
        System.out.println(mult3e5);
    }
}
