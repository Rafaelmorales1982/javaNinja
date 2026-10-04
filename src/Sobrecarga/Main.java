package Sobrecarga;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzimaki", "Aldeia da folha",16,10,NivelNinja.CHUUNNIN );
        naruto.estrategiaDeBatalha();
        naruto.habilidadeEspecial();
        System.out.println(naruto);
        naruto.tacarKunai();
        System.out.println(naruto.altura);

        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da folha",18,10,NivelNinja.CHUUNNIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();
        sasuke.inteligenciaDeCombate(160);
        //String dados = sasuke.toString();
        //System.out.println(dados);
    }
}
