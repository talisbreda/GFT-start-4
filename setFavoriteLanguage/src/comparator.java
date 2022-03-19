import java.util.Comparator;

public class comparator implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem language1, Linguagem language2) {
        int nome = language1.nome.compareTo(language2.nome);
        if (nome != 0) return nome;

        int anoCriacao = Integer.compare(language1.anoCriacao, language2.anoCriacao);
        if (anoCriacao != 0) return anoCriacao;

        int ide = language1.ide.compareTo(language2.ide);
        return ide;
    }
}
