import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    /*Crie uma classe LinguagemFavorita que possua os atributos
    nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
    3 linguagens e faça um programa que ordene esse conjunto
    por:

    Ordem de Inserção

    Ordem Natural (nome)

    IDE

    Ano de criação e nome

    Nome, ano de criacao e IDE

    Ao final, exiba as linguagens no console, um abaixo da outra.*/

    public static void showText(Set<Linguagem> languages) {
        for (Linguagem language: languages) {
            System.out.printf("%n Nome: %s, Ano de criação: %s, IDE: %s  ",
                    language.nome,
                    language.anoCriacao,
                    language.ide);
        }
    }

    public static void main(String[] args) {

        // Ordem de inserção
        Set<Linguagem> languages = new LinkedHashSet<>(){{
            add(new Linguagem("python", 1990, "intellij"));
            add(new Linguagem("javascript", 1993, "vscode"));
            add(new Linguagem("sql", 2000, "workbench"));
        }};
        showText(languages);
        System.out.println("");

        // Ordem natural (nome)
        Set<Linguagem> languages1 = new TreeSet<>(new comparator());
        languages1.addAll(languages);
        showText(languages1);

    }
}
