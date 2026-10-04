package NivelFacil.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         *  Dados não primitivos: String, Array, Class, enum
         *  Objetivos: Criar um ninja, e atribuir a ele.
         * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println("Nome: " + nome);
        System.out.println("Nome caixa alta: "+ nomeUpperCase);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaCaixaBaixa = aldeia.toLowerCase();
        System.out.println();
        System.out.println("Nome da aldeia: "+ aldeia);
        System.out.println("Nome da aldeia caixa baixa: "+ aldeiaCaixaBaixa);

    }
}
