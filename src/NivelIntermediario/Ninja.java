package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    public void sharingaAtivado() {
        System.out.println("Sharinga Ativado!");
    }

    public String euSouNinja() {
        return "Eu sou um ninja, seja bem-vindo";
    }

    public int anosOtrnarHokage(int idadeMinimaSerHokage) {
        return idadeMinimaSerHokage - this.idade;
    }


}
