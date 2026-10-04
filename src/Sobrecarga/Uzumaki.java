package Sobrecarga;

public class Uzumaki extends  Ninja{

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " +nome+ " e esse é meu ataque especial Sharinga número de missões: " +numeroDeMissoesConcluidas + " meu rank: "+rank + " sou da aledia: "+aldeia);
    }



}
