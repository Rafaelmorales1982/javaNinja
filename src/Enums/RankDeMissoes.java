package Enums;

public enum RankDeMissoes {

    D("Baixa",2),
    C("Moderada",3),
    B("Confortável",4),
    A("Difícil",5),
    S("Altissíma", 12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
