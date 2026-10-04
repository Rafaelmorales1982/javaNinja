package HerancaMultipla;

public class Hatake  extends Ninja implements  SharingaInterface, AmbuInterface, HokageInterface {
    public void boasVindas(){
        System.out.println(nome +" : Eu sou um Hatake");
    }

    public void sharingaAtivado() {
        System.out.println(nome+" : Ativou o Sharingan");
    }

    public void ninjaDeElite(){
        System.out.println(nome + "Eu sou um ninja de Elite da Ambu");
    }

    public void hokageAtivo(){
        System.out.println(nome + ":  Eu sou Hokage");
    }
}
