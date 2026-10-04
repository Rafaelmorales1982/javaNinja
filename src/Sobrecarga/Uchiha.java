package Sobrecarga;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " +nome+ " e esse é meu ataque especial Sharinga número de missões: " +numeroDeMissoesConcluidas + " meu rank: "+rank + " sou da aledia: "+aldeia);
    }

@Override
    // metodo- Inteligencia de combate
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome: " + nome + " essa é minha inteligencia de combate");
    }


    @Override
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


    }




