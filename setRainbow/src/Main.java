import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> rainbow = new LinkedHashSet<>(Arrays.asList(
                "red", "orange", "yellow", "green", "blue", "purple"
        ));

        // Exiba todas as cores uma abaixo da outra
        for (String color: rainbow) {
            System.out.printf("%s %n", color);
        }

        // A quantidade de cores do arco íris
        System.out.println(rainbow.size());

        // Exiba as cores em ordem alfabética
        Set<String> rainbowAlphabetical = new TreeSet<>(rainbow);
        for (String color: rainbowAlphabetical) {System.out.printf("%s %n", color);}

        // Exiba as cores na ordem inversa da que foi informada
        ArrayList<String> list = new ArrayList<>(rainbow);
        Collections.reverse(list);
        System.out.println(list);

        // Exiba todas as cores que começam com a letra v
        for (String color : rainbow) {
            if (color.charAt(0) == 'v') System.out.println(color);
        }

        // Remova todas as cores que não começam com a letra v
        rainbow.removeIf(color -> color.charAt(0) != 'v');

        // Limpe o conjunto
        rainbow.clear();

        // Confira se o conjunto está vazio
        System.out.println(rainbow.isEmpty());
    }
}

