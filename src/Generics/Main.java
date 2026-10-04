package Generics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramentas(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramentas(new Shuriken(10));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invocação do sapo"));
        bolsaNinja.adicionarFerramentas(new PetNinja("Bingo"));
        System.out.println("Itens da nossa bolsa ninja: ");
        bolsaNinja.mostrarFerramentas();
    }
}
