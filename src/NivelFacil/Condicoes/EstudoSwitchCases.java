package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao  = -1;
        while(opcao !=0) {
        System.out.println("Escolha um personagem");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchila");
        System.out.println("3 - Sakura Haruno");


        System.out.println("Digite um número para escolhar seu personagem");

        opcao = scanner.nextInt();

            System.out.println("Você digitou o número: " + opcao);

            switch (opcao) {
                case 1:
                    System.out.println("Personagem Naruto");
                    break;
                case 2:
                    System.out.println("Personagem Sasuke Uchila");
                    break;

                case 3:
                    System.out.println("Personagem Sakura Haruno");
                    break;

                default:
                    System.out.println("Oção inválida");
                    break;


            }
        }
   scanner.close();
    }
}
