import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    /*Dada a população estimada de alguns estados do NE brasileiro, faça:

    Estado = PE - População = 9.616.621
    Estado = AL - População = 3.351.543
    Estado = CE - População = 9.187.103
    Estado = RN - População = 3.534.265

    Crie um dicionário e relacione os estados e suas populações;
    Substitua a população do estado do RN por 3.534.165;
    Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
    Exiba a população PE;
    Exiba todos os estados e suas populações na ordem que foi informado;
    Exiba os estados e suas populações em ordem alfabética;
    Exiba o estado com o menor população e sua quantidade;
    Exiba o estado com a maior população e sua quantidade;
    Exiba a soma da população desses estados;
    Exiba a média da população deste dicionário de estados;
    Remova os estados com a população menor que 4.000.000;
    Apague o dicionário de estados;
    Confira se o dicionário está vazio.*/

    public static void print(Map<String, Integer> states) {
        System.out.println("\n");
        for (Map.Entry<String, Integer> state : states.entrySet()) {
            System.out.printf("Estado: %s - População: %d%n", state.getKey(), state.getValue());
        }
    }

    public static void main(String[] args) {
        // Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> states = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        // Substitua a população do estado do RN por 3.534.165;
        states.put("RN", 3534165);

        // Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        states.putIfAbsent("PB", 6039277);

        // Exiba a população PE;
        System.out.printf("%nPopulação de PE: %d", states.get("PE"));

        // Exiba todos os estados e suas populações na ordem informada;
        print(states);

        // Exiba o estado com o menor população e sua quantidade;
        Integer minPopulation = Collections.min(states.values());
        for (Map.Entry<String, Integer> state : states.entrySet()) {
            if (state.getValue().equals(minPopulation)) {
                System.out.printf("%nEstado com menor população: %s - População: %d", state.getKey(), minPopulation);
            }
        }

        // Exiba o estado com a maior população e sua quantidade;
        Integer maxPopulation = Collections.max(states.values());
        for (Map.Entry<String, Integer> state : states.entrySet()) {
            if (state.getValue().equals(maxPopulation)) {
                System.out.printf("%nEstado com maior população: %s - População: %d", state.getKey(), maxPopulation);
            }
        }

        // Exiba a soma da população desses estados;
        int sum = 0;
        for (Integer state : states.values()) sum += state;
        System.out.printf("Soma da população dos estados: %d", sum);

        // Exiba a média da população deste dicionário de estados;
        System.out.printf("Média da população dos estados: %d", sum / states.size());

        // Remova os estados com a população menor que 4.000.000;
        states.values().removeIf(value -> value < 4000000);
        print(states);

        // Apague o dicionário de estados;
        states.clear();

        // Confira se o dicionário está vazio.
        System.out.println("O dicionário está vazio -> " + states.isEmpty());
    }
}
