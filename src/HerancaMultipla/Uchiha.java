package HerancaMultipla;

public class Uchiha  extends Ninja implements SharingaInterface{


    // Esse metodo vai vir direto da interface = a interface é um contrato
    public void sharingaAtivado() {
        System.out.println(nome+" : Ativou o Sharingan");
    }

}
