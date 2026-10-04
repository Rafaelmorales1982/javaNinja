package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        int missoes = 11;
        String nivelDoNinja  = (missoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja esta abaixo de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
