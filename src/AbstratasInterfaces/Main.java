package AbstratasInterfaces;

public class Main {
    public static void main(String[] args) {



        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;

        naruto.nomeDoNinja();
        naruto.tacarKunai();
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("------------------------------------");
        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 17;

        sasuke.nomeDoNinja();
        sasuke.tacarKunai();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da folha", 27 );
        System.out.println(itachi.nome);
        System.out.println(itachi.aldeia);
        System.out.println(itachi.idade);
        itachi.habilidadeEspecial();



    }
}
