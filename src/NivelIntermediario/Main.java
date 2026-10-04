package NivelIntermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um ninja Naruto - é um objeto

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 17;

     // Criar um ninja Sasuke - é um objeto
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.sharingaAtivado();
        String chamandoMetodo = sasuke.euSouNinja();
        System.out.println(chamandoMetodo);
        int idadeMinima = sasuke.anosOtrnarHokage(70);
        System.out.println("Você tem : "+ sasuke.idade + " então falta : "+ idadeMinima + " anos para se tornar Hokage");

        // Criar um ninja Sakura
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura";
        sakura.aldeia = "Aldea da folha";
        sakura.idade = 18;




    }
}
