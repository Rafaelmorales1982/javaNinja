package NivelIntermediario3;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOunao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoria();

    public Hokages() {
    }

    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages(boolean vivoOunao) {
        this.vivoOunao = vivoOunao;
    }

    public Hokages(String nome, int idade, boolean vivoOunao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOunao = vivoOunao;
    }

    public Hokages(String nome, int idade, boolean vivoOunao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOunao = vivoOunao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
