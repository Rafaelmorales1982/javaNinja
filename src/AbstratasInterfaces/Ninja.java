package AbstratasInterfaces;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;


    public Ninja() {

    }

    public Ninja(String nome, String aldeia, int idade) {

        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public abstract void nomeDoNinja();

    public void tacarKunai(){

        System.out.println(this.nome+" Taquei uma Kunai");
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " +nome+ " e esse meu ataque especial");
    }



}
