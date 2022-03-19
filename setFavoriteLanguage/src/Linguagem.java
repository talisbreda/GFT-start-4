import java.util.Objects;

public class Linguagem{
    protected String nome;
    protected int anoCriacao;
    protected String ide;

    public Linguagem(String nome, int anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem that = (Linguagem) o;
        return anoCriacao == that.anoCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }
}
