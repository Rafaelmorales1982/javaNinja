package HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        // Objeto Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharingaAtivado();

        // Objeto Hatake
        Hatake Kakashi =  new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.aldeia = "Aldeia da folha";
        Kakashi.idade = 48;
        Kakashi.boasVindas();
        Kakashi.sharingaAtivado();
        Kakashi.ninjaDeElite();
        Kakashi.hokageAtivo();
    }
}
