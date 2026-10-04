package AbstratasInterfaces;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("Nome do ninja: " + this.nome);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " +nome+ " e esse meu ataque especial");
    }


    // Sobreescrevendo o metodo da interface
    @Override
    public  void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é " + nome + " Essa é a minha estratégia de batalha.");
    }
}

