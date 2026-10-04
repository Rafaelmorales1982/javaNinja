package NivelFacil.NivelIntermefiario;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 10;
        String [] ninjas  = new String[NUMERO_MAX];


        int ninjasCadastrados = 0;
        int opcao = 0;

        while(opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1- Cadastrar Ninja");
            System.out.println("2- Listar Ninjas");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");

                    } else {
                        System.out.println("A lista de ninjas está cheia!");
                    }
                    break;

                case 2:
                    System.out.println("\n =========== Ninjas cadastrados ===========");
                    if(ninjasCadastrados == 0 ){
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        for (int i = 0; i < ninjasCadastrados ; i++) {
                            System.out.println((i + 1) + " - " + ninjas[i]);

                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
        scanner.close();
    }
}
