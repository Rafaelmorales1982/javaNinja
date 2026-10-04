package Encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------Naruto Uzumaki-------------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha",17,10,1.67);

        naruto.setAltura(1.72);
        System.out.println("Nome ninja: "+naruto.getNome()+" Altura: "+ naruto.getAltura());





        System.out.println("------------------Sasuke Uchiha-------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha",18,20,1.72);

        System.out.println("Nome ninja: "+sasuke.getNome()+" Altura: "+ sasuke.getAltura());
    }
}
