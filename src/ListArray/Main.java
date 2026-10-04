package ListArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array são estáticos, não alteram de tamanho
        String[] ninjasArray = new String[3];

        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Nome ninja: " + ninjasArray[0]);
        System.out.println("Nome ninja: " + ninjasArray[1]);
        System.out.println("Nome ninja: " + ninjasArray[2]);

        // No Array tem que fazer um for para iterar todos elementos do array
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Ninja: " + ninjasArray[i]);

        }

        // Listas - não saão estáticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>();

        ninjasList.add("Naruto Uzumaki");// index 0
        ninjasList.add("Sasuke Uchiha");// index 1
        ninjasList.add("Sakura Haruno");// index 2
        ninjasList.add("Tobirama Senju");// index 3
        // Adicionar na lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjas na lista: "+ ninjasList);


        // Remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjas na lista: "+ ninjasList);

        // Trocar elementos
        ninjasList.set(3,"Hashirama Senju");
        System.out.println("ninjas na lista: "+ ninjasList);

        // Ver o tamanho da lista
        System.out.println("Tamanho da lista: "+ ninjasList.size() + " Elementos");


    }
}
