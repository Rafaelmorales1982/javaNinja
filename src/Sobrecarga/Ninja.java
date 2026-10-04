package Sobrecarga;

public class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank; // ENUM
    final double altura = 2.1;// é uma constante
    // TODO: Incluir Novos 2 atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hoakge - utilzar ENUM - porque são valores que não mudam
    public Ninja() {
    }



    //TODO NINJA VAI FAZER OBRIGATORIAMENTE
    final public void tacarKunai(){
        System.out.println("Eu sou um metodo da classe mãe!");
    }

    // Metodo existente
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga dp construtor chamada os novos atributos


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    public void estrategiaDeBatalha() {
        System.out.println(nome + ": Minha etratégia de batalha");
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }

    // metodo- Inteligencia de combate
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome: " + nome + " essa é minha inteligencia de combate");
    }

    // Sobrecarga de metodo - Inteligencia de combate
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI: " + qi + " você é um gênio");

        } else if (qi >= 130) {
            System.out.println("Seu QI: " + qi + " você é um ninja promissor");
        } else {
            System.out.println("Seu QI: " + qi + " você precisa treinar mais suas estrategias");
        }
    }


    @Override
    public String toString() {
        return " " +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                ", numeroDeMissoesConcluidas=" + numeroDeMissoesConcluidas +
                ", rank=" + rank ;
    }
}