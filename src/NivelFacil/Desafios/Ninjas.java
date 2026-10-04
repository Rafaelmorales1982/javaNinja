package NivelFacil.Desafios;

public class Ninjas {
    public static void main(String[] args) {
        //Ninja 1
        String ninja1 = "Naruto Uzumaki";
        int idade1 = 15;
        String missao1 = "Encontrar o bandido";
        String statusDaMissao1 = "Em andamento";
        char nivelDaMissao1 = 'A';

        if(idade1 < 15){
            if(nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D'){
                statusDaMissao1 = "Missão concluída";
            } else {
                statusDaMissao1 = "Missão mão cocluída, vocÊ é muito novo";
            }
        } else {
            statusDaMissao1 = "Missão conluída";
        }

        System.out.println("Nome do ninja: " + ninja1);
        System.out.println("Idade do ninja: " + idade1);
        System.out.println("Missão do ninja: " + missao1);
        System.out.println("Status da missão: " + statusDaMissao1);
        System.out.println("Nível da missão: " + nivelDaMissao1);

        System.out.println("---------------------------------------------------");
        //Ninja 2
        String ninja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        if(idade2 < 15){
            if(nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "Missão concluída";
            } else {
                statusDaMissao2= "Missão mão cocluída, vocÊ é muito novo";
            }
        } else {
            statusDaMissao2 = "Missão conluída";
        }
        System.out.println("Nome do ninja: " + ninja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missão do ninja: " + missao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("Nível da missão: " + nivelDaMissao2);

        System.out.println("---------------------------------------------------");

        //Ninja 3
        String ninja3 = "Sakura Haruno";
        int idade3 = 15;
        String missao3 = "Curar feridos da guerra";
        String statusDaMissao3 = "Concluído";
        char nivelDaMissao3 = 'D';

        if(idade3 < 15){
            if(nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D'){
                statusDaMissao3 = "Missão concluída";
            } else {
                statusDaMissao3= "Missão mão cocluída, vocÊ é muito novo";
            }
        } else {
            statusDaMissao3 = "Missão conluída";
        }

        System.out.println("Nome do ninja: " + ninja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missão do ninja: " + missao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("Nível da missão: " + nivelDaMissao3);


    }
}
