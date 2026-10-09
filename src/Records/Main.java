package Records;

public class Main {
    public static void main(String[] args) {


        Ninja cadastro = new Ninja("Naruto","naruto@email.com",999999999);

        System.out.println("Cadastro: " +cadastro);
        System.out.println("Nome do cadastro: "+ cadastro.getNome());


        NinjaRecord cadastro2 = new NinjaRecord("Sasuke","sasunke@email.com",888888888);
        System.out.println("Cadastro2: " + cadastro2.emailCaixaAlta());

    }
}
