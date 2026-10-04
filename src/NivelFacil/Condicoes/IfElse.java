package NivelFacil.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
        * IF e Else - Condições
        * Objetivo: Passar o ninja de nível de acordo com número de missões
        * */

        // Ninja Naruto
        String nome = "Naruto";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");//Nível 2
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");// Nível 3
        } else {
            System.out.println("Rank: Gennim ");// Nível 1
        }




    }
}
